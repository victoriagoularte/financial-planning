plugins {
    `kotlin-dsl`
}

group = "com.viclab.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("library") {
            id = "com.viclab.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("hilt") {
            id = "com.viclab.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
    }
}
