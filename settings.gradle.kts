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
include(":features:wallet")
include(":domain:calendar", ":domain:wallet")
include(":data:account", ":data:transaction")
include(":database:bank")
include(":model")
include(":core")
