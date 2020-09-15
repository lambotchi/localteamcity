package _Root.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.gradle

object GradleBuild : Template({
    uuid = "a7d39776-d039-420f-96ec-0e2edd78dab7"
    extId = "GradleBuild"
    name = "Gradle build"

    params {
        password("system.wfRepoPassword", "zxxf8125410e9c897aaf35dd15efe3b879d", label = "Nexus Username", description = "Nexus Password for repo.wfgmb.com", display = ParameterDisplay.HIDDEN)
        text("system.wfRepoUsername", "developer", label = "Nexus username", description = "Nexus username for repo.wfgmb.com", display = ParameterDisplay.HIDDEN, allowEmpty = true)
    }

    steps {
        gradle {
            name = "Gradle build"
            id = "RUNNER_2"
            tasks = "clean assemble"
            gradleParams = """-DwfRepoUsername=%system.wfRepoUsername% 
-DwfRepoPassword=%system.wfRepoPassword%"""
            useGradleWrapper = true
            enableDebug = true
            enableStacktrace = true
            jvmArgs = """-Dsun.jnu.encoding=UTF8 
-Dfile.encoding=UTF8"""
        }
    }
})
