## Anleitung

Das Plugin unter `<build><plugins>snippet</plugins><build>` einfügen. Die wichtigen Parameter die konfiguriert werden müssen sind:


**`<projectNames>`**

Die Namen der einzelnen Projekte, die dann so auch in der Dokumentation als Beschreiber verwendet werden.

**`<projectPaths>`**

Die lokalen Pfade zu den Projektordnern.

**`<projectJavadocUrls>`**

Wenn vorhanden, die URL zum javadoc der Projekte. Falls nicht vorhanden, einfach weglassen, das <projectJavadocUrls> wird aber benötigt.

**`<modelSaveFilePath>`**

Der Pfad wo die Modelle abgelegt werden soll. Falls keiner angegeben wird, werden keine Modelle gespeichert.

Run Configuration:

Für die run configuration sollten folgende Goals gesetzt sein: 

**`clean -X de.scheidtbachmann.common.osgimodel:model.generate:generate-documentation -N -Dmaven.test.skip=true -Dtycho.localArtifacts=ignore`**

`de.scheidtbachmann.common.osgimodel:model.generate:generate-documentation:` Ruft das maven plugin mit dem goal generate-documentation auf.<br>
`-X`: für debug logging, wenn gewünscht<br>
`-N`: non-recursive, es wird nur die parent-pom beachtet<br>
`-Dmaven.test.skip=true`: Tests übersrpingen<br>
`-Dtycho.localArtifacts=ignore`: Lokale Build Artefakte werden ignoriert<br>

```
<plugin>
	<groupId>de.scheidtbachmann.common.osgimodel</groupId>
    <artifactId>model.generate</artifactId>
	<version>1.0.0</version>
	<inherited>false</inherited>
	<configuration>
		<projectNames>
			<example1>ExampleName</example1>
			<example2>ExampleName2</example2>
		</projectNames>
		<projectPaths>	
			<example1>C:\ws_intern\svn\example1\src\example1\java</example1>
			<example2>C:\ws_intern\svn\example2\src\example2\java</example2>
		</projectPaths>
		<projectJavadocUrls>
			<example1[...]site/trunk/apidocs/index.html</example1>
			<example2>[...]site/trunk/apidocs/index.html</example2>
		</projectJavadocUrls>
       		<modelSaveFilePath>
   			${project.basedir}/OSGiModel/models
		</modelSaveFilePath>
	</configuration>
</plugin>
```
