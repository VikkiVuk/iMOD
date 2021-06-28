package com.VikkiVuk.iMOD.objects.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class WifiRouter extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

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
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch(state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_N;
            case WEST:
                return SHAPE_N;
            case EAST:
                return SHAPE_N;
            default:
                return SHAPE_N;
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
