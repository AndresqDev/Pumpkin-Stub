# Pumpkin Stub

Compile-time Java API for Pumpkin plugin development. The stub provides the Java types and method signatures used by the J2KT translator. It contains no server runtime.

## Compatibility

| Component | Version |
|---|---|
| Pumpkin Stub | 0.2.0 |
| Java | 21 |
| Pumpkin Kotlin/Wasm API | 0.1.2 |
| Pumpkin plugin WIT | `pumpkin:plugin@0.1.0` (synchronous) |

The stub is a development contract for the synchronous v0.1 API. It does not implement the async `pumpkin:plugin@0.2.0` ABI.

## Installation

Use the JAR published in the GitHub release:

```text
pumpkin-stub-0.2.0.jar
```

For local development, publish the artifact to Maven Local:

```bash
./gradlew publishToMavenLocal
```

Coordinates:

```kotlin
repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("dev.j2kt:pumpkin-stub:0.2.0")
}
```

## Usage

```java
import java.util.List;
import pumpkin.Logging;
import pumpkin.PluginContext;
import pumpkin.PluginMetadata;
import pumpkin.PumpkinPlugin;

public final class ExamplePlugin extends PumpkinPlugin {
    @Override
    public PluginMetadata metadata() {
        return new PluginMetadata(
                "example-plugin",
                "0.1.0",
                List.of("You"),
                "Example plugin",
                List.of(),
                List.of());
    }

    @Override
    public void onLoad(PluginContext context) {
        Logging.log(Logging.Level.INFO, "Plugin loaded");
    }
}
```

Compile the source against the stub, then pass it to the J2KT translator:

```bash
java -jar j2kt-pumpkin-0.1.2-all.jar \
  --target pumpkin \
  --classpath pumpkin-stub-0.2.0.jar \
  --out generated \
  path/to/java-sources
```

## Covered API areas

- Plugin lifecycle and metadata.
- Logging, text components, players, servers, worlds, and positions.
- Events, permissions, commands, tasks, IPC, and command argument registration through the compatibility layer.
- World particles, custom sounds, block state writes, explosions, and entity teleport/removal.
- Display entities, including block, item, and text displays.
- Boss bars, GUIs, screens, inventories, items, scoreboards, and teams.
- Bedrock forms and Java Edition dialogs.
- Recipes, datapacks, enchantments, display entities, blocks, mobs, and AI goals.
- Java and Bedrock typed packets and custom payloads.

The stub covers the API areas exercised by the J2KT test suite. It is not a complete mirror of every generated Pumpkin WIT namespace.

## Command arguments

`CommandRegistry.registerWithArgs` provides a root command handler and a second handler for a greedy raw-argument node. The second handler receives `Command.ConsumedArgs`, and the `pumpkin-compat` layer builds the `args` child node and extracts its value for `Pumpkin Abs`.

This path supports raw whitespace-separated arguments. It does not create typed argument nodes or suggestions.

## Build

Requirements:

- JDK 21
- Network access to Maven Central and the Gradle Plugin Portal on the first build

```bash
./gradlew clean build
```

Artifacts:

```text
build/libs/pumpkin-stub-0.2.0.jar
build/libs/pumpkin-stub-0.2.0-sources.jar
```

## Releases

The workflow in `.github/workflows/release.yml` runs on tags matching `v*`.

It builds the library, uploads the JAR files as a GitHub Actions artifact, downloads the same artifact in the release job, and publishes:

```text
pumpkin-stub-<version>.jar
pumpkin-stub-<version>-sources.jar
pumpkin-stub-<version>.jar.sha256
pumpkin-stub-<version>-sources.jar.sha256
```

The tag must match the `version` value in `build.gradle`.

Publish a release with:

```bash
git tag v0.2.0
git push origin v0.2.0
```

## Limitations

- The stub does not execute plugin code.
- Command arguments are exposed as a greedy raw string through the compatibility layer; typed argument trees and suggestions are not implemented by the stub.
- The stub is maintained separately from the generated Kotlin/Wasm API and must be updated when the Pumpkin API changes.
- Java signatures must be validated against the generated API before translation.
- The stub does not replace runtime testing on a Pumpkin server.

## Source

The canonical J2KT translator is available at:

```text
https://github.com/AndresqDev/J2KT-Pumpkin
```

The optional Bukkit-style lifecycle and registration layer is available at:

```text
https://github.com/AndresqDev/Pumpkin-Abs
```

## License

Apache License 2.0. See `LICENSE`.
