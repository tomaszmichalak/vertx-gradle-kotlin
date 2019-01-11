
allprojects {

    plugins.withId("java") {
        tasks {
            create<JavaCompile>("annotationProcessing") {
                source("$projectDir/src/main/java")
                classpath = configurations["annotationProcessor"] + configurations["compile"] + configurations["compileOnly"]
                destinationDir = file("$projectDir/src/main/generated")
                options.compilerArgs = listOf(
                        "-proc:only",
                        "-processor", "io.vertx.codegen.CodeGenProcessor",
                        "-Acodegen.output=$projectDir/src/main"
                )
            }
        }
        tasks.findByName("compileJava")?.dependsOn("annotationProcessing")
    }
}