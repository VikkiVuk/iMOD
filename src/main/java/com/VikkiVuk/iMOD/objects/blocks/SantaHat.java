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

import java.util.Set;
import java.util.stream.Stream;

public class SantaHat extends Block {

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(5, 4, 5, 6, 6, 11),
            Block.createCuboidShape(3, 0, 3, 4, 2, 13),
            Block.createCuboidShape(12, 0, 3, 13, 2, 13),
            Block.createCuboidShape(4, 0, 3, 12, 2, 4),
            Block.createCuboidShape(4, 0, 12, 12, 2, 13),
            Block.createCuboidShape(4, 2, 11, 12, 4, 12),
            Block.createCuboidShape(4, 2, 4, 12, 4, 5),
            Block.createCuboidShape(11, 2, 5, 12, 4, 11),
            Block.createCuboidShape(4, 2, 5, 5, 4, 11),
            Block.createCuboidShape(10, 4, 5, 11, 6, 11),
            Block.createCuboidShape(6, 4, 5, 10, 6, 6),
            Block.createCuboidShape(6, 4, 10, 10, 6, 11),
            Block.createCuboidShape(6, 6, 9, 10, 8, 10),
            Block.createCuboidShape(6, 6, 6, 10, 8, 7),
            Block.createCuboidShape(9, 6, 7, 10, 8, 9),
            Block.createCuboidShape(6, 6, 7, 7, 8, 9),
            Block.createCuboidShape(7, 8, 7, 9, 10, 9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    public SantaHat() {
        super(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).hardness(2.1f).breakByTool(FabricToolTags.SHEARS, 2).requiresTool());
    }

    public static VoxelShape getShapeN() {
        return SHAPE_N;
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
