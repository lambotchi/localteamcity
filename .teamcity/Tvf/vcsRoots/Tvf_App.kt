package Tvf.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Tvf_App : GitVcsRoot({
    uuid = "dcbbc1ee-f5fd-4e55-9e30-d49414a6c693"
    extId = "Tvf_App"
    name = "app"
    url = "ssh://git@bitbucket.webbfontaine.com:7999/grails-app/tvf.git"
    branch = "refs/heads/devel"
    useTagsAsBranches = true
    authMethod = uploadedKey {
        uploadedKey = "local_teamcity_lem.pem"
    }
})
