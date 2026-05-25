# seedgg

A minimal Paper plugin that sends players a clickable link to view their current world seed on [seeds.gg](https://www.seeds.gg).

## Requirements

- Paper 1.21.4
- Java 21

## Build

```bash
./gradlew clean build
```

Output: `build/libs/seedgg-<version>.jar`

## Install

Drop the jar into your server's `plugins/` folder and restart.

```bash
sudo cp build/libs/seedgg-*.jar /srv/minecraft/paper/plugins/
```

## Usage

```
/seedgg
```

Sends you a chat message showing your current world seed and a clickable **[Open on seeds.gg]** link that opens the seed map for your exact Minecraft version.

## Permissions

| Permission | Default | Description |
|---|---|---|
| `seedgg.use` | true | Allows using `/seedgg` |

## Development deploy (VS Code)

Copy `.env.example` to `.env` and fill in your server details, then use the **Build & Deploy seedgg to Server** run configuration or the **Build & Deploy** task.
