/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java Library project to get you started.
 * For more details take a look at the Java Libraries chapter in the Gradle
 * user guide available at https://docs.gradle.org/5.1/userguide/java_library_plugin.html
 */

plugins {
    // Apply the java-library plugin to add support for Java Library
    id("java")
    id("maven")
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {

    annotationProcessor("io.vertx:vertx-codegen:3.5.4")
    compileOnly(group = "io.vertx", name = "vertx-codegen", version = "3.5.4")

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    compile("com.google.guava:guava:26.0-jre")
    compile("io.vertx:vertx-core:3.5.4")

    // Use JUnit test framework
    testCompile("junit:junit:4.12")
}

tasks.withType<JavaCompile>().configureEach {
    with(options) {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
        encoding = "UTF-8"
    }
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src/main/java", "src/main/generated"))
        }
    }
    test {
        java {
            setSrcDirs(listOf("src/test/java"))
        }
    }
}

apply(from = "gradle/annotationProcessing.gradle.kts")