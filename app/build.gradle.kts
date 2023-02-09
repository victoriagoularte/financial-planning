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

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidxComposeUi.get()
    }
    packagingOptions {
        resources.excludes.add("META-INF/*")
    }
}

dependencies {
    implementation(libs.bundles.compose)
    implementation(libs.bundles.hilt)

    with(libs.androidx) {
        implementation(core.ktx)
        implementation(activity.compose)
    }


//    implementation 'androidx.core:core-ktx:1.7.0'
//    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.3.1'
//    implementation 'androidx.activity:activity-compose:1.3.1'
//    testImplementation 'junit:junit:4.13.2'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
}