package com.VikkiVuk.iMOD.init;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.items.ruby_ingot;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInitNew {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, iMOD.MOD_ID);

    // Miscellaneous
    public static final RegistryObject<Item> ruby_ingot = ITEMS.register("ruby_ingot", () -> new ruby_ingot(new Item.Properties().group(iMOD.HystelTab.instance)));

    // Buckets
    public static final RegistryObject<BucketItem> chocolate_milk_bucket = ITEMS.register("chocolate_milk_bucket", () -> new BucketItem(() -> FluidInit.MILK_FLUID.get(), new Item.Properties().group(iMOD.HystelTab.instance)));
}
