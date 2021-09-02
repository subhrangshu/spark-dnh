name := "Spark DNH"

version := "1.0"

scalaVersion := "2.11.8"

idePackagePrefix := Some("org.example.dnh")

val sparkVersion = "2.4.2"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion
)

libraryDependencies += "com.datastax.spark" % "spark-cassandra-connector_2.11" % sparkVersion % "provided"

libraryDependencies += "com.twitter" % "jsr166e" % "1.1.0"

libraryDependencies += "net.liftweb" %% "lift-json" % "3.4.3"