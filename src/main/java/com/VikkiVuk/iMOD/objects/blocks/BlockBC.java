package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class BlockBC extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.makeCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.makeCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.makeCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.makeCuboidShape(2, 3, 2, 14, 4, 14),
            Block.makeCuboidShape(2, 4, 2, 14, 14, 3),
            Block.makeCuboidShape(2, 4, 13, 14, 14, 14),
            Block.makeCuboidShape(13, 4, 3, 14, 14, 13),
            Block.makeCuboidShape(2, 4, 3, 3, 14, 13),
            Block.makeCuboidShape(14, 12, 0, 15, 13, 9),
            Block.makeCuboidShape(1, 12, 0, 2, 13, 9),
            Block.makeCuboidShape(2, 12, 0, 14, 13, 1)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.makeCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.makeCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.makeCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.makeCuboidShape(2, 3, 2, 14, 4, 14),
            Block.makeCuboidShape(2, 4, 13, 14, 14, 14),
            Block.makeCuboidShape(2, 4, 2, 14, 14, 3),
            Block.makeCuboidShape(2, 4, 3, 3, 14, 13),
            Block.makeCuboidShape(13, 4, 3, 14, 14, 13),
            Block.makeCuboidShape(1, 12, 7, 2, 13, 16),
            Block.makeCuboidShape(14, 12, 7, 15, 13, 16),
            Block.makeCuboidShape(2, 12, 15, 14, 13, 16)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.makeCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.makeCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.makeCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.makeCuboidShape(2, 3, 2, 14, 4, 14),
            Block.makeCuboidShape(2, 4, 2, 3, 14, 14),
            Block.makeCuboidShape(13, 4, 2, 14, 14, 14),
            Block.makeCuboidShape(3, 4, 2, 13, 14, 3),
            Block.makeCuboidShape(3, 4, 13, 13, 14, 14),
            Block.makeCuboidShape(0, 12, 1, 9, 13, 2),
            Block.makeCuboidShape(0, 12, 14, 9, 13, 15),
            Block.makeCuboidShape(0, 12, 2, 1, 13, 14)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.makeCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.makeCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.makeCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.makeCuboidShape(2, 3, 2, 14, 4, 14),
            Block.makeCuboidShape(13, 4, 2, 14, 14, 14),
            Block.makeCuboidShape(2, 4, 2, 3, 14, 14),
            Block.makeCuboidShape(3, 4, 13, 13, 14, 14),
            Block.makeCuboidShape(3, 4, 2, 13, 14, 3),
            Block.makeCuboidShape(7, 12, 14, 16, 13, 15),
            Block.makeCuboidShape(7, 12, 1, 16, 13, 2),
            Block.makeCuboidShape(15, 12, 2, 16, 13, 14)
            ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public BlockBC() {
        super(Properties.create(Material.IRON).hardnessAndResistance(5.1f, 30f).sound(SoundType.METAL));
        setRegistryName("better_cauldron");
        this.setDefaultState(this.getStateContainer().getBaseState().with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch(state.get(FACING))
        {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;

        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }



}
