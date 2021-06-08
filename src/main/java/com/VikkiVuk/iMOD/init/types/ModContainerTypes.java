package com.VikkiVuk.iMOD.init.types;

import com.VikkiVuk.iMOD.objects.containers.BluestoneChestContainer;
import com.VikkiVuk.iMOD.util.Reference;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, Reference.MOD_ID);

    public static final RegistryObject<ContainerType<BluestoneChestContainer>> bluestone_chest_container = CONTAINER_TYPES.register("bluestone_chest", () -> IForgeContainerType.create(BluestoneChestContainer::new));
}
