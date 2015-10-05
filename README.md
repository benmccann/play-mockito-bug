Sample project which reproduces a memory leak with Play and Mockito
Run `sbt`. Then repeatedly run `test` and you will eventually get a `java.lang.OutOfMemoryError: Metaspace`
I expect this is some issue with the classloaders that SBT and Mockito are using
