package com.codingnite.gentlemod.item;

import com.codingnite.gentlemod.GentleMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GentleMod.MOD_ID);

    public static final RegistryObject<Item> BRITAIN_TUXEDO = ITEMS.register("britain-tuxedo",
            () -> new ArmorItem(ModArmorMaterial.BRITAIN, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroup.GENTLE_GROUP)));

    public static final RegistryObject<Item> BRITAIN_TROUSERS = ITEMS.register("britain-trousers",
            () -> new ArmorItem(ModArmorMaterial.BRITAIN, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroup.GENTLE_GROUP)));

    public static final RegistryObject<Item> BRITAIN_SHOES = ITEMS.register("britain-shoes",
            () -> new ArmorItem(ModArmorMaterial.BRITAIN, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroup.GENTLE_GROUP)));

    public static final RegistryObject<Item> BRITAIN_FLAG = ITEMS.register("britain-flag",
            () -> new SwordItem(ModItemTier.BRITAIN, 2, 3f, new Item.Properties().group(ModItemGroup.GENTLE_GROUP)));

    public static final RegistryObject<Item> TEA_LEAF = ITEMS.register("tea-leaf",
            () -> new Item(new Item.Properties().group(ModItemGroup.GENTLE_GROUP)));

    public static final RegistryObject<Item> BRITAIN_SHARD = ITEMS.register("britain-shard",
            () -> new Item(new Item.Properties().group(ModItemGroup.GENTLE_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
