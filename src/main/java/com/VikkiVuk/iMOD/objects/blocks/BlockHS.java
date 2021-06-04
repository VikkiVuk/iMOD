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

public class BlockHS extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 16, 16),
            Block.makeCuboidShape(0, 16, 15, 16, 19, 16),
            Block.makeCuboidShape(9, 16, 8, 13, 19, 14),
            Block.makeCuboidShape(5, 16, 3, 6, 17, 9),
            Block.makeCuboidShape(12, 3, -1, 13, 14, 0),
            Block.makeCuboidShape(3, 3, -1, 4, 14, 0),
            Block.makeCuboidShape(4, 8, -1, 12, 9, 0),
            Block.makeCuboidShape(13, 16, 1, 15, 18, 6),
            Block.makeCuboidShape(1, 16, 8, 3, 18, 13),
            Block.makeCuboidShape(1, 16, 1, 11, 17, 2)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 16, 16),
            Block.makeCuboidShape(0, 16, 0, 16, 19, 1),
            Block.makeCuboidShape(3, 16, 2, 7, 19, 8),
            Block.makeCuboidShape(10, 16, 7, 11, 17, 13),
            Block.makeCuboidShape(3, 3, 16, 4, 14, 17),
            Block.makeCuboidShape(12, 3, 16, 13, 14, 17),
            Block.makeCuboidShape(4, 8, 16, 12, 9, 17),
            Block.makeCuboidShape(1, 16, 10, 3, 18, 15),
            Block.makeCuboidShape(13, 16, 3, 15, 18, 8),
            Block.makeCuboidShape(5, 16, 14, 15, 17, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 16, 16),
            Block.makeCuboidShape(15, 16, 0, 16, 19, 16),
            Block.makeCuboidShape(8, 16, 3, 14, 19, 7),
            Block.makeCuboidShape(3, 16, 10, 9, 17, 11),
            Block.makeCuboidShape(-1, 3, 3, 0, 14, 4),
            Block.makeCuboidShape(-1, 3, 12, 0, 14, 13),
            Block.makeCuboidShape(-1, 8, 4, 0, 9, 12),
            Block.makeCuboidShape(1, 16, 1, 6, 18, 3),
            Block.makeCuboidShape(8, 16, 13, 13, 18, 15),
            Block.makeCuboidShape(1, 16, 5, 2, 17, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 16, 16),
            Block.makeCuboidShape(0, 16, 0, 1, 19, 16),
            Block.makeCuboidShape(2, 16, 9, 8, 19, 13),
            Block.makeCuboidShape(7, 16, 5, 13, 17, 6),
            Block.makeCuboidShape(16, 3, 12, 17, 14, 13),
            Block.makeCuboidShape(16, 3, 3, 17, 14, 4),
            Block.makeCuboidShape(16, 8, 4, 17, 9, 12),
            Block.makeCuboidShape(10, 16, 13, 15, 18, 15),
            Block.makeCuboidShape(3, 16, 1, 8, 18, 3),
            Block.makeCuboidShape(14, 16, 1, 15, 17, 11)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public BlockHS() {
        super(Properties.create(Material.WOOL).hardnessAndResistance(5.1f, 30f).sound(SoundType.CLOTH));
        setRegistryName("hystel_something");
        this.setDefaultState(this.getStateContainer().getBaseState().with(FACING, Direction.NORTH));
        // TODO Auto-generated constructor stub
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
