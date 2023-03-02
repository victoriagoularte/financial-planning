plugins {
    id("com.viclab.library")
    id("com.viclab.hilt")
}

android {
    namespace = "com.viclab.domain.calendar"
}

dependencies {
    with(libs.androidx) {
        implementation(core.ktx)
    }
}