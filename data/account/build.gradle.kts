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
    implementation("androidx.test.ext:junit-ktx:1.1.5")

    with(libs.androidx) {
        implementation(core.ktx)
    }
}
