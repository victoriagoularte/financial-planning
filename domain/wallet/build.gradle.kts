plugins {
    id("com.viclab.library")
    id("com.viclab.hilt")
}

android {
    namespace = "com.viclab.domain.home"
}

dependencies {
    implementation(project(":data:account"))
    implementation(project(":model"))

    with(libs.androidx) {
        implementation(core.ktx)
    }
}