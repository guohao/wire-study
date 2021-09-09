plugins {
    kotlin("jvm") version "1.5.30"
    id("com.squareup.wire") version "4.0.0-alpha.11"
}

group = "io.github.gh"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.squareup.wire:wire-runtime:4.0.0-alpha.11")
    implementation("com.squareup.wire:wire-grpc-client:4.0.0-alpha.11")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.30")
}
wire {
    kotlin {
        rpcCallStyle = "suspending"
    }
}
