package com.VikkiVuk.iMOD.objects.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
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

public class CustomGlassyMobble extends Block {

    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(0, 0, 0, 16, 1, 16),
            Block.createCuboidShape(1, 1, 7, 2, 3, 9),
            Block.createCuboidShape(14, 1, 7, 15, 3, 9),
            Block.createCuboidShape(14, 1, 1, 15, 3, 3),
            Block.createCuboidShape(14, 1, 13, 15, 3, 15),
            Block.createCuboidShape(1, 1, 13, 2, 3, 15),
            Block.createCuboidShape(1, 1, 1, 2, 3, 3),
            Block.createCuboidShape(0, 3, 0, 16, 5, 17),
            Block.createCuboidShape(1, 5, 1, 15, 7, 16),
            Block.createCuboidShape(0, 8, 0, 1, 9, 17),
            Block.createCuboidShape(1, 7, 0, 2, 8, 17),
            Block.createCuboidShape(14, 7, 0, 15, 8, 17),
            Block.createCuboidShape(15, 8, 0, 16, 9, 17),
            Block.createCuboidShape(2, 7, 16, 14, 8, 17),
            Block.createCuboidShape(2, 8, 17, 14, 9, 18),
            Block.createCuboidShape(2, 7, 0, 14, 8, 1),
            Block.createCuboidShape(2, 8, -1, 14, 9, 0),
            Block.createCuboidShape(5, 7, 5, 11, 13, 12)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    public CustomGlassyMobble() {
        super(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).hardness(2.1f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
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
