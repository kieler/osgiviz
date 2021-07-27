/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 *
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
import * as vscode from 'vscode';
import {
    LanguageClient,
    ServerOptions,
    LanguageClientOptions,
    StreamInfo,
} from "vscode-languageclient";
import { connect, NetConnectOpts, Socket } from "net";
import { KeithErrorHandler } from "./error-handler";

let lsClient: LanguageClient;
let socket: Socket;

export async function activate(context: vscode.ExtensionContext) {
    const serverOptions: ServerOptions = createServerOptions(context);

    const clientOptions: LanguageClientOptions = {
        documentSelector: [{ scheme: "file", pattern: "**/*.{model,osgiviz}" }],
        synchronize: {
            fileEvents: vscode.workspace.createFileSystemWatcher("**/*.*"),
        },
    };

    lsClient = new LanguageClient("KIELER OSGiViz Language Server", serverOptions, clientOptions, true);

    // Setup basic connection error reporting
    const defaultErrorHandler = lsClient.createDefaultErrorHandler();
    lsClient.clientOptions.errorHandler = new KeithErrorHandler(defaultErrorHandler);

    // Inform the KLighD extension about the LS client and supported file endings
    await vscode.commands.executeCommand<string>(
        "klighd-vscode.setLanguageClient",
        lsClient,
        ["model", "osgiviz"]
    );

    console.debug("Starting Language Server...");
    lsClient.start();
}

export function deactivate() {
    return new Promise<void>((resolve) => {
        if (socket) {
            // Don't call lsClient.stop when we are connected via socket for development.
            // That call will end the LS server, leading to a bad dev experience.
            socket.end(resolve);
            return;
        }
        lsClient?.stop().then(resolve);
    });
}

/**
 * Depending on the launch configuration, returns {@link ServerOptions} that either
 * connect to a socket or start the LS as a process. It uses a socket if the
 * environment variable `OSGIVIZ_LS_PORT` is present. Otherwise it runs the jar located
 * at `server/kieler-language-server.{platform}.jar`.
 */
 function createServerOptions(context: vscode.ExtensionContext): ServerOptions {
    // Connect to language server via socket if a port is specified as an env variable
    if (typeof process.env.OSGIVIZ_LS_PORT !== "undefined") {
        const connectionInfo: NetConnectOpts = {
            port: parseInt(process.env.OSGIVIZ_LS_PORT, 10),
        };
        console.log("Connecting to language server on port: ", connectionInfo.port);

        return async () => {
            socket = connect(connectionInfo);
            const result: StreamInfo = {
                writer: socket,
                reader: socket,
            };
            return result;
        };
    } else {
        console.log("Spawning to language server as a process.");
        const lsPath = context.asAbsolutePath(
            `server/osgiviz-language-server.${getPlattformType()}.jar`
        );

        return {
            run: { command: "java", args: ["-jar", lsPath] },
            debug: { command: "java", args: ["-jar", lsPath] },
        };
    }
}

/** Returns the codename used by KIELER for current OS plattform. */
function getPlattformType(): "linux" | "win" | "osx" {
    switch (process.platform) {
        case "linux":
            return "linux";
        case "win32":
            return "win";
        case "darwin":
            return "osx";
        default:
            throw new Error(`Unknown plattform "${process.platform}".`);
    }
}
