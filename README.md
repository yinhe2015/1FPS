# 1FPS Mod

> 🎮 Experience Minecraft like never before - at 1 FPS!

A prank Minecraft Fabric mod that forces your game to run at exactly 1 frame per second. No matter what settings you change, your FPS will be locked to 1. Enjoy the ultimate slideshow gaming experience!

## ⚠️ Warning

This is a **prank mod**! Installing this mod will make Minecraft nearly unplayable. Use it wisely (or wisely give it to your friends 😈).

## Features

- 🐌 Forces FPS to exactly 1, regardless of any settings
- 🔒 Overrides VSync and max framerate slider
- 🎯 Works with Minecraft 1.20.1
- ⚡ Lightweight - uses Mixin injection

## Requirements

- Minecraft 1.20.1
- Fabric Loader ≥ 0.15.0
- Java 17+

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/) for Minecraft 1.20.1
2. Download the mod JAR from [Releases](https://github.com/zhtxiii-ops/1FPS/releases)
3. Place the JAR file in your `.minecraft/mods` folder
4. Launch Minecraft and enjoy your 1 FPS experience!

## Building from Source

```bash
./gradlew build
```

The compiled JAR will be in `build/libs/`.

## How It Works

The mod uses Mixin to inject into `MinecraftClient.getFramerateLimit()` method, forcing it to always return `1` regardless of any user settings.

```java
@Inject(method = "getFramerateLimit", at = @At("HEAD"), cancellable = true)
private void forceOneFps(CallbackInfoReturnable<Integer> cir) {
    cir.setReturnValue(1);
}
```

## License

MIT License

## Disclaimer

This mod is intended for entertainment purposes only. The author is not responsible for any frustration, broken keyboards, or lost friendships caused by this mod.
