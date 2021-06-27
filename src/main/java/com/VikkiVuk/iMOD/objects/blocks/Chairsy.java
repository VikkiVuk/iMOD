package com.VikkiVuk.iMOD.objects.blocks;

import com.ibm.icu.impl.CalendarAstronomer;
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
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.stream.Stream;

public class Chairsy extends Block {

    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

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
