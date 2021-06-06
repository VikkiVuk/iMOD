package com.VikkiVuk.iMOD.init;

import com.VikkiVuk.iMOD.util.Reference;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FeatureInit {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Reference.MOD_ID);

    //public static final RegistryObject<HouseStructure> bluestone_house = FEATURES.register("bluestone_house", () -> new HouseStructure(NoFeatureConfig::deserialize));
}
