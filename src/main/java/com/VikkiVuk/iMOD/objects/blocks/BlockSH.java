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

import java.util.stream.Stream;

public class BlockSH extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(5, 4, 5, 6, 6, 11),
            Block.makeCuboidShape(3, 0, 3, 4, 2, 13),
            Block.makeCuboidShape(12, 0, 3, 13, 2, 13),
            Block.makeCuboidShape(4, 0, 3, 12, 2, 4),
            Block.makeCuboidShape(4, 0, 12, 12, 2, 13),
            Block.makeCuboidShape(4, 2, 11, 12, 4, 12),
            Block.makeCuboidShape(4, 2, 4, 12, 4, 5),
            Block.makeCuboidShape(11, 2, 5, 12, 4, 11),
            Block.makeCuboidShape(4, 2, 5, 5, 4, 11),
            Block.makeCuboidShape(10, 4, 5, 11, 6, 11),
            Block.makeCuboidShape(6, 4, 5, 10, 6, 6),
            Block.makeCuboidShape(6, 4, 10, 10, 6, 11),
            Block.makeCuboidShape(6, 6, 9, 10, 8, 10),
            Block.makeCuboidShape(6, 6, 6, 10, 8, 7),
            Block.makeCuboidShape(9, 6, 7, 10, 8, 9),
            Block.makeCuboidShape(6, 6, 7, 7, 8, 9),
            Block.makeCuboidShape(7, 8, 7, 9, 10, 9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public BlockSH() {
        super(Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.1f));
        setRegistryName("santa_hat");
    }


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch(state.get(FACING))
        {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_N;
            case EAST:
                return SHAPE_N;
            case WEST:
                return SHAPE_N;
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
