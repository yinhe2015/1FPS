package com.onefps;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OneFpsMod implements ClientModInitializer {
    public static final String MOD_ID = "onefps";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("1FPS Mod loaded! Enjoy your slideshow experience!");
        LOGGER.warn("Your FPS is now permanently locked to 1. Good luck!");
    }
}
