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

public class CustomResta extends Block {

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
        super(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).hardness(2.1f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
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
