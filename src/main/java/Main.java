package com.craggeh.mcuo;

import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import com.google.inject.Inject;
import org.slf4j.Logger;

@Plugin(id = "mcuo", name = "Minecraft Ultima Online", version = "1.0")
public class Main {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {

        logger.info("Started server!");
    }
}
