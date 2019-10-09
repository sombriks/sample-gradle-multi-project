# sample-gradle-multi-project

Figuring out how to make the build of big projects more efficient

On gradle, parent project means all subprojects inherits from it certain configurations.
It's possible to configure `jcenter()` but not possible to define dependencies.

Also, one subproject can rely to another as dependency, yet each one keeps its own build life cycle.

