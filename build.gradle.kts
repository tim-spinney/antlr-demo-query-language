plugins {
    id("java")
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

sourceSets {
    main {
        java.srcDir("gen")
    }
}

tasks.register<JavaExec>("genParser") {
    
    mainClass.set("org.antlr.v4.Tool")
    classpath = sourceSets["main"].runtimeClasspath
    setArgsString("-o gen/ src/main/resources/ListQueries.g4")
}
