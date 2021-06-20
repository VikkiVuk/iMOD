package com.VikkiVuk.iMOD.objects.blocks;

import com.VikkiVuk.iMOD.init.types.ModTileEntityTypes;
import com.VikkiVuk.iMOD.objects.tile_entities.BluestoneChestTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import java.util.stream.Stream;

public class BlockBluestoneChest extends Block {

private static final VoxelShape SHAPE_N = Stream.of(
        Block.makeCuboidShape(3, 12, 3, 13, 13, 13),
        Block.makeCuboidShape(0, 0, 0, 16, 3, 16),
        Block.makeCuboidShape(0, 9, 0, 16, 12, 16),
        Block.makeCuboidShape(2, 3, 2, 14, 10, 14),
        Block.makeCuboidShape(2, 3, 1, 4, 10, 2),
        Block.makeCuboidShape(6, 3, 1, 7, 10, 2),
        Block.makeCuboidShape(9, 3, 1, 10, 10, 2),
        Block.makeCuboidShape(12, 3, 1, 14, 10, 2),
        Block.makeCuboidShape(2, 3, 14, 4, 10, 15),
        Block.makeCuboidShape(6, 3, 14, 7, 10, 15),
        Block.makeCuboidShape(9, 3, 14, 10, 10, 15),
        Block.makeCuboidShape(12, 3, 14, 14, 10, 15),
        Block.makeCuboidShape(1, 3, 12, 2, 10, 14),
        Block.makeCuboidShape(1, 3, 9, 2, 10, 10),
        Block.makeCuboidShape(1, 3, 6, 2, 10, 7),
        Block.makeCuboidShape(1, 3, 2, 2, 10, 4),
        Block.makeCuboidShape(14, 3, 12, 15, 10, 14),
        Block.makeCuboidShape(14, 3, 9, 15, 10, 10),
        Block.makeCuboidShape(14, 3, 6, 15, 10, 7),
        Block.makeCuboidShape(14, 3, 2, 15, 10, 4)
).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    public BlockBluestoneChest(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntityTypes.bluestone_chest_tile_entity.get().create();
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult result) {
        if (!worldIn.isRemote) {
            TileEntity tile = worldIn.getTileEntity(pos);
            if (tile instanceof BluestoneChestTileEntity) {
                NetworkHooks.openGui((ServerPlayerEntity) player, (BluestoneChestTileEntity) tile, pos);
                return ActionResultType.SUCCESS;
            }
        }
        return ActionResultType.FAIL;
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            TileEntity te = worldIn.getTileEntity(pos);
            if (te instanceof BluestoneChestTileEntity) {
                InventoryHelper.dropItems(worldIn, pos, ((BluestoneChestTileEntity) te).getItems());
            }
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_N;
    }
}