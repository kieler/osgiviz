/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 *
 * Copyright 2021-2024 by
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

import { window } from "vscode";
import {
    CloseHandlerResult,
    ErrorHandler,
    ErrorHandlerResult,
    Message,
} from "vscode-languageclient";

/**
 * Simple LS connection error handling that informs the user about encountered
 * errors.
 */
export class KeithErrorHandler implements ErrorHandler {
    constructor(private defaultHandler: ErrorHandler) {}

    error(error: Error, message: Message, count: number): ErrorHandlerResult | Promise<ErrorHandlerResult> {
        window.showErrorMessage("Connection to KIELER OSGiViz Language Server produced an error!");
        console.error(error);

        return this.defaultHandler.error(error, message, count);
    }

    closed(): CloseHandlerResult | Promise<CloseHandlerResult> {
        window.showErrorMessage("Connection to KIELER OSGiViz Language Server got closed!");

        return this.defaultHandler.closed();
    }
}
