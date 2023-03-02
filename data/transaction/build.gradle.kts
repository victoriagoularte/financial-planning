plugins {
    id("com.viclab.library")
    id("com.viclab.hilt")
}

android {
    namespace = "com.viclab.data.transaction"
}

dependencies {
    implementation(project(":model"))

    with(libs.androidx) {
        implementation(core.ktx)
    }
}