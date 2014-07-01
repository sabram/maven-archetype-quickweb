##maven-archetype-quickweb
========================
Maven archetype to create an application with a directory layout that is essentially a combination of the directory structure you
get with the standard maven archetypes of quickstart and webapp.
More specifically, this archetype creates a project with the following layout:

```
my-app
|-- pom.xml
|-- src
|   -- main
|      -- resources
|      -- java
|         -- com
|            -- yourcompany
|               -- App.java
|   -- test
|      -- resources
|      -- java
|         -- com
|            -- yourcompany
|               -- AppTest.java
|   -- webapp
|      -- index.jsp
|      -- WEB-INF
|         -- web.xml
```

To use:
1. Clone from git

$ git clone git://github.com/sabram/maven-archetype-quickweb.git

2. Install to your local repo

$ mvn install archetype:update-local-catalog

Notes:
* Do this from the maven-archetype-quickweb directory
* You should now see the project in your local maven repo. For example:
** Mac: ~/.m2/repository/com/shaunabram/maven-archetype-quickweb
** Windows: ${user.home}\.m2\repository\com\shaunabram\maven-archetype-quickweb

3. Run to generate your own project:
$ mvn archetype:generate
-DarchetypeGroupId=com.shaunabram
-DarchetypeArtifactId=maven-archetype-quickweb
-DarchetypeVersion=1.0-SNAPSHOT
-DgroupId=<my.groupid>
-DartifactId=<my-artifactId>
Replacing <my.groupid>  and <my-artifactId> as appropriate.
For example:
mvn archetype:generate -DarchetypeGroupId=com.shaunabram -DarchetypeArtifactId=maven-archetype-quickweb -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.yourcompany -DartifactId=yourProjectName

Links:
* http://svn.apache.org/repos/asf//maven/archetypes/trunk/maven-archetype-quickstart/
* http://stackoverflow.com/questions/12634890/maven-archetype-quickstart-with-resources-folder
* http://maven.apache.org/guides/mini/guide-creating-archetypes.html
* http://maven.apache.org/archetype/maven-archetype-plugin/specification/archetype-metadata.html
* https://code.google.com/p/jianwikis/wiki/HowToCreateMavenArchetypeFromProject
* http://stackoverflow.com/questions/13499873/how-to-use-my-custom-archetype-with-maven
