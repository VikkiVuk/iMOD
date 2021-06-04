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

public class BlockSpeaker extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 0, 6, 11, 13, 7), Block.makeCuboidShape(4, 0, 7, 11, 16, 11), IBooleanFunction.OR);
    private static final VoxelShape SHAPE_S = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(5, 0, 9, 12, 13, 10), Block.makeCuboidShape(5, 0, 5, 12, 16, 9), IBooleanFunction.OR);
    private static final VoxelShape SHAPE_W = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(6, 0, 5, 7, 13, 12), Block.makeCuboidShape(7, 0, 5, 11, 16, 12), IBooleanFunction.OR);
    private static final VoxelShape SHAPE_E = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(9, 0, 4, 10, 13, 11), Block.makeCuboidShape(5, 0, 4, 9, 16, 11), IBooleanFunction.OR);

    public BlockSpeaker() {
        super(Properties.create(Material.WOOL).hardnessAndResistance(5.1f, 30f).sound(SoundType.CLOTH));
        setRegistryName("speaker");
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
