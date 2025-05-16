import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("java")
    kotlin("jvm") version "2.2.0-RC"
}

group = "edu.seattleu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.antlr:antlr4:4.13.2")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_24)
    }
}

sourceSets {
    main {
        java.srcDir("gen")
    }
}

tasks.register<JavaExec>("genQueryParser") {
    mainClass.set("org.antlr.v4.Tool")
    classpath = sourceSets["main"].runtimeClasspath
    setArgsString("-o gen/ src/main/resources/Queries.g4")
}

tasks.register<JavaExec>("genTypeDefsParser") {
    mainClass.set("org.antlr.v4.Tool")
    classpath = sourceSets["main"].runtimeClasspath
    setArgsString("-o gen/ src/main/resources/TypeDefs.g4")
}

tasks.register<JavaExec>("genProcessorParser") {
    mainClass.set("org.antlr.v4.Tool")
    classpath = sourceSets["main"].runtimeClasspath
    setArgsString("-o gen/ src/main/resources/Processor.g4")
}
