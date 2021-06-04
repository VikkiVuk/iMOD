package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block {

	public BlockRuby() {
		super(Properties.create(Material.IRON).hardnessAndResistance(5.1f, 30f).sound(SoundType.METAL));
		setRegistryName("ruby_block");
		// TODO Auto-generated constructor stub
	}

}
