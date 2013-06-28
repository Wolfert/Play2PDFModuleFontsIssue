import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "pdfmodulefonts"
  val appVersion      = "1.0-SNAPSHOT"
  val pdf             = "pdf" % "pdf_2.10" % "0.5"


  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    pdf
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
