plugins {
    `java-conventions`
    `java-library`
    `publish-conventions`
}

repositories {
    exclusiveContent {
        forRepository {
            maven("https://jitpack.io")
        }

        filter {
            includeModule("io.github.freya022", "JDA")
        }
    }
}

dependencies {
    // Logging
    api(libs.slf4j)

    // JDA
    compileOnly("io.github.freya022:JDA:c6ba02a105")

    // Nullability annotations
    compileOnly(libs.jspecify)
}

java {
    withJavadocJar()
    withSourcesJar()
}

registerPublication(
    name = "opus-jda",
    description = "Opus encoding & decoding support for JDA",
    url = "https://github.com/freya022/opus-jda",
) {
    from(components["java"])
}
