package _Root.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.gradle

object GradleBuild : Template({
    uuid = "a7d39776-d039-420f-96ec-0e2edd78dab7"
    extId = "GradleBuild"
    name = "Gradle build"

    steps {
        gradle {
            name = "Gradle build"
            id = "RUNNER_2"
            tasks = "clean assemble"
            useGradleWrapper = true
            enableStacktrace = true
            jdkHome = "%env.JDK_18_x64%"
        }
    }
})
