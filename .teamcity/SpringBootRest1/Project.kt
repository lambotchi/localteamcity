package SpringBootRest1

import SpringBootRest1.buildTypes.*
import SpringBootRest1.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "61291c41-0f70-4324-b303-557348187934"
    extId = "SpringBootRest1"
    parentId = "_Root"
    name = "Spring Boot Rest1"

    vcsRoot(SpringBootRest1_HttpsGithubComLambotchiSpringBootRest1gitRefsHeadsMaster)

    buildType(SpringBootRest1_Build)

    params {
        param("t1", "")
    }
})
