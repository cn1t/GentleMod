package com.codingnite.gentlemod.block;

import com.codingnite.gentlemod.GentleMod;
import com.codingnite.gentlemod.block.custom.TeaBlock;
import com.codingnite.gentlemod.item.ModItemGroup;
import com.codingnite.gentlemod.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.OakTree;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            ForgeRegistries.BLOCKS, GentleMod.MOD_ID
    );

    public static final RegistryObject<Block> BRITAIN_ORE = registerBlock("britain_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(25f))
    );

    public static final RegistryObject<Block> BRITAIN_BLOCK = registerBlock("britain_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(35f))
    );

    public static final RegistryObject<Block> TEA = BLOCKS.register("tea_leaf",
            () -> new TeaBlock(AbstractBlock.Properties.from(Blocks.WHEAT))
    );

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.GENTLE_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
