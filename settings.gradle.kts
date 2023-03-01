pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Financial Planning"
include(":app", ":ui", ":features:home", ":navigation")
include(":database:bank")
include(":data:bank", ":data:transaction")
include(":domain:calendar", ":domain:home")
include(":model")
