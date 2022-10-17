package net.zestyblaze.malusphaethusa.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.zestyblaze.malusphaethusa.MalusPhaethusa;
import net.zestyblaze.malusphaethusa.item.*;

public class ItemInit {
    public static final Item GOLDEN_WHEAT = new GoldenWheatItem(new FabricItemSettings().group(MalusPhaethusa.MAIN_TAB));
    public static final Item ENCHANTED_GOLDEN_WHEAT = new EnchantedGoldenWheat(new FabricItemSettings().group(MalusPhaethusa.MAIN_TAB).rarity(Rarity.EPIC));
    public static final Item GOLDEN_BREAD = new GoldenBreadItem(new FabricItemSettings().group(MalusPhaethusa.MAIN_TAB));
    public static final Item ENCHANTED_GOLDEN_BREAD = new EnchantedGoldenBreadItem(new FabricItemSettings().group(MalusPhaethusa.MAIN_TAB));
    public static final Item GOLDEN_MILK = new GoldenMilkItem(new FabricItemSettings().group(MalusPhaethusa.MAIN_TAB));
    public static final Item ENCHANTED_GOLDEN_MILK = new EnchantedGoldenMilkItem(new FabricItemSettings().group(MalusPhaethusa.MAIN_TAB));

    public static final Item APPLE_COW_SPAWN_EGG = new SpawnEggItem(EntityInit.APPLE_COW, 14554916, 16750237, new Item.Settings().group(MalusPhaethusa.MAIN_TAB));
    public static final Item GOLDEN_APPLE_COW_SPAWN_EGG = new SpawnEggItem(EntityInit.GOLDEN_APPLE_COW, 15714384, 16776935, new FabricItemSettings().rarity(Rarity.RARE).group(MalusPhaethusa.MAIN_TAB));
    public static final Item ENCHANTED_GOLDEN_APPLE_COW_SPAWN_EGG = new GlintEgg(EntityInit.ENCHANTED_GOLDEN_APPLE_COW, 15714384, 16776935, new FabricItemSettings().rarity(Rarity.EPIC).group(MalusPhaethusa.MAIN_TAB));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MalusPhaethusa.MOD_ID, "golden_wheat"), GOLDEN_WHEAT);
        Registry.register(Registry.ITEM, new Identifier(MalusPhaethusa.MOD_ID, "enchanted_golden_wheat"), ENCHANTED_GOLDEN_WHEAT);
        Registry.register(Registry.ITEM, new Identifier(MalusPhaethusa.MOD_ID, "golden_bread"), GOLDEN_BREAD);
        Registry.register(Registry.ITEM, new Identifier(MalusPhaethusa.MOD_ID, "enchanted_golden_bread"), ENCHANTED_GOLDEN_BREAD);
        Registry.register(Registry.ITEM, new Identifier(MalusPhaethusa.MOD_ID, "golden_milk"), GOLDEN_MILK);
        Registry.register(Registry.ITEM, new Identifier(MalusPhaethusa.MOD_ID, "enchanted_golden_milk"), ENCHANTED_GOLDEN_MILK);
        Registry.register(Registry.ITEM, new Identifier(MalusPhaethusa.MOD_ID, "apple_cow_spawn_egg"), APPLE_COW_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(MalusPhaethusa.MOD_ID, "golden_apple_cow_spawn_egg"), GOLDEN_APPLE_COW_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(MalusPhaethusa.MOD_ID, "enchanted_golden_apple_cow_spawn_egg"), ENCHANTED_GOLDEN_APPLE_COW_SPAWN_EGG);
    }
}
