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

public class CustomResta extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

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
