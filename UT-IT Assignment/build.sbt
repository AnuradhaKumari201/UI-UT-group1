name := "UT-IT Assignment"

version := "1.0"

scalaVersion := "2.13.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % "test"
val scalatest_dependency= "org.scalatest" %% "scalatest" % "3.2.2" % "test"
val mockito_dependency= "org.mockito" %% "mockito-scala" % "1.5.12" % "test"
lazy val module_For_Ques1_Ques2 = project.in(file("module_For_Ques1_Ques2")).settings(
  libraryDependencies +=scalatest_dependency
)
lazy val module_For_Ques3 = project.in(file("module_For_Ques3")).settings(
  libraryDependencies ++=Seq(scalatest_dependency, mockito_dependency)
)

lazy val root = project.in(file(".")).aggregate(module_For_Ques1_Ques2,module_For_Ques3)

