Common.settings

libraryDependencies ++= Seq(
  cache,
  ws,
  filters,
  json,
  "com.typesafe"           %  "config"             % "1.2.1" withSources(),
  //
  "org.scalatestplus"      %% "play"               % "1.4.0-M3" % "test" withSources(),
  "junit"                  %  "junit"              % "4.8.1" % "test"
)
