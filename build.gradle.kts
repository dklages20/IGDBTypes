import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("org.jetbrains.kotlin.jvm") version "2.0.20"
    id("com.gradleup.shadow") version "9.0.0-beta9"
    id("net.thauvin.erik.gradle.semver") version "1.0.4"
    `java-library`
    `maven-publish`
    jacoco
}

repositories {
    mavenCentral()
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/dklages20/IGDBTypes")
            credentials {
                username = project.findProperty("githubUsername") as String? ?: System.getenv("GITHUB_USERNAME")
                password = project.findProperty("githubToken") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }

    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
            group = "io.github.dklages20"
        }
    }
}

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.3")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}

tasks.named<JacocoReport>("jacocoTestReport") {
    dependsOn(tasks.test)
    reports {
        xml.required = false
        csv.required = false
        html.outputLocation = layout.buildDirectory.dir("jacocoHtml")
    }
}

tasks.named<ShadowJar>("shadowJar") {
    archiveVersion = version.toString()
    archiveClassifier = ""
}