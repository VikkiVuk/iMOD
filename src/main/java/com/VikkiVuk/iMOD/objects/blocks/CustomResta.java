package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class CustomResta extends Block {

    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(13, 5, 13, 14, 6, 14),
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(1, 4, 1, 15, 5, 15),
            Block.createCuboidShape(2, 5, 2, 3, 6, 3),
            Block.createCuboidShape(2, 5, 13, 3, 6, 14),
            Block.createCuboidShape(13, 5, 2, 14, 6, 3),
            Block.createCuboidShape(0, 6, 0, 16, 7, 16)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    public CustomResta() {
        super(Settings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).hardness(2.1f));
    }

    public static VoxelShape getShapeN() {
        return SHAPE_N;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerLookDirection().getOpposite());
    }


    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
