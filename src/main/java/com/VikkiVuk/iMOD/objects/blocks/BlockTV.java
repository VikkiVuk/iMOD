package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.Optional;
import java.util.stream.Stream;

public class BlockTV extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(-2, 1, 5, 18, 13, 7),
            Block.makeCuboidShape(-1, 6, 4, 0, 7, 5),
            Block.makeCuboidShape(-1, 2, 4, 0, 3, 5),
            Block.makeCuboidShape(-1, 4, 4, 0, 5, 5),
            Block.makeCuboidShape(13, 0, 3, 15, 1, 9),
            Block.makeCuboidShape(1, 0, 3, 3, 1, 9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(-2, 1, 9, 18, 13, 11),
            Block.makeCuboidShape(16, 6, 11, 17, 7, 12),
            Block.makeCuboidShape(16, 2, 11, 17, 3, 12),
            Block.makeCuboidShape(16, 4, 11, 17, 5, 12),
            Block.makeCuboidShape(1, 0, 7, 3, 1, 13),
            Block.makeCuboidShape(13, 0, 7, 15, 1, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(9, 1, -2, 11, 13, 18),
            Block.makeCuboidShape(11, 6, -1, 12, 7, 0),
            Block.makeCuboidShape(11, 2, -1, 12, 3, 0),
            Block.makeCuboidShape(11, 4, -1, 12, 5, 0),
            Block.makeCuboidShape(7, 0, 13, 13, 1, 15),
            Block.makeCuboidShape(7, 0, 1, 13, 1, 3)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_w = Stream.of(
            Block.makeCuboidShape(5, 1, -2, 7, 13, 18),
            Block.makeCuboidShape(4, 6, 16, 5, 7, 17),
            Block.makeCuboidShape(4, 2, 16, 5, 3, 17),
            Block.makeCuboidShape(4, 4, 16, 5, 5, 17),
            Block.makeCuboidShape(3, 0, 1, 9, 1, 3),
            Block.makeCuboidShape(3, 0, 13, 9, 1, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public BlockTV() {
        super(Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(2.1f));
        setRegistryName("tv");
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
                return SHAPE_w;
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
