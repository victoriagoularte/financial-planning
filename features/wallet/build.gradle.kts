plugins {
    id("com.viclab.feature")
}

android {
    namespace = "com.viclab.features.wallet"
}

dependencies {
    with(libs.androidx) {
        implementation(core.ktx)
    }
}