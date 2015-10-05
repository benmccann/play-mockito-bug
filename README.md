Sample project which reproduces a memory leak with Play and Mockito

Requires that you have installed [the SBT build system](http://www.scala-sbt.org/release/tutorial/Setup.html), which is conveniently packaged for your OS

Run `sbt`. Then repeatedly run `test` and you will eventually get a `java.lang.OutOfMemoryError: Metaspace`

I expect this is some issue with the classloaders that SBT and Mockito are using

`ApplicationTest` uses Mockito in order to trigger the bug. I made 100 copies of `IntegrationTest` in order to increase memory usage and make it easier to hit an OutOfMemoryError. If you simply comment out the usage of Mockito then the bug will not be triggered
