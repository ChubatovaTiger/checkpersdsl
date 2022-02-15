package A.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*

object A_A : BuildType({
    uuid = "d2d1f0e0-97e8-4b36-b8a1-335f66f98d26"
    name = "a"

    vcs {
        root(A.vcsRoots.A_HttpsGithubComChubatovaTigerChubatovaGradleTestsBackup)
    }
})
