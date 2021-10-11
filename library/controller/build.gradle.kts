plugins {
    java
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

application {
    mainClassName = "Application"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":models"))
    implementation("com.google.code.gson:gson:2.8.8")
    implementation("com.intellij:annotations:12.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}