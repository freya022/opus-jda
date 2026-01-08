plugins {
    `java-conventions`
    `java-library`
    `publish-conventions`
}

repositories {
    mavenLocal()
}

dependencies {
    // Logging
    api(libs.slf4j)

    // JDA
    compileOnly("net.dv8tion:JDA:6.2.1_DEV")

    // Nullability annotations
    compileOnly(libs.jspecify)
}

registerPublication(
    name = "opus-jda",
    description = "Opus encoding & decoding support for JDA",
    url = "https://github.com/freya022/opus-jda",
) {
    from(components["java"])
}
