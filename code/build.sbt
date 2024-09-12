organization := "com.github.quixotik"

name := "play-easymail"
version := "3.0.5"

crossScalaVersions := Seq("2.13.14", "3.3.1")
scalaVersion := crossScalaVersions.value.head

libraryDependencies ++= Seq(
  "org.playframework" %% "play-mailer" % "10.0.0",
  "org.playframework" %% "play-mailer-guice" % "10.0.0",
  guice
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)

releasePublishArtifactsAction := PgpKeys.publishSigned.value
