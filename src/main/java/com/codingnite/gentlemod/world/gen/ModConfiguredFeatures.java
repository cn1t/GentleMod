package com.codingnite.gentlemod.world.gen;

import com.codingnite.gentlemod.block.ModBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FancyFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }


    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TEATREE =
            register("teatree", Feature.TREE.withConfiguration(
                    (new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(ModBlocks.TEATREE_LOG.get().getDefaultState()),
                            new SimpleBlockStateProvider(ModBlocks.TEATREE_LEAVES.get().getDefaultState()),
                            new FancyFoliagePlacer(
                                    FeatureSpread.create(2),
                                    FeatureSpread.create(1),
                                    3
                            ),
                            new StraightTrunkPlacer(2, 0, 0), // Base-Height | Added to base height (random number from 0 - X added) | Added to height after first randomization (random number from 0 - X added)
                            new TwoLayerFeature(0, 0, 0)
                    ))
                            .setIgnoreVines()
                            .build()
            ));
}