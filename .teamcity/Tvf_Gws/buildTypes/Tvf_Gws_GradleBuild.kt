package Tvf_Gws.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Tvf_Gws_GradleBuild : BuildType({
    template(_Root.buildTypes.GradleBuild)
    uuid = "350bb768-269d-4870-ab25-cb7eae47bd39"
    extId = "Tvf_Gws_GradleBuild"
    name = "Gradle Build"

    vcs {
        root(Tvf_Gws.vcsRoots.Tvf_Gws_App)

    }

    triggers {
        vcs {
            id = "vcsTrigger"
            branchFilter = "+:refs/heads/devel"
        }
    }
})
