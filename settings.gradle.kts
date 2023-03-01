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
include(":core:data")
include(":core:database")
include(":core:model")
include(":core:domain")
