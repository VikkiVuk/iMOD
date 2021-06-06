package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCB extends Block {

    public BlockCB() {
        super(Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.1f));
        //setRegistryName("customized_bobble");
    }


}
