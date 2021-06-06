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


public class BlockCGM extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(1, 1, 7, 2, 3, 9),
            Block.makeCuboidShape(14, 1, 7, 15, 3, 9),
            Block.makeCuboidShape(14, 1, 1, 15, 3, 3),
            Block.makeCuboidShape(14, 1, 13, 15, 3, 15),
            Block.makeCuboidShape(1, 1, 13, 2, 3, 15),
            Block.makeCuboidShape(1, 1, 1, 2, 3, 3),
            Block.makeCuboidShape(0, 3, 0, 16, 5, 17),
            Block.makeCuboidShape(1, 5, 1, 15, 7, 16),
            Block.makeCuboidShape(0, 8, 0, 1, 9, 17),
            Block.makeCuboidShape(1, 7, 0, 2, 8, 17),
            Block.makeCuboidShape(14, 7, 0, 15, 8, 17),
            Block.makeCuboidShape(15, 8, 0, 16, 9, 17),
            Block.makeCuboidShape(2, 7, 16, 14, 8, 17),
            Block.makeCuboidShape(2, 8, 17, 14, 9, 18),
            Block.makeCuboidShape(2, 7, 0, 14, 8, 1),
            Block.makeCuboidShape(2, 8, -1, 14, 9, 0),
            Block.makeCuboidShape(5, 7, 5, 11, 13, 12)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public BlockCGM() {
        super(Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(2.1f));
        //setRegistryName("custom_glassy_mobble");
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
