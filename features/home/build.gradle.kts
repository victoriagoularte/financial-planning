plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.hilt)
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "com.viclab.home"
    compileSdk = 33

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidxComposeUi.get()
    }
    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    implementation(project(":navigation"))
    implementation(project(":ui"))

    kapt(libs.compose.runtime)
    kapt(libs.hilt.compiler)

    implementation(libs.bundles.compose)
    implementation(libs.bundles.hilt)

    with(libs.androidx) {
        implementation(core.ktx)
    }
}