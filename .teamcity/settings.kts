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

version = "2018.2"

project {

    vcsRoot(HttpsGithubComAChubatovaCheckpers)

    buildType(Negative)
    buildType(Positive)

    params {
        param("rootpar", "rootparbal2")
    }
}

object Negative : BuildType({
    name = "negative"

    vcs {
        root(HttpsGithubComAChubatovaCheckpers)
    }

    steps {
        script {
            scriptContent = "exit 1"
        }
    }
})

object Positive : BuildType({
    name = "positive"

    vcs {
        root(HttpsGithubComAChubatovaCheckpers)
    }

    steps {
        script {
            scriptContent = DslContext.getParameter(name = "a")
        }
        script {
            scriptContent = """
                echo a
                exit 5
            """.trimIndent()
        }
    }
})

object HttpsGithubComAChubatovaCheckpers : GitVcsRoot({
    name = "https://github.com/AChubatova/checkpers"
    url = "https://github.com/AChubatova/checkpers"
    branch = "refs/heads/main"
    checkoutPolicy = GitVcsRoot.AgentCheckoutPolicy.NO_MIRRORS
})
