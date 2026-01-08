[maven-central-shield]: https://img.shields.io/maven-central/v/dev.freya02/opus-jda?label=Maven%20central&logo=apachemaven
[maven-central-link]: https://central.sonatype.com/artifact/dev.freya02/opus-jda

# opus-jda

Opus encoding & decoding support for JDA.

## Supported platforms
- Linux: x86-64, aarch64, armhf
- Windows: x86-64, aarch64
- macOS (darwin): x86-64, aarch64

## Requirements

- Java 25+

## Installation

[![opus-jda on Maven Central][maven-central-shield] ][maven-central-link]

### Gradle
```kotlin
dependencies {
    implementation("dev.freya02:opus-jda:VERSION") // TODO replace VERSION with current release
}
```

### Maven
```xml
<dependency>
    <groupId>dev.freya02</groupId>
    <artifactId>opus-jda</artifactId>
    <version>VERSION</version> <!-- TODO replace VERSION with current release -->
</dependency>
```

## Usage

```java
var audioModuleConfig = new AudioModuleConfig()
        .withOpusCodecFactory(new OpusCodecFactory());

jdaBuilder.setAudioModuleConfig(audioModuleConfig);
```

> [!TIP]
> To remove the warning when the natives are loaded, add `--enable-native-access=ALL-UNNAMED` to your JVM arguments.
