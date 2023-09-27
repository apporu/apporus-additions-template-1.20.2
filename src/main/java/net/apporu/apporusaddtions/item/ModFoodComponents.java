package net.apporu.apporusaddtions.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent NOOPY_TENDER = new FoodComponent.Builder()
            .hunger(8).saturationModifier(0.8f).meat().build();
}
