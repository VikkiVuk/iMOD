package com.VikkiVuk.iMOD;

import com.VikkiVuk.iMOD.registry.BlockInit;
import com.VikkiVuk.iMOD.registry.FluidInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.BlockRenderType;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class iMODClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FluidInit.setupFluidRendering(FluidInit.STILL_CHOCOLATE_MILK, FluidInit.FLOWING_CHOCOLATE_MILK, new Identifier("imod", "chocolate_milk"));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), FluidInit.STILL_CHOCOLATE_MILK, FluidInit.FLOWING_CHOCOLATE_MILK);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.blue_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.brown_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.cyan_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.green_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.light_blue_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.light_gray_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.lime_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.magenta_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.pink_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.purple_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.white_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.yellow_slime);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockInit.orange_slime);
    }
}
