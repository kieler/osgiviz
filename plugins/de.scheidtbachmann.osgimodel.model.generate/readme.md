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

`clean -X de.scheidtbachmann.common.osgimodel:model.generate:generate-documentation -N -Dmaven.test.skip=true -Dtycho.localArtifacts=ignore`

`de.scheidtbachmann.common.osgimodel:model.generate:generate-documentation:` Ruft das maven plugin mit dem goal generate-documentation auf.

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
			<ibs>IBS</ibs>
			<gpGraphics>GP Graphics</gpGraphics>
			<gpDialogs>GP Dialogs</gpDialogs>
			<gpNatTable>GP NatTable</gpNatTable>
			<gpOsgi>GP OSGi</gpOsgi>
		</projectNames>
		<projectPaths>			
			<ibs>C:\ws_intern\svn\IBS\src\ibs\java</ibs>
			<gpNatTable>C:\ws_intern\svn\GenericProducts\src\gp\java\p2Repositories\NatTable</gpNatTable>
			<gpOsgi>C:\ws_intern\svn\GenericProducts\src\gp\java\p2Repositories\osgi</gpOsgi>
			<gpGraphics>C:\ws_intern\svn\GenericProducts\src\gp\java\p2Repositories\Graphics</gpGraphics>
			<gpDialogs>C:\ws_intern\svn\GenericProducts\src\gp\java\p2Repositories\Dialogs</gpDialogs>
		</projectPaths>
		<projectJavadocUrls>
			<ibs>http://ki-vl-statweb.ki.lan/docs/ibs/site/trunk/apidocs/index.html</ibs>
			<gpOsgi>http://ki-vl-statweb.ki.lan/docs/gp/osgi/site/trunk/apidocs/</gpOsgi>
			<gpGraphics>http://ki-vl-statweb.ki.lan/docs/gp/graphics/site/trunk/apidocs/</gpGraphics>
			<gpDialogs>http://ki-vl-statweb.ki.lan/docs/gp/dialogs/site/trunk/apidocs/</gpDialogs>
			<gpNatTable>http://ki-vl-statweb.ki.lan/docs/gp/nattable/site/trunk/apidocs/</gpNatTable>
		</projectJavadocUrls>
        <modelSaveFilePath>
   			${project.basedir}/OSGiModel/models
		</modelSaveFilePath>
	</configuration>
</plugin>
```
