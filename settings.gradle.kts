pluginManagement {
    includeBuild("build-logic")
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
rootProject.name = "FinancialPlanning"
include(":app", ":ui", ":navigation")
include(":database:bank")
include(":data:bank", ":data:transaction")
include(":domain:calendar", ":domain:home")
include(":model")
include(":features:wallet")
