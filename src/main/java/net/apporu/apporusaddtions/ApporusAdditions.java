package net.apporu.apporusaddtions;

import net.apporu.apporusaddtions.block.ModBlocks;
import net.apporu.apporusaddtions.item.ModItemGroups;
import net.apporu.apporusaddtions.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApporusAdditions implements ModInitializer {
	public static final String MOD_ID = "apporusadditions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}