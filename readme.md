### Важно! Правила именования:
```text
You will typically name your plugin <yourplugin>-maven-plugin.
Calling it maven-<yourplugin>-plugin (note "Maven" is 
at the beginning of the plugin name) is strongly 
discouraged since it's a reserved naming pattern for 
official Apache Maven plugins maintained by the 
Apache Maven team with groupId org.apache.maven.plugins. 
Using this naming pattern is an infringement 
of the Apache Maven Trademark.
```
### Создание плагина из архетипа:
```shell script
mvn archetype:generate 
  -DgroupId=org.pva 
  -DartifactId=pva-maven-plugin 
  -Dversion=0.0.1-SNAPSHOT 
  -DarchetypeGroupId=org.apache.maven.archetypes 
  -DarchetypeArtifactId=maven-archetype-mojo
```
### Внедрение плагина в проект:
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.pva</groupId>
            <artifactId>pva-maven-plugin</artifactId>
            <version>1.0-SNAPSHOT</version>
            <configuration>
                <scope>test</scope>
            </configuration>
            <executions>
                <execution>
                    <goals>
                        <goal>dependency-counter</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```