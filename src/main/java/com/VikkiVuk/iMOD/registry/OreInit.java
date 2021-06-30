package com.VikkiVuk.iMOD.registry;

import com.VikkiVuk.iMOD.iMOD;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class OreInit {
    private static ConfiguredFeature<?, ?> BLUESTONE_ORE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockInit.bluestone_ore.getDefaultState(), 9)).range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))).spreadHorizontally().repeat(20);
    private static ConfiguredFeature<?, ?> RUBY_ORE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockInit.ruby_ore.getDefaultState(), 9)).range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))).spreadHorizontally().repeat(20);
    private static ConfiguredFeature<?, ?> COPPER_ORE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockInit.copper_ore.getDefaultState(), 9)).range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))).spreadHorizontally().repeat(20);
    private static ConfiguredFeature<?, ?> RAINBOW_ORE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockInit.rainbow_ore.getDefaultState(), 9)).range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))).spreadHorizontally().repeat(20);

    public static void regsterOres(){
        RegistryKey<ConfiguredFeature<?, ?>> bluestoneOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(iMOD.MOD_ID, "bluestone_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bluestoneOre.getValue(), BLUESTONE_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, bluestoneOre);

        RegistryKey<ConfiguredFeature<?, ?>> rubyOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(iMOD.MOD_ID, "ruby_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rubyOre.getValue(), RUBY_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, rubyOre);

        RegistryKey<ConfiguredFeature<?, ?>> copperOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(iMOD.MOD_ID, "copper_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, copperOre.getValue(), COPPER_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, copperOre);

        RegistryKey<ConfiguredFeature<?, ?>> rainbowOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(iMOD.MOD_ID, "rainbow_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rainbowOre.getValue(), RAINBOW_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, rainbowOre);
    }
}
