package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class IllusionBlock extends Block {

    public IllusionBlock() {
        super(Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.1f));
        setRegistryName("custom_block");
    }

    @Override
    public BlockRenderType getRenderShape(BlockState p_149645_1_) {
        return BlockRenderType.MODEL;
    }
}
