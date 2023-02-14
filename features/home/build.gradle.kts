plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.hilt)
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "com.viclab.ui"
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
        implementation(activity.compose)
    }
}