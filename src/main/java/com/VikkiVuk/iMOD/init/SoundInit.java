package com.VikkiVuk.iMOD.init;

import com.VikkiVuk.iMOD.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Reference.MOD_ID);

    public static final Lazy<SoundEvent> LAZY_PROMISES_MUSIC = Lazy.of(() -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "disc.promises")));

    public static final RegistryObject<SoundEvent> PROMISES_MUSIC = SOUNDS.register("promises_music", LAZY_PROMISES_MUSIC);

}
