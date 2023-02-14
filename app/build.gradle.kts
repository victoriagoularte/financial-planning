plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.hilt)
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "com.viclab.financialplanning"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.viclab.financialplanning"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        debug {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    kapt {
        correctErrorTypes = true
    }

    packagingOptions {
        packagingOptions.resources.excludes += setOf(
            "META-INF/*.version",
            "META-INF/gradle/*",
            "META-INF/gradle/*.processors",
            "META-INF/proguard/*",
            "/*.properties",
            "fabric/*.properties",
            "META-INF/*"
        )
    }
}

dependencies {
    implementation(project(":navigation"))
    implementation(project(":ui"))
    implementation(project(":features:home"))

    kapt(libs.hilt.compiler)
    implementation(libs.bundles.hilt)

    with(libs.androidx) {
        implementation(appcompat)
        implementation(constraintlayout)
        implementation(core.ktx)
        implementation(work.runtime)
    }
}