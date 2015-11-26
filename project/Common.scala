import play.sbt.PlayImport._
import sbt._
import Keys._

object Common {
  val settings: Seq[Setting[_]] = Seq(
    organization := "com.micronautics",
    version := "0.0.1",
    scalaVersion := "2.11.7",
		scalacOptions ++= Seq(
			"-deprecation",            // Emit warning and location for usages of deprecated APIs.
			"-feature",                // Emit warning and location for usages of features that should be imported explicitly.
			"-unchecked",              // Enable additional warnings where generated code depends on assumptions.
			"-Xfatal-warnings",        // Fail the compilation if there are any warnings.
			"-Xlint",                  // Enable recommended additional warnings.
			"-Ywarn-adapted-args",     // Warn if an argument list is modified to match the receiver.
			"-Ywarn-dead-code",        // Warn when dead code is identified.
			"-Ywarn-inaccessible",     // Warn about inaccessible types in method signatures.
			"-Ywarn-nullary-override", // Warn when non-nullary overrides nullary, e.g. def foo() over def foo.
			"-Ywarn-numeric-widen"     // Warn when numerics are widened.
  	),
		libraryDependencies ++= Seq(
      cache,
		  filters,
      ws,
      json,
      "com.typesafe.play"      %% "play-mailer"        % "3.0.1" withSources(),
      "com.typesafe.akka"      %% "akka-slf4j"         % "2.3.9",
      "org.webjars"            %  "bootstrap"          % "3.1.1-2",
      "com.typesafe"           %  "config"             % "1.2.1" withSources(),
      "com.github.nscala-time" %% "nscala-time"        % "2.0.0" withSources(),
      "org.webjars"            %% "webjars-play"       % "2.4.0-2" withSources(),
      "org.webjars"            %  "jquery-ui"          % "1.10.2-1",
      "org.webjars"            %  "jquery-ui-themes"   % "1.10.0",
      //
      "org.scalatestplus"      %% "play"               % "1.4.0-M3" % "test" withSources(),
      "junit"                  %  "junit"              % "4.8.1" % "test"
		)
  )
}

