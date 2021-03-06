name := "ghpull-request-project"

resolvers += Classpaths.typesafeResolver

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

	
addSbtPlugin("com.typesafe.startscript" % "xsbt-start-script-plugin" % "0.5.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.5.0")

//addSbtPlugin("com.typesafe.sbt" % "sbt-start-script" % "0.5.3")

// Use the Play sbt plugin for Play projects
//addSbtPlugin("play" % "sbt-plugin" % "2.0.1")
