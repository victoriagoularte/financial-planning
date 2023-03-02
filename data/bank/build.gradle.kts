plugins {
    id("com.viclab.library")
    id("com.viclab.hilt")
}

android {
    namespace = "com.viclab.data.bank"
}

dependencies {
    implementation(project(":database:bank"))
    implementation(project(":model"))

    with(libs.androidx) {
        implementation(core.ktx)
    }
}
