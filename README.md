Sample project which reproduces a memory leak with Play's tests - [Issue #5144](https://github.com/playframework/playframework/issues/5144)

Requires that you have installed [the SBT build system](http://www.scala-sbt.org/release/tutorial/Setup.html), which is conveniently packaged for your OS

Run `sbt`. Then repeatedly run `test` and you will eventually get a `java.lang.OutOfMemoryError: Metaspace`

I made 100 copies of `IntegrationTest` in order to increase memory usage and make it easier to hit an OutOfMemoryError
