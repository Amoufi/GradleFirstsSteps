plugins {
    id("application")
    
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("es.eed.App")
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.15.0")
    implementation("com.google.code.gson:gson:2.12.1")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }

}
tasks.withType<JavaCompile>().configureEach {
    options.release.set(21)
}