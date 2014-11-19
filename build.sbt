import play.PlayScala

name := "Play mirror test"

scalaVersion := "2.11.4"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

val scalaReflect = Def.setting {
  "org.scala-lang" % "scala-reflect" % scalaVersion.value
}

libraryDependencies += scalaReflect.value

libraryDependencies += "org.specs2" %% "specs2-core" % "2.4.11" % "test"

unmanagedJars in Compile += baseDirectory.value / "lib" / "clazzParamLib.jar"