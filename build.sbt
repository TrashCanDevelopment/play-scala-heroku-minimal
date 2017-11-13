name := """play-scala-starter-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "com.h2database" % "h2" % "1.4.196"

libraryDependencies ++= Seq(
  "com.typesafe.play" % "play-jdbc_2.12" % "2.6.0-RC2",
  "com.typesafe.play" % "play-jdbc-api_2.12" % "2.6.0-RC2",
  "com.typesafe.play" % "play-jdbc-evolutions_2.12" % "2.6.0-RC2",
  "com.typesafe.play" % "play-java-jdbc_2.12" % "2.6.0-RC2"
)

dependencyOverrides ++= Seq(
  "com.typesafe.play" % "play-jdbc_2.12" % "2.6.0-RC2",
  "com.typesafe.play" % "play-jdbc-api_2.12" % "2.6.0-RC2",
  "com.typesafe.play" % "play-jdbc-evolutions_2.12" % "2.6.0-RC2",
  "com.typesafe.play" % "play-java-jdbc_2.12" % "2.6.0-RC2"
)
