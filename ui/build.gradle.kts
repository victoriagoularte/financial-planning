plugins {
    id("com.viclab.library")
    id("com.viclab.hilt")
    id("com.viclab.compose")
}

android {
    namespace = "com.viclab.ui"
}

dependencies {
    with(libs.androidx) {
        implementation(core.ktx)
    }
}