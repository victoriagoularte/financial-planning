plugins {
    id("com.viclab.feature")
}

android {
    namespace = "com.viclab.features.home"
}

dependencies {
    implementation(project(":features:wallet"))
    with(libs.androidx) {
        implementation(core.ktx)
    }
}