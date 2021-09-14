plugins {
    kotlin("jvm") version "1.5.20"
    `kotlin-dsl`
    id("com.squareup.wire") version "4.0.0-alpha.11"
}

group = "io.github.gh"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    val wire="4.0.0-alpha.11"
    implementation("com.squareup.wire:wire-runtime:$wire")
    implementation("com.squareup.wire:wire-grpc-client:$wire")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.20")
}
wire {
    kotlin {
        rpcCallStyle = "suspending"
    }
}
