organization := "com.turbolent"
name := "question-service"
version := "1.0-SNAPSHOT"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-feature", "-Xfatal-warnings")

resolvers += "turbolent" at "https://raw.githubusercontent.com/turbolent/mvn-repo/master/"

mainClass in Compile := Some("com.turbolent.questionServer.QuestionServer")

assemblyOutputPath in assembly := file("./question-service.jar")

libraryDependencies ++= Seq(
  "com.turbolent" %% "question-server" % "1.0-SNAPSHOT"
)
