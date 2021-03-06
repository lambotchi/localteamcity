package _Root

import _Root.buildTypes.*
import _Root.vcsRoots.*
import _Root.vcsRoots.HttpsGithubComLambotchiLocalteamcityGit
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "f681c234-3bda-44a8-af6d-60fe6a39f58d"
    extId = "_Root"
    name = "<Root project>"
    description = "Contains all other projects"

    vcsRoot(HttpsGithubComLambotchiLocalteamcityGit)

    template(DeployContainerToQa)
    template(DeployToStaging)
    template(DockerBuild)
    template(DeployContainerToProd)
    template(DeployContainerToDev)
    template(GradleBuild)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_CURRENT_SETTINGS
            rootExtId = HttpsGithubComLambotchiLocalteamcityGit.extId
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }

    cleanup {
        preventDependencyCleanup = false
    }
})
