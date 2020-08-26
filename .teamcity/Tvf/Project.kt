package Tvf

import Tvf.buildTypes.*
import Tvf.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "08d373b0-83b8-467a-91ad-8d488dbcc23f"
    extId = "Tvf"
    parentId = "Cg"
    name = "TVF"

    vcsRoot(Tvf_App)

    buildType(Tvf_Tvf)
})
