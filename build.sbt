assemblySettings

name := "SantimentAnalysis_BagOfWords_Model"

version := "1.0"

scalaVersion := "2.10.5"
ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }
libraryDependencies ++= Seq(
  "org.apache.predictionio"    %% "apache-predictionio-core"          % "0.10.0-incubating" % "provided",
  "org.apache.spark" %% "spark-core"    % "1.5.1" % "provided",
  "org.apache.spark" %% "spark-mllib"   % "1.5.1" % "provided"
  )
cancelable in Global := true
mainClass in Compile := Some("MyApp1")
enablePlugins(JavaAppPackaging) 