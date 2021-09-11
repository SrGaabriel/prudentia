plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization") version Dependencies.kotlinVersion
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
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${Dependencies.kotlinxSerializationVersion}")
            }
        }
    }
}