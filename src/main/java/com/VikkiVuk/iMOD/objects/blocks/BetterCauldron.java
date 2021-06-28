package com.VikkiVuk.iMOD.objects.blocks;

import com.VikkiVuk.iMOD.registry.BlockInit;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
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
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class BetterCauldron extends AbstractCauldronBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.createCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.createCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.createCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.createCuboidShape(2, 3, 2, 14, 4, 14),
            Block.createCuboidShape(2, 4, 2, 14, 14, 3),
            Block.createCuboidShape(2, 4, 13, 14, 14, 14),
            Block.createCuboidShape(13, 4, 3, 14, 14, 13),
            Block.createCuboidShape(2, 4, 3, 3, 14, 13),
            Block.createCuboidShape(14, 12, 0, 15, 13, 9),
            Block.createCuboidShape(1, 12, 0, 2, 13, 9),
            Block.createCuboidShape(2, 12, 0, 14, 13, 1)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.createCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.createCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.createCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.createCuboidShape(2, 3, 2, 14, 4, 14),
            Block.createCuboidShape(2, 4, 13, 14, 14, 14),
            Block.createCuboidShape(2, 4, 2, 14, 14, 3),
            Block.createCuboidShape(2, 4, 3, 3, 14, 13),
            Block.createCuboidShape(13, 4, 3, 14, 14, 13),
            Block.createCuboidShape(1, 12, 7, 2, 13, 16),
            Block.createCuboidShape(14, 12, 7, 15, 13, 16),
            Block.createCuboidShape(2, 12, 15, 14, 13, 16)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.createCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.createCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.createCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.createCuboidShape(2, 3, 2, 14, 4, 14),
            Block.createCuboidShape(2, 4, 2, 3, 14, 14),
            Block.createCuboidShape(13, 4, 2, 14, 14, 14),
            Block.createCuboidShape(3, 4, 2, 13, 14, 3),
            Block.createCuboidShape(3, 4, 13, 13, 14, 14),
            Block.createCuboidShape(0, 12, 1, 9, 13, 2),
            Block.createCuboidShape(0, 12, 14, 9, 13, 15),
            Block.createCuboidShape(0, 12, 2, 1, 13, 14)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.createCuboidShape(0, 0, 6.5, 16, 3, 9.5),
            Block.createCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.createCuboidShape(6.5, 0, 0, 9.5, 3, 16),
            Block.createCuboidShape(2, 3, 2, 14, 4, 14),
            Block.createCuboidShape(13, 4, 2, 14, 14, 14),
            Block.createCuboidShape(2, 4, 2, 3, 14, 14),
            Block.createCuboidShape(3, 4, 13, 13, 14, 14),
            Block.createCuboidShape(3, 4, 2, 13, 14, 3),
            Block.createCuboidShape(7, 12, 14, 16, 13, 15),
            Block.createCuboidShape(7, 12, 1, 16, 13, 2),
            Block.createCuboidShape(15, 12, 2, 16, 13, 14)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    public BetterCauldron() {
        super(FabricBlockSettings.of(Material.METAL).hardness(5.1f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool(), CauldronBehavior.EMPTY_CAULDRON_BEHAVIOR);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH));
    }

    public boolean isFull(BlockState state) {
        return false;
    }

    protected static boolean canFillWithPrecipitation(World world) {
        return world.random.nextInt(20) == 1;
    }

    public void precipitationTick(BlockState state, World world, BlockPos pos, Biome.Precipitation precipitation) {
        if (canFillWithPrecipitation(world)) {
            if (precipitation == Biome.Precipitation.RAIN) {
                world.setBlockState(pos, Blocks.WATER_CAULDRON.getDefaultState());
                world.emitGameEvent((Entity)null, GameEvent.FLUID_PLACE, pos);
            } else if (precipitation == Biome.Precipitation.SNOW) {
                world.setBlockState(pos, Blocks.POWDER_SNOW_CAULDRON.getDefaultState());
                world.emitGameEvent((Entity)null, GameEvent.FLUID_PLACE, pos);
            }

        }
    }

    protected boolean canBeFilledByDripstone(Fluid fluid) {
        return true;
    }

    protected void fillFromDripstone(BlockState state, World world, BlockPos pos, Fluid fluid) {
        if (fluid == Fluids.WATER) {
            world.setBlockState(pos, Blocks.WATER_CAULDRON.getDefaultState());
            world.syncWorldEvent(1047, pos, 0);
            world.emitGameEvent((Entity)null, GameEvent.FLUID_PLACE, pos);
        } else if (fluid == Fluids.LAVA) {
            world.setBlockState(pos, Blocks.LAVA_CAULDRON.getDefaultState());
            world.syncWorldEvent(1046, pos, 0);
            world.emitGameEvent((Entity)null, GameEvent.FLUID_PLACE, pos);
        }

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
}
