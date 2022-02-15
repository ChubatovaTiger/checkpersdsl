package A.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

object A_HttpsGithubComChubatovaTigerCheckpersdsl : GitVcsRoot({
    uuid = "5c6498e4-ef65-4fdc-906b-0e4034a9ba14"
    name = "https://github.com/ChubatovaTiger/checkpersdsl"
    url = "https://github.com/ChubatovaTiger/checkpersdsl"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "ChubatovaTiger"
        password = "credentialsJSON:f35eb8b8-9ab6-4027-acb3-84426a16e749"
    }
})
