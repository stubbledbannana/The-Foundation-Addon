package com.foundation.mixin;

import com.thcaddons.FoundationAddon;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public abstract class FoundationMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onGameLoaded(RunArgs args, CallbackInfo ci) {
        FoundationAddon.LOG.info("Hello from FoundationMixin!");
    }
}
