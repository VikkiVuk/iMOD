package com.VikkiVuk.iMOD.objects.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockRubyOre extends Block {

    public BlockRubyOre() {
        super(Properties.of(Material.METAL).strength(4.1f, 30f).sound(SoundType.STONE));
        setRegistryName("ruby_ore");
        // TODO Auto-generated constructor stub
    }
}
