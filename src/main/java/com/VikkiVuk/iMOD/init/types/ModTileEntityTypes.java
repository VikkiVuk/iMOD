package com.VikkiVuk.iMOD.init.types;

import com.VikkiVuk.iMOD.init.BlockInit;
import com.VikkiVuk.iMOD.objects.tile_entities.BluestoneChestTileEntity;
import com.VikkiVuk.iMOD.objects.tile_entities.QuarryTileEntity;
import com.VikkiVuk.iMOD.util.Reference;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Reference.MOD_ID);

    public static final RegistryObject<TileEntityType<QuarryTileEntity>> quarry = TILE_ENTITY_TYPES.register("quarry", () -> TileEntityType.Builder.create(QuarryTileEntity::new, BlockInit.quarry.get()).build(null));
    public static final RegistryObject<TileEntityType<BluestoneChestTileEntity>> bluestone_chest_tile_entity = TILE_ENTITY_TYPES.register("bluestone_chest", () -> TileEntityType.Builder.create(BluestoneChestTileEntity::new, BlockInit.bluestone_chest.get()).build(null));

}
