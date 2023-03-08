plugins {
    id("com.viclab.library")
    id("com.viclab.hilt")
}

android {
    namespace = "com.viclab.domain.home"
}

dependencies {
    implementation(project(":data:account"))

    with(libs.androidx) {
        implementation(core.ktx)
    }
}