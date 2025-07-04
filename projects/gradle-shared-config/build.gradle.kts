plugins {
    kotlin("jvm") version "2.2.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.2.0")
    implementation("com.squareup.okhttp3:okhttp:5.0.0")
    implementation("org.junit.jupiter:junit-jupiter-api:5.13.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.2.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.13.2")
}

tasks.test {
    useJUnitPlatform()
}
