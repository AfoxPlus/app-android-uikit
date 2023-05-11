pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { setUrl("https://jitpack.io") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://maven.pkg.github.com/afoxplus/app-yalisto-android")
            credentials {
                username = extra["REPO_USERID_AFOXPLUS"] as String? ?: System.getenv("REPO_USERID")
                password = extra["REPO_TOKEN_AFOXPLUS"] as String? ?: System.getenv("REPO_TOKEN")
            }
        }
    }
}


include(":demo")
include(":module")