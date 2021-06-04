package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBluestoneOre extends Block {

    public BlockBluestoneOre() {
        super(Properties.of(Material.METAL).strength(4.9f, 30f).sound(SoundType.STONE));
        setRegistryName("bluestone_ore");
        // TODO Auto-generated constructor stub
    }

}
