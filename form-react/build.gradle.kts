plugins {
    kotlin("js")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

dependencies {
    api("tz.co.asoft:theme-react:${vers.asoft.theme}")
    api("tz.co.asoft:reakt-core:${vers.asoft.reakt}")
    api(project(":form-html"))
}

aSoftLibrary(
    version = vers.asoft.reakt,
    description = "Form tools to work with Form in react"
)