package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
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
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class WifiRouter extends Block {
    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(8, 2, 9, 9, 3, 10),
            Block.makeCuboidShape(3, 0, 5, 13, 1, 10),
            Block.makeCuboidShape(1, 1, 6, 15, 12, 9),
            Block.makeCuboidShape(13, 10, 5, 14, 11, 6),
            Block.makeCuboidShape(12, 10, 5, 13, 11, 6),
            Block.makeCuboidShape(11, 10, 5, 12, 11, 6),
            Block.makeCuboidShape(9, 10, 5, 10, 11, 6),
            Block.makeCuboidShape(5, 10, 5, 6, 11, 6),
            Block.makeCuboidShape(0, 4, 7, 1, 5, 8),
            Block.makeCuboidShape(0, 6, 7, 1, 7, 8),
            Block.makeCuboidShape(2, 2, 9, 3, 3, 10),
            Block.makeCuboidShape(3, 2, 9, 4, 3, 10),
            Block.makeCuboidShape(4, 2, 9, 5, 3, 10),
            Block.makeCuboidShape(5, 2, 9, 6, 3, 10),
            Block.makeCuboidShape(6, 2, 9, 7, 3, 10)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


    public WifiRouter() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.1f,10f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)

        );
        //setRegistryName("wifi_router");
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_N;
    }
}
