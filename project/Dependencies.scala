import sbt._
import sbt.Keys._

object Dependencies {

  val zioVersion = "1.0.9"
  val zioTest = List(
    "dev.zio" %% "zio-test"     % zioVersion % "test",
    "dev.zio" %% "zio-test-sbt" % zioVersion % "test" // ,
    // "dev.zio" %% "zio-test-magnolia" % zioVersion % "test" // optional
  )

}
