name := "play-server-terminate-timeout"

version := "1.0"

lazy val root = (project in file("."))
  .settings(
    // For akka setting
    (Runtime / unmanagedClasspath) += baseDirectory.value / "conf"
  )
  .enablePlugins(PlayScala)

resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(guice)
