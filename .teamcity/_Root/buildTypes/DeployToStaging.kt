package _Root.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object DeployToStaging : Template({
    uuid = "54be0b16-86ab-4070-bb19-55d1fa517682"
    extId = "DeployToStaging"
    name = "Deploy Container to Staging"
})
