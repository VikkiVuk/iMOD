package com.VikkiVuk.iMOD.objects.blocks;

import com.VikkiVuk.iMOD.init.types.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class BlockQuarry extends Block {

    public BlockQuarry(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
       return ModTileEntityTypes.quarry.get().create();
    }
}
