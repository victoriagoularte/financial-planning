plugins {
    alias(libs.plugins.android.library)
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
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidxComposeUi.get()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    kapt(libs.compose.runtime)

    implementation(libs.bundles.compose)

    with(libs.androidx) {
        implementation(core.ktx)
    }
}