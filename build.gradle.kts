plugins {
    kotlin("multiplatform") version Dependencies.kotlinVersion
}

allprojects {
    group = "org.prudentia"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
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
            }
        }
    }
}