plugins {
    kotlin("js")
    id("tz.co.asoft.library")
}

dependencies {
    api(project(":theme-react"))
    api(project(":react-core"))
}