import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2021.2"

project {

    vcsRoot(BuildsNumberLimit_HttpsGithubComChubatovaTigerCloudProfilesXML)

    buildType(BuildsNumberLimit_BuildsNumberLimit)
}

object BuildsNumberLimit_BuildsNumberLimit : BuildType({
    id("BuildsNumberLimit")
    name = "buildsNumberLimit"

    maxRunningBuilds = 0
    maxRunningBuildsPerBranch = """
        new-branch!+&#"*:1
        pull/*:2
    """.trimIndent()

    vcs {
        root(AbsoluteId("GitHub"))
    }

    steps {
        script {
            scriptContent = "sleep 100"
        }
    }
})

object BuildsNumberLimit_HttpsGithubComChubatovaTigerCloudProfilesXML : GitVcsRoot({
    id("HttpsGithubComChubatovaTigerCloudProfilesXML")
    name = "https://github.com/ChubatovaTiger/cloudProfilesXML"
    url = "https://github.com/ChubatovaTiger/cloudProfilesXML"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "ChubatovaTiger"
        password = "credentialsJSON:d55ac7e1-70e9-43d5-a101-541aef084a29"
    }
})
