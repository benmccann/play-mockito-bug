name := """test"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11"    % "test",
  "org.mockito"  % "mockito-core"    % "1.10.19" % "test"
)
