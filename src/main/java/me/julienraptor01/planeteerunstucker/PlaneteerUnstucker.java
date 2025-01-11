package me.julienraptor01.planeteerunstucker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ClientModInitializer;

public class PlaneteerUnstucker implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Planeteer Unstucker");

	@Override
	public void onInitializeClient() {
		LOGGER.info("Planeteer Unstucker is ready to help you to be able to move again!");
	}
}
