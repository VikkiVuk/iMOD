package com.VikkiVuk.iMOD;

import com.VikkiVuk.iMOD.registry.*;
import com.VikkiVuk.iMOD.util.SinteringFurnaceInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class iMOD implements ModInitializer {
	public static final String MOD_ID = "imod";

	public static final ItemGroup iTAB = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "itab"), () -> new ItemStack(ItemInit.bluestone_ingot));

	@Override
	public void onInitialize() {
		ItemInit.registerItems();

		ATInit.registerTools();
		ATInit.registerArmors();

		BlockInit.registerBlocks();
		BlockInit.registerBlockItems();

		OreInit.regsterOres();

		FluidInit.registerFluids();

		SinteringFurnaceInit.register();
	}
}
