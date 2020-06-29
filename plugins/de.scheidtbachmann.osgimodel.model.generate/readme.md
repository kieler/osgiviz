# OSGi Model Generator
The OSGi model generator is a tool for analyzing workspaces for projects using the OSGi technology and persisting its structure of bundles, products, features, services and more into an EMF model. Generating such a model is the first step of using osgiviz for the visualization of OSGI-based projects. 

## How to build
The generator is built into the main Maven build of osgiviz and can therefore be built with calling `mvn clean build` in the `build` folder of this repository. That will build the P2 update site for osgiviz as well as a fat jar for the model generation. That file will be located in `plugins/de.scheidtbachmann.osgimodel.model.generate/target/de.scheidtbachmann.osgimodel.model.generate-0.1.0-SNAPSHOT` after a successful build.

Alternatively, this can be build in the usual development Eclipse set up with [the Oomph osgiviz setup](https://github.com/OpenKieler/config/blob/master/OsgiViz.setup) and executed as a Java application with using ConfigAndExecuteCli as the main class.

## How to download
Building the fat jar is also included in our nightly build, so instead of building this for yourself, you can also download the generator of the latest nightly build directly from [https://rtsys.informatik.uni-kiel.de/~kieler/files/nightly/osgiviz/cli/](https://rtsys.informatik.uni-kiel.de/~kieler/files/nightly/osgiviz/cli/) or from a previous release from [https://github.com/kieler/osgiviz/releases](https://github.com/kieler/osgiviz/releases).

## How to use
To execute the model generator, you need to feed it with the follwing parameters:

**`-N, --names`**

The Names of all projects that should be documented. The names will be used as their descriptor.

**`-P, --paths`**

The local paths to the folders of the projects that should be documented.

**`-J, --javadocs`**

The URLs to the javadoc of all projects, if available. Optional parameter.

**`-S, -O, --output`**

The output path where the model is saved. Mandatory parameter.

An example:

`java -jar de.scheidtbachmann.osgimodel.model.generate-0.1.0-SNAPSHOT.jar -N LanguageDemo=LanguageDemo -P LanguageDemo=[path/to/project]/src/LanguageDemo/ -S /home/[username]/Documents/OSGi/generated-models/`

This will generate an OSGi model file for the Language Demo project in `/home/[username]/Documents/OSGi/generated-models/LanguageDemo.model`.
This file can then be imported into an Eclipse with the installed osgiviz and visualized there.
