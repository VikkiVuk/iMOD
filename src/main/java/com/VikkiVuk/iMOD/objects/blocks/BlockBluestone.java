package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBluestone extends Block {

	public BlockBluestone() {
		super(Properties.of(Material.METAL).strength(5.3f, 30f).sound(SoundType.METAL));
		 setRegistryName("bluestone_block");
	}

}
