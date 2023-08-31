import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.10"
    application
}

group = "com.github.avenderov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val kotestVersion = "5.6.2"

dependencies {
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

application {
    mainClass.set("Main")
}
