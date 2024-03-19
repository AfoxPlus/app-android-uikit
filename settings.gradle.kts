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
                username = extra.has("REPO_USERID_AFOXPLUS").let {
                    if (it)
                        extra.get("REPO_USERID_AFOXPLUS") as String else System.getenv("REPO_USERID")
                }
                password = extra.has("REPO_TOKEN_AFOXPLUS").let {
                    if (it)
                        extra.get("REPO_TOKEN_AFOXPLUS") as String else System.getenv("REPO_TOKEN")
                }
            }
        }
    }
}

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("com.vanniktech:gradle-dependency-graph-generator-plugin:0.8.0")
    }
}

include(":demo")
include(":module")