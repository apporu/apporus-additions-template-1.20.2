package net.apporu.apporusaddtions.item;

import net.apporu.apporusaddtions.ApporusAdditions;
import net.apporu.apporusaddtions.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup APPORUS_ADDITIONS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ApporusAdditions.MOD_ID, "apporusadditions"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.apporusadditions"))
                    .icon(() -> new ItemStack(ModItems.NOOPY)).entries((displayContext, entries) -> {

                        entries.add(ModItems.NOOPY);
                        entries.add(ModItems.NOOPY_TENDER);
                        entries.add(ModBlocks.NOOPY_BLOCK);

            }).build());

    public static void registerItemGroups() {
        ApporusAdditions.LOGGER.info("Registering Item Groups for " + ApporusAdditions.MOD_ID);
    }
}
