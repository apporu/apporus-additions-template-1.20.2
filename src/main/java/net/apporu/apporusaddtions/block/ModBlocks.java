package net.apporu.apporusaddtions.block;

import net.apporu.apporusaddtions.ApporusAdditions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block NOOPY_BLOCK = registerBlock("noopy_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ApporusAdditions.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ApporusAdditions.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        ApporusAdditions.LOGGER.info("Registering Mod Blocks for " + ApporusAdditions.MOD_ID);
    }
}
