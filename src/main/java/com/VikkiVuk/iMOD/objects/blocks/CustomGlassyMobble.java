package com.VikkiVuk.iMOD.objects.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class CustomGlassyMobble extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

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
