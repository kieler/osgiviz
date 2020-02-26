# osgiviz

osgiviz is a tool for automatic and interactive visualization and documentation of Java projects using the OSGi&trade; technology.
![An example visualization of bundle and service dependencies in a project.](./doc/osgiviz_example.png)
It uses the KIELER Lightweight Diagrams (KLighD) framework
and provides a synthesis with interactivity
that can be used to display a diagram of an OSGi model file within Eclipse applications. 
Model files can be generated with the included model generator plugin
that currently works as a Maven mojo for OSGi projects using PDE tooling. See [the generator readme](./plugins/de.scheidtbachmann.osgimodel.model.generate/readme.md) for more details.

## Installing osgiviz
As there is no release for this project yet,
it has to be installed via our nightly update sites.
For the visualization you need to install features in Eclipse from two different update sites.
The visualization is available in the OpenKieler/osgiviz update site:

`http://rtsys.informatik.uni-kiel.de/~kieler/updatesite/nightly-openkieler/osgiviz/`

Together with that the *KIELER Lightweight Diagrams Generic Diagram View* feature from the KIELER Pragmatics update site needs to be installed to install the view showing the diagrams:

`http://rtsys.informatik.uni-kiel.de/~kieler/updatesite/nightly/pragmatics/`

These can be installed in Eclipse via the *Help -> Install new Software* menu.

To view the diagram to a model,
open said model with the now-installed *Osgimodel Model Editor*
and open the diagram view via *Window -> Show view -> Other... -> KIELER Lightweight Diagrams -> Diagram*.

## The OSGi models
To generate a model file visualizable with osgiviz, have a look at the readme in the [osgimodel.model.generate bundle](https://github.com/OpenKieler/osgiviz/tree/master/plugins/de.scheidtbachmann.osgimodel.model.generate).
