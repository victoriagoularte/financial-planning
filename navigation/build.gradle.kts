plugins {
    alias(libs.plugins.android.library)
    kotlin("android")
}

android {
    namespace = "com.viclab.ui"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    with(libs.androidx) {
        implementation(core.ktx)
    }
}