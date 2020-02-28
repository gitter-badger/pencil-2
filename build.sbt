scalaVersion := "2.13.1"

val catsVersion     = "2.1.0"
val fs2Version = "2.2.1"
val http4sVersion   = "0.21.0-M6"
val specs2Version   = "4.8.3"
val logbackVersion  = "1.2.3"
val circeVersion    = "0.12.3"
val monocleVersion  = "2.0.0"

lazy val root = (project in file("."))
  .settings(

    organization := "com.minosiatns",
    name := "smtp-client",
    version := "0.0.1",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      "org.typelevel"              %% "cats-core"                  % catsVersion,
      "co.fs2" %% "fs2-core" % fs2Version,
      "org.http4s"                 %% "http4s-blaze-client"        % http4sVersion,
      "org.http4s"                 %% "http4s-circe"               % http4sVersion,
      "org.http4s"                 %% "http4s-dsl"                 % http4sVersion,
      "io.circe"                   %% "circe-core"                 % circeVersion,
      "io.circe"                   %% "circe-generic"              % circeVersion,
      "io.circe"                   %% "circe-parser"               % circeVersion,
      "com.github.julien-truffaut" %% "monocle-core"               % monocleVersion,
      "com.github.julien-truffaut" %% "monocle-macro"              % monocleVersion,
      "org.specs2"                 %% "specs2-core"                % specs2Version % "test",
      "com.codecommit"             %% "cats-effect-testing-specs2" % "0.3.0",
      "ch.qos.logback"             % "logback-classic"             % logbackVersion
    ),
    addCompilerPlugin("org.typelevel" %% "kind-projector"     % "0.10.3")
  )
