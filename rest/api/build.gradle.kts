plugins {
    java
    kotlin("jvm")
}

plugins.apply("java")

repositories {
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/kotlin/ktor")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.ktor:ktor-server-jetty:${Dependencies.ktorVersion}")
    implementation("io.ktor:ktor-server-core:${Dependencies.ktorVersion}")
    implementation("io.ktor:ktor-auth-jwt:${Dependencies.ktorVersion}")
    implementation("io.ktor:ktor-locations:${Dependencies.ktorVersion}")
    implementation("io.ktor:ktor-server-host-common:${Dependencies.ktorVersion}")
    implementation("io.ktor:ktor-auth:${Dependencies.ktorVersion}")
    implementation("io.ktor:ktor-client-core:${Dependencies.ktorVersion}")
    implementation("io.ktor:ktor-html-builder:${Dependencies.ktorVersion}")
    implementation("io.ktor:ktor-client-core-jvm:${Dependencies.ktorVersion}")
    implementation("io.ktor:ktor-client-apache:${Dependencies.ktorVersion}")
    testImplementation("io.ktor:ktor-server-tests:${Dependencies.ktorVersion}")
    implementation("io.ktor:ktor-serialization:${Dependencies.ktorVersion}")

    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.1.0")
    implementation("com.github.ben-manes.caffeine:caffeine:2.8.6")
    implementation("com.auth0:java-jwt:3.11.0")

    implementation("org.jetbrains.exposed:exposed-core:${Dependencies.exposedVersion}")
    implementation("org.jetbrains.exposed:exposed-dao:${Dependencies.exposedVersion}")
    implementation("org.jetbrains.exposed:exposed-jdbc:${Dependencies.exposedVersion}")
    implementation("org.jetbrains.exposed:exposed-java-time:${Dependencies.exposedVersion}")

    implementation("com.zaxxer:HikariCP:${Dependencies.hikariVerison}")
    runtimeOnly("mysql:mysql-connector-java:8.0.20")
}