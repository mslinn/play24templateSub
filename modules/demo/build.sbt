Common.settings

resolvers += "micronautics/play on bintray" at "http://dl.bintray.com/micronautics/play"

libraryDependencies ++= Seq(
  cache,
  ws,
  filters,
  json,
  "com.typesafe.play"      %% "play-mailer"        % "3.0.1" withSources(),
  "com.typesafe.akka"      %% "akka-slf4j"         % "2.3.9",
  "org.webjars"            %% "webjars-play"       % "2.4.0-2",
  "org.webjars"            %  "bootstrap"          % "3.1.1-2",
  "com.typesafe"           %  "config"             % "1.2.1" withSources(),
  "com.github.nscala-time" %% "nscala-time"        % "2.0.0" withSources(),
  "org.webjars"            %  "ckeditor"           % "4.5.4",
  "org.webjars"            %  "jquery-ui"          % "1.10.2-1",
  "org.webjars"            %  "jquery-ui-themes"   % "1.10.0",
  "com.micronautics"       %% "play-access-logger" % "1.1.1" withSources(),
  //
  "org.scalatestplus"      %% "play"               % "1.4.0-M3" % "test" withSources(),
  "junit"                  %  "junit"              % "4.8.1" % "test"
)
