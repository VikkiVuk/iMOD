package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class KbEnc10 extends Block {

    public KbEnc10() {
        super(Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.1f));
        setRegistryName("knoEnc");
    }


    @Override
    public BlockRenderType getRenderType(BlockState p_149645_1_) {
        return BlockRenderType.MODEL;
    }


}
