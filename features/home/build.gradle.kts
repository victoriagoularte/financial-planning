plugins {
    id("com.viclab.feature")
}

android {
    namespace = "com.viclab.features.home"
}

dependencies {
    with(libs.androidx) {
        implementation(core.ktx)
    }
}