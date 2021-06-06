package com.VikkiVuk.iMOD.init;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.items.other.ModMusicDiscItem;
import com.VikkiVuk.iMOD.objects.items.ruby_ingot;
import net.minecraft.entity.monster.IMob;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInitNew {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, iMOD.MOD_ID);

    // Miscellaneous
    public static final RegistryObject<Item> ruby_ingot = ITEMS.register("ruby_ingot", () -> new ruby_ingot(new Item.Properties().group(iMOD.HystelTab.instance)));

    // Music Discs
    public static final RegistryObject<ModMusicDiscItem> PROMISES_DISC = ITEMS.register("disc_promises", () -> new ModMusicDiscItem(5, SoundInit.LAZY_PROMISES_MUSIC.get(), new Item.Properties().group(iMOD.HystelTab.instance).maxStackSize(1).rarity(Rarity.EPIC)));

    // Buckets
    public static final RegistryObject<BucketItem> chocolate_milk_bucket = ITEMS.register("chocolate_milk_bucket", () -> new BucketItem(() -> FluidInit.MILK_FLUID.get(), new Item.Properties().group(iMOD.HystelTab.instance)));
}
