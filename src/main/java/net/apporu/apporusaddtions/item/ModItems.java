package net.apporu.apporusaddtions.item;

import net.apporu.apporusaddtions.ApporusAdditions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // ADDED ITEMS LIST:
    public static final Item NOOPY = registerItem("noopy", new Item(new FabricItemSettings()));
    public static final Item NOOPY_TENDER = registerItem("noopy_tender", new
            Item(new FabricItemSettings().food(ModFoodComponents.NOOPY_TENDER)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(NOOPY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ApporusAdditions.MOD_ID, name), item);
    }

    public static void registerModItems () {
        ApporusAdditions.LOGGER.info("Registering Mod Items for Apporu's Additions");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
