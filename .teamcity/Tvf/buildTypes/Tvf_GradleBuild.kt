package Tvf.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Tvf_GradleBuild : BuildType({
    template(_Root.buildTypes.GradleBuild)
    uuid = "7e58bc01-67e8-4805-8326-3a5237c64a0d"
    extId = "Tvf_GradleBuild"
    name = "Gradle Build"

    vcs {
        root(Tvf.vcsRoots.Tvf_App)

    }

    triggers {
        vcs {
            id = "vcsTrigger"
            branchFilter = "+:refs/heads/devel"
        }
    }
})
