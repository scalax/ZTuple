val rootFile    = file(".")
val modulesFile = rootFile / "modules"

val ztuple3        = project in modulesFile / "ztuple3"
val ztuple3Codegen = project in modulesFile / "ztuple3-codegen"

ZTupleSettings.commonSettings()

addCommandAlias("codegen3", "ztuple3Codegen/run")
