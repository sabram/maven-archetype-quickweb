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

See also [my blog post on this](http://www.shaunabram.com/maven-archetype-quickweb/).
