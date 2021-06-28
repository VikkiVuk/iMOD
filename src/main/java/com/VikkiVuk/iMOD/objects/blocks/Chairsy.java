package com.VikkiVuk.iMOD.objects.blocks;

import com.ibm.icu.impl.CalendarAstronomer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.stream.Stream;

public class Chairsy extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(14, 10, 0, 16, 12, 16),
            Block.createCuboidShape(14, 0, 0, 16, 2, 16),
            Block.createCuboidShape(0, 10, 0, 2, 12, 16),
            Block.createCuboidShape(14, 2, 0, 16, 10, 2),
            Block.createCuboidShape(14, 2, 14, 16, 10, 16),
            Block.createCuboidShape(0, 2, 14, 2, 10, 16),
            Block.createCuboidShape(0, 2, 0, 2, 10, 2),
            Block.createCuboidShape(2, 0, 0, 14, 7, 16),
            Block.createCuboidShape(2, 7, 11, 14, 16, 16),
            Block.createCuboidShape(0, 0, 0, 2, 2, 16)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(0, 10, 0, 2, 12, 16),
            Block.createCuboidShape(0, 0, 0, 2, 2, 16),
            Block.createCuboidShape(14, 10, 0, 16, 12, 16),
            Block.createCuboidShape(0, 2, 14, 2, 10, 16),
            Block.createCuboidShape(0, 2, 0, 2, 10, 2),
            Block.createCuboidShape(14, 2, 0, 16, 10, 2),
            Block.createCuboidShape(14, 2, 14, 16, 10, 16),
            Block.createCuboidShape(2, 0, 0, 14, 7, 16),
            Block.createCuboidShape(2, 7, 0, 14, 16, 5),
            Block.createCuboidShape(14, 0, 0, 16, 2, 16)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 10, 0, 16, 12, 2),
            Block.createCuboidShape(0, 0, 0, 16, 2, 2),
            Block.createCuboidShape(0, 10, 14, 16, 12, 16),
            Block.createCuboidShape(0, 2, 0, 2, 10, 2),
            Block.createCuboidShape(14, 2, 0, 16, 10, 2),
            Block.createCuboidShape(14, 2, 14, 16, 10, 16),
            Block.createCuboidShape(0, 2, 14, 2, 10, 16),
            Block.createCuboidShape(0, 0, 2, 16, 7, 14),
            Block.createCuboidShape(11, 7, 2, 16, 16, 14),
            Block.createCuboidShape(0, 0, 14, 16, 2, 16)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(0, 10, 14, 16, 12, 16),
            Block.createCuboidShape(0, 0, 14, 16, 2, 16),
            Block.createCuboidShape(0, 10, 0, 16, 12, 2),
            Block.createCuboidShape(14, 2, 14, 16, 10, 16),
            Block.createCuboidShape(0, 2, 14, 2, 10, 16),
            Block.createCuboidShape(0, 2, 0, 2, 10, 2),
            Block.createCuboidShape(14, 2, 0, 16, 10, 2),
            Block.createCuboidShape(0, 0, 2, 16, 7, 14),
            Block.createCuboidShape(0, 7, 2, 5, 16, 14),
            Block.createCuboidShape(0, 0, 0, 16, 2, 2)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();



    public Chairsy() {
        super(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).hardness(2.0f).breakByTool(FabricToolTags.AXES, 2).requiresTool());
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch(state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
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

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return ActionResult.SUCCESS;
    }
}
