package com.codingnite.gentlemod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup GENTLE_GROUP = new ItemGroup("gentleModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.BRITAIN_SHARD.get());
        }
    };
}
