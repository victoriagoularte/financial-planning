plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.hilt)
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "com.viclab.database.bank"
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

    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    kapt(libs.hilt.compiler)
    implementation(libs.bundles.hilt)

    with(libs.androidx) {
        implementation(core.ktx)
        implementation(room.runtime)
    }
}