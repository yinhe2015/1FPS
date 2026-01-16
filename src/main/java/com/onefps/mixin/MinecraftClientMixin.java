package com.onefps.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    
    /**
     * Forces the game's framerate limit to 1 FPS.
     * This overrides all user settings including max framerate slider and VSync.
     */
    @Inject(method = "getFramerateLimit", at = @At("HEAD"), cancellable = true)
    private void forceOneFps(CallbackInfoReturnable<Integer> cir) {
        // Maximum suffering achieved!
        cir.setReturnValue(1);
    }
}
