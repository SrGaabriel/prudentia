plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization") version Dependencies.kotlinVersion
}

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("io.ktor:ktor-server-core:${Dependencies.ktorVersion}")
                implementation("io.ktor:ktor-locations:${Dependencies.ktorVersion}")
                implementation("io.ktor:ktor-server-host-common:${Dependencies.ktorVersion}")
                implementation("io.ktor:ktor-auth:${Dependencies.ktorVersion}")
                implementation("io.ktor:ktor-client-core:${Dependencies.ktorVersion}")
                implementation("io.ktor:ktor-client-json:${Dependencies.ktorVersion}")
                implementation("io.ktor:ktor-client-apache:${Dependencies.ktorVersion}")
                implementation("io.ktor:ktor-serialization:${Dependencies.ktorVersion}")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${Dependencies.kotlinxSerializationVersion}")
            }
        }
        val commonTest by getting
    }
}