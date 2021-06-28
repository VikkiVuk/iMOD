package com.VikkiVuk.iMOD.objects.blocks;

import com.VikkiVuk.iMOD.registry.ItemInit;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
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

import java.util.stream.Stream;

public class TokenATM extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(1, 1, -6, 15, 23, 17),
            Block.createCuboidShape(5, 11, 17, 11, 22, 18),
            Block.createCuboidShape(11, 7, 17, 13, 22, 18),
            Block.createCuboidShape(3, 7, 17, 5, 22, 18),
            Block.createCuboidShape(4, 16, 18, 12, 20, 19),
            Block.createCuboidShape(6, 10, 17, 10, 11, 18),
            Block.createCuboidShape(10, 7, 17, 11, 11, 18),
            Block.createCuboidShape(5, 7, 17, 6, 11, 18),
            Block.createCuboidShape(3, 22, 17, 13, 23, 18),
            Block.createCuboidShape(13, 7, 17, 15, 23, 18),
            Block.createCuboidShape(1, 7, 17, 3, 23, 18),
            Block.createCuboidShape(1, 1, 17, 15, 7, 18),
            Block.createCuboidShape(1, 23, -14, 15, 24, 18),
            Block.createCuboidShape(1, 0, -14, 15, 1, 18),
            Block.createCuboidShape(15, 0, -14, 16, 24, 18),
            Block.createCuboidShape(0, 0, -14, 1, 24, 18),
            Block.createCuboidShape(0, 0, -16, 16, 24, -14)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(0, 0, 30, 16, 24, 32),
            Block.createCuboidShape(1, 1, -1, 15, 23, 22),
            Block.createCuboidShape(5, 11, -2, 11, 22, -1),
            Block.createCuboidShape(3, 7, -2, 5, 22, -1),
            Block.createCuboidShape(11, 7, -2, 13, 22, -1),
            Block.createCuboidShape(4, 16, -3, 12, 20, -2),
            Block.createCuboidShape(6, 10, -2, 10, 11, -1),
            Block.createCuboidShape(5, 7, -2, 6, 11, -1),
            Block.createCuboidShape(10, 7, -2, 11, 11, -1),
            Block.createCuboidShape(3, 22, -2, 13, 23, -1),
            Block.createCuboidShape(1, 7, -2, 3, 23, -1),
            Block.createCuboidShape(13, 7, -2, 15, 23, -1),
            Block.createCuboidShape(1, 1, -2, 15, 7, -1),
            Block.createCuboidShape(1, 23, -2, 15, 24, 30),
            Block.createCuboidShape(1, 0, -2, 15, 1, 30),
            Block.createCuboidShape(0, 0, -2, 1, 24, 30),
            Block.createCuboidShape(15, 0, -2, 16, 24, 30)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(30, 0, 0, 32, 24, 16),
            Block.createCuboidShape(-1, 1, 1, 22, 23, 15),
            Block.createCuboidShape(-2, 11, 5, -1, 22, 11),
            Block.createCuboidShape(-2, 7, 11, -1, 22, 13),
            Block.createCuboidShape(-2, 7, 3, -1, 22, 5),
            Block.createCuboidShape(-3, 16, 4, -2, 20, 12),
            Block.createCuboidShape(-2, 10, 6, -1, 11, 10),
            Block.createCuboidShape(-2, 7, 10, -1, 11, 11),
            Block.createCuboidShape(-2, 7, 5, -1, 11, 6),
            Block.createCuboidShape(-2, 22, 3, -1, 23, 13),
            Block.createCuboidShape(-2, 7, 13, -1, 23, 15),
            Block.createCuboidShape(-2, 7, 1, -1, 23, 3),
            Block.createCuboidShape(-2, 1, 1, -1, 7, 15),
            Block.createCuboidShape(-2, 23, 1, 30, 24, 15),
            Block.createCuboidShape(-2, 0, 1, 30, 1, 15),
            Block.createCuboidShape(-2, 0, 15, 30, 24, 16),
            Block.createCuboidShape(-2, 0, 0, 30, 24, 1)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(-16, 0, 0, -14, 24, 16),
            Block.createCuboidShape(-6, 1, 1, 17, 23, 15),
            Block.createCuboidShape(17, 11, 5, 18, 22, 11),
            Block.createCuboidShape(17, 7, 3, 18, 22, 5),
            Block.createCuboidShape(17, 7, 11, 18, 22, 13),
            Block.createCuboidShape(18, 16, 4, 19, 20, 12),
            Block.createCuboidShape(17, 10, 6, 18, 11, 10),
            Block.createCuboidShape(17, 7, 5, 18, 11, 6),
            Block.createCuboidShape(17, 7, 10, 18, 11, 11),
            Block.createCuboidShape(17, 22, 3, 18, 23, 13),
            Block.createCuboidShape(17, 7, 1, 18, 23, 3),
            Block.createCuboidShape(17, 7, 13, 18, 23, 15),
            Block.createCuboidShape(17, 1, 1, 18, 7, 15),
            Block.createCuboidShape(-14, 23, 1, 18, 24, 15),
            Block.createCuboidShape(-14, 0, 1, 18, 1, 15),
            Block.createCuboidShape(-14, 0, 0, 18, 24, 1),
            Block.createCuboidShape(-14, 0, 15, 18, 24, 16)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR);}).get();

    public TokenATM() {
        super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).hardness(2.1f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
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
        ItemStack itemStack = player.getStackInHand(hand);

        if (player.isHolding(ItemInit.bluestone_token) || player.isHolding(ItemInit.ruby_token) || player.isHolding(ItemInit.copper_token) || player.isHolding(ItemInit.rainbow_token)) {
            player.dropItem(itemStack, true, false);
            return ActionResult.SUCCESS;
        } else {
            return ActionResult.FAIL;
        }
    }
}
