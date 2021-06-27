package com.VikkiVuk.iMOD;

import com.VikkiVuk.iMOD.registry.BlockInit;
import com.VikkiVuk.iMOD.registry.ItemInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.renderer.v1.RendererAccess;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class iMOD implements ModInitializer {
	public static final String MOD_ID = "imod";

	public static final ItemGroup iTAB = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "itab"), () -> new ItemStack(ItemInit.bluestone_ingot));

	@Override
	public void onInitialize() {
		ItemInit.registerItems();
		BlockInit.registerBlocks();
		BlockInit.registerBlockItems();
	}
}
