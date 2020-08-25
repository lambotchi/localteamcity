package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object HttpsGithubComLambotchiLocalteamcityGit : GitVcsRoot({
    uuid = "eb328da9-7d26-4c4b-ade7-4713479a6548"
    extId = "HttpsGithubComLambotchiLocalteamcityGit"
    name = "https://github.com/lambotchi/localteamcity.git"
    url = "https://github.com/lambotchi/localteamcity.git"
    authMethod = password {
        userName = "lambotchi"
        password = "zxx6cf95d9f00a005fbb497b2e4c59ff4f5"
    }
})
