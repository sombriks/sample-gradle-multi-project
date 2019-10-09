# sample-gradle-multi-project

Figuring out how to make the build of big projects more efficient

On gradle, parent project means all subprojects inherits from it certain configurations.
It's possible to configure `jcenter()` but not possible to define dependencies.

Also, one subproject can rely to another as dependency, yet each one keeps its own build life cycle.

Build commands can be issued directly from parent project. For example, only the _webproject_
has the [gretty](http://akhikhl.github.io/gretty-doc/Gretty-configuration.html) plugin, but it can
be reached on parent project.

Run `gradle appRun` on this folder yet the correct project will spin.

Sample output:

```bash
$ gradle clean build
:libraryproject1:clean
:webproject:clean
:libraryproject1:compileJava
:libraryproject1:processResources
:libraryproject1:classes
:libraryproject1:jar
:libraryproject1:assemble
:libraryproject1:compileTestJava
:libraryproject1:processTestResources
:libraryproject1:testClasses
:libraryproject1:test
:libraryproject1:check
:libraryproject1:build
:webproject:compileJava
:webproject:processResources
:webproject:classes
:webproject:war
:webproject:assemble
:webproject:compileTestJava
:webproject:processTestResources
:webproject:testClasses
:webproject:test
:webproject:check
:webproject:build

BUILD SUCCESSFUL in 1s
14 actionable tasks: 14 executed
```
