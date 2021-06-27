package com.VikkiVuk.iMOD.objects.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class TV extends Block {

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(-2, 1, 5, 18, 13, 7),
            Block.createCuboidShape(-1, 6, 4, 0, 7, 5),
            Block.createCuboidShape(-1, 2, 4, 0, 3, 5),
            Block.createCuboidShape(-1, 4, 4, 0, 5, 5),
            Block.createCuboidShape(13, 0, 3, 15, 1, 9),
            Block.createCuboidShape(1, 0, 3, 3, 1, 9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(-2, 1, 9, 18, 13, 11),
            Block.createCuboidShape(16, 6, 11, 17, 7, 12),
            Block.createCuboidShape(16, 2, 11, 17, 3, 12),
            Block.createCuboidShape(16, 4, 11, 17, 5, 12),
            Block.createCuboidShape(1, 0, 7, 3, 1, 13),
            Block.createCuboidShape(13, 0, 7, 15, 1, 13)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(9, 1, -2, 11, 13, 18),
            Block.createCuboidShape(11, 6, -1, 12, 7, 0),
            Block.createCuboidShape(11, 2, -1, 12, 3, 0),
            Block.createCuboidShape(11, 4, -1, 12, 5, 0),
            Block.createCuboidShape(7, 0, 13, 13, 1, 15),
            Block.createCuboidShape(7, 0, 1, 13, 1, 3)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(5, 1, -2, 7, 13, 18),
            Block.createCuboidShape(4, 6, 16, 5, 7, 17),
            Block.createCuboidShape(4, 2, 16, 5, 3, 17),
            Block.createCuboidShape(4, 4, 16, 5, 5, 17),
            Block.createCuboidShape(3, 0, 1, 9, 1, 3),
            Block.createCuboidShape(3, 0, 13, 9, 1, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    public TV() {
        super(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL).hardness(2.1f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
    }

    public static VoxelShape getShapeN() {
        return SHAPE_N;
    }

    public static VoxelShape getShapeE() {
        return SHAPE_E;
    }

    public static VoxelShape getShapeW() {
        return SHAPE_W;
    }

    public static VoxelShape getShapeS() {
        return SHAPE_S;
    }

    @Override
    public boolean isShapeFullCube(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
