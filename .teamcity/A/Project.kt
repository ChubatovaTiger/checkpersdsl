package A

import A.buildTypes.*
import A.vcsRoots.*
import A.vcsRoots.A_HttpsGithubComChubatovaTigerCheckpersdsl
import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "73348007-2edf-4396-abe1-514d82d53881"
    id("A")
    parentId("_Root")
    name = "a"

    vcsRoot(A_HttpsGithubComChubatovaTigerCheckpersdsl)
    vcsRoot(A_HttpsGithubComChubatovaTigerChubatovaGradleTestsBackup)

    buildType(A_A)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${A_HttpsGithubComChubatovaTigerCheckpersdsl.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
