plugins {
    kotlin("js")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    js(IR) { library() }
    sourceSets {
        val main by getting {
            dependencies {
                api("org.jetbrains.kotlinx:kotlinx-html:${vers.kotlinx.html}")
                api("tz.co.asoft:kotlinx-extensions:${vers.asoft.kotlinx_extensions}")
            }
        }
    }
}

aSoftOSSLibrary(
    version = vers.asoft.form,
    description = "Form tools to work with Form in kotlin/js client html dsl"
)