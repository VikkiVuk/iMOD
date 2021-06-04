package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCopper extends Block {

	public BlockCopper() {
		super(Properties.of(Material.METAL).strength(5.1f, 30f).sound(SoundType.METAL));
		setRegistryName("copper_block");
		// TODO Auto-generated constructor stub
	}

}
