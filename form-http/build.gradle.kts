plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    universalLib()
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("io.ktor:ktor-client-core:${vers.ktor}")
                api("tz.co.asoft:files:${vers.asoft.files}")
            }
        }

        val androidMain by getting {
            dependencies {
                api("io.ktor:ktor-client-android:${vers.ktor}")
            }
        }

        val jvmMain by getting {
            dependencies {
                api("io.ktor:ktor-client-cio:${vers.ktor}")
            }
        }

        val jsMain by getting {
            dependencies {
                api("io.ktor:ktor-client-js:${vers.ktor}")
            }
        }
    }
}

aSoftLibrary(
    version = vers.asoft.reakt,
    description = "Form tools to work with http forms"
)