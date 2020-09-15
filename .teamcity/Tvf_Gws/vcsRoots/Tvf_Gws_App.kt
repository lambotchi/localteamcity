package Tvf_Gws.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Tvf_Gws_App : GitVcsRoot({
    uuid = "8a2360ff-62ef-4926-9cdd-bbcd15fc3867"
    extId = "Tvf_Gws_App"
    name = "app"
    url = "ssh://git@bitbucket.webbfontaine.com:7999/grails-app-ci/gws.git"
    branch = "refs/heads/devel"
    branchSpec = "+:refs/heads/(devel)"
    useTagsAsBranches = true
    authMethod = uploadedKey {
        uploadedKey = "local_teamcity_lem.pem"
    }
})
