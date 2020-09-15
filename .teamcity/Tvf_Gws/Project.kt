package Tvf_Gws

import Tvf_Gws.buildTypes.*
import Tvf_Gws.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "cde3e0e3-d44b-4f8f-b11e-01ba4648554e"
    extId = "Tvf_Gws"
    parentId = "Cg"
    name = "GWS"

    vcsRoot(Tvf_Gws_App)

    buildType(Tvf_Gws_GradleBuild)
})
