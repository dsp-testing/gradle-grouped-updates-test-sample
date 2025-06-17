plugins {
    kotlin("jvm") version "2.1.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.1.21")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.junit.jupiter:junit-jupiter-api:5.13.1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.13.1")
}

tasks.test {
    useJUnitPlatform()
}
