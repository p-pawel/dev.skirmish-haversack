plugins {
    id("maven-publish")
    kotlin("jvm") version "2.0.21"
}

group = "dev.skirmish-haversack"
version = "2024.12"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
    repositories {
        maven {
            url = uri(System.getProperty("user.home") + "/.m2/repository") // Local Maven repository
        }
    }
}
