package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBluestone extends Block {

	public BlockBluestone() {
		super(Properties.create(Material.IRON).hardnessAndResistance(5.3f, 30f).sound(SoundType.METAL));
		//setRegistryName("bluestone_block");
	}

}
