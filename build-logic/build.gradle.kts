plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("com.gradleup.shadow:com.gradleup.shadow.gradle.plugin:9.4.1")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}