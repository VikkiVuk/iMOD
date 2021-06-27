package com.VikkiVuk.iMOD.objects.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class WifiRouter extends Block {

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(8, 2, 9, 9, 3, 10),
            Block.createCuboidShape(3, 0, 5, 13, 1, 10),
            Block.createCuboidShape(1, 1, 6, 15, 12, 9),
            Block.createCuboidShape(13, 10, 5, 14, 11, 6),
            Block.createCuboidShape(12, 10, 5, 13, 11, 6),
            Block.createCuboidShape(11, 10, 5, 12, 11, 6),
            Block.createCuboidShape(9, 10, 5, 10, 11, 6),
            Block.createCuboidShape(5, 10, 5, 6, 11, 6),
            Block.createCuboidShape(0, 4, 7, 1, 5, 8),
            Block.createCuboidShape(0, 6, 7, 1, 7, 8),
            Block.createCuboidShape(2, 2, 9, 3, 3, 10),
            Block.createCuboidShape(3, 2, 9, 4, 3, 10),
            Block.createCuboidShape(4, 2, 9, 5, 3, 10),
            Block.createCuboidShape(5, 2, 9, 6, 3, 10),
            Block.createCuboidShape(6, 2, 9, 7, 3, 10)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public WifiRouter() {
        super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).hardness(2.1f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
    }

    public static VoxelShape getShapeN() {
        return SHAPE_N;
    }
}
