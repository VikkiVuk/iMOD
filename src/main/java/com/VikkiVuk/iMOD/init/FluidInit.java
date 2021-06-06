package com.VikkiVuk.iMOD.init;

import com.VikkiVuk.iMOD.iMOD;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit
{
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, iMOD.MOD_ID);

    public static final ResourceLocation MILK_STILL_RL = new ResourceLocation(iMOD.MOD_ID, "fluids/chocolate_milk_still");
    public static final ResourceLocation MILK_FLOWING_RL = new ResourceLocation(iMOD.MOD_ID, "fluids/chocolate_milk_flowing");
    public static final ResourceLocation MILK_OVERLAY_RL = new ResourceLocation(iMOD.MOD_ID, "fluids/milk_overlay");
    public static final RegistryObject<FlowingFluid> MILK_FLUID = FLUIDS.register("chocolate_milk_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.MILK_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MILK_FLOWING = FLUIDS.register("chocolate_milk_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.MILK_PROPERTIES));
    public static final ForgeFlowingFluid.Properties MILK_PROPERTIES = new ForgeFlowingFluid.Properties(() -> MILK_FLUID.get(), () -> MILK_FLOWING.get(), FluidAttributes.builder(MILK_STILL_RL, MILK_FLOWING_RL).density(5).luminosity(10).rarity(Rarity.RARE).sound(SoundEvents.ITEM_BUCKET_FILL)).block(() -> FluidInit.MILK_BLOCK.get()).bucket(() -> ItemInitNew.chocolate_milk_bucket.get());
    public static final RegistryObject<FlowingFluidBlock> MILK_BLOCK = BlockInit.BLOCKS.register("chocolate_milk", () -> new FlowingFluidBlock(() -> FluidInit.MILK_FLUID.get(), Block.Properties.create(Material.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops()));
}
