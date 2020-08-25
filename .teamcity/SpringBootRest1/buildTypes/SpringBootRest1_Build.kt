package SpringBootRest1.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object SpringBootRest1_Build : BuildType({
    uuid = "2d9927c8-e28a-4c46-b967-5886ddb126d3"
    extId = "SpringBootRest1_Build"
    name = "Build"

    artifactRules = "build/libs/app1.jar"

    params {
        param("param1", "")
        param("system.sysParam1", "")
    }

    vcs {
        root(SpringBootRest1.vcsRoots.SpringBootRest1_HttpsGithubComLambotchiSpringBootRest1gitRefsHeadsMaster)

    }

    steps {
        gradle {
            tasks = "clean bootJar"
            useGradleWrapper = true
        }
    }

    triggers {
        vcs {
        }
    }
})
