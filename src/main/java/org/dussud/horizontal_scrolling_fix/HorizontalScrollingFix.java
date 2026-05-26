package org.dussud.horizontal_scrolling_fix;

import net.fabricmc.api.ModInitializer;

import net.uku3lig.ukulib.config.ConfigManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HorizontalScrollingFix implements ModInitializer {
	public static final String MOD_ID = "mouse-tilt-fix";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ConfigManager<HorizontalScrollingFixConfig> manager = ConfigManager.createDefault(HorizontalScrollingFixConfig.class, "mouse-tilt-fix");

	@Override
	public void onInitialize() {
		LOGGER.debug("Mouse Tilt Fix Config Initialized");
		if (!manager.getConfig().horizontalScrollingEnabled) {
			LOGGER.debug("Lateral Scrolling Disabled");
		}
	}
}