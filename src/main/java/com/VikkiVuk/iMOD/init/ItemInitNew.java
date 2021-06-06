package com.VikkiVuk.iMOD.init;

import com.VikkiVuk.iMOD.iMOD;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInitNew {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, iMOD.MOD_ID);
    public static final RegistryObject<Item> chocolate_milk_bucket = ITEMS.register("chocolate_milk_bucket", () -> new Item(new Item.Properties().group(iMOD.HystelTab.instance)));
}
