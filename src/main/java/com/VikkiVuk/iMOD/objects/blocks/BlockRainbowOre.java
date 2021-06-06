package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockRainbowOre extends Block {

    public BlockRainbowOre() {
        super(Properties.create(Material.IRON).hardnessAndResistance(5.1f, 30f).sound(SoundType.STONE));
        //setRegistryName("rainbow_ore");
        // TODO Auto-generated constructor stub
    }

}

