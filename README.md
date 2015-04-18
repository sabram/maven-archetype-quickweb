##maven-archetype-quickweb
========================
Maven archetype to create a new project with a layout that is essentially a combination of what you
get with the standard maven archetypes of [quickstart](http://maven.apache.org/archetype/maven-archetype-bundles/maven-archetype-quickstart/) and [webapp](http://maven.apache.org/archetype/maven-archetype-bundles/maven-archetype-webapp/).
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

####1. Clone from git

`$ git clone git://github.com/sabram/maven-archetype-quickweb.git`

####2. Install to your local repo

`$ mvn install archetype:update-local-catalog`

Notes:

* Do this from the maven-archetype-quickweb directory
* You should now see the project in your local maven repo. For example:
    * Mac: ~/.m2/repository/com/shaunabram/maven-archetype-quickweb`
    * Windows: ${user.home}\.m2\repository\com\shaunabram\maven-archetype-quickweb`

####3. Run to generate your own project:

```
$ mvn archetype:generate
-DarchetypeGroupId=com.shaunabram
-DarchetypeArtifactId=maven-archetype-quickweb
-DarchetypeVersion=1.0-SNAPSHOT
-DgroupId=<my.groupid>
-DartifactId=<my-artifactId>
```
Replacing &lt;my.groupid&gt;  and &lt;my-artifactId&gt; as appropriate.
For example:

```mvn archetype:generate -DarchetypeGroupId=com.shaunabram -DarchetypeArtifactId=maven-archetype-quickweb -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.yourcompany -DartifactId=yourProjectName```



####See also
[My blog post](http://www.shaunabram.com/maven-archetype-quickweb/).

####Problems
If you get an error like this:
```
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD FAILURE
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 5.299 s
    [INFO] Finished at: 2015-04-18T16:32:52-08:00
    [INFO] Final Memory: 16M/245M
    [INFO] ------------------------------------------------------------------------
    [ERROR] Failed to execute goal org.apache.maven.plugins:maven-archetype-plugin:2.3:generate (default-cli) on project yourProjectName:
org.apache.maven.archetype.exception.InvalidPackaging: Unable to add module to the current project as it is not of packaging type 'pom'
```
Then check the directory you are running the mvn archetype:generate command from. It cannot have a pom.xml file in it already.
