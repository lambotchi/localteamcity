package Tvf_Gws.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Tvf_Gws_App : GitVcsRoot({
    uuid = "1c1a2323-9877-4923-af69-e2bd6eff2723"
    extId = "Tvf_Gws_App"
    name = "app"
    url = "ssh://git@bitbucket.webbfontaine.com:7999/grails-app-ci/gws.git"
    branch = "refs/heads/devel"
    useTagsAsBranches = true
    authMethod = uploadedKey {
        uploadedKey = "local_teamcity_lem.pem"
    }
})
