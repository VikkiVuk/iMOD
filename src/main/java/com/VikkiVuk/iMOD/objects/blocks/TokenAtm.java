package com.VikkiVuk.iMOD.objects.blocks;

import com.ibm.icu.impl.CalendarAstronomer;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class TokenAtm extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(1, 1, -6, 15, 23, 17),
            Block.makeCuboidShape(5, 11, 17, 11, 22, 18),
            Block.makeCuboidShape(11, 7, 17, 13, 22, 18),
            Block.makeCuboidShape(3, 7, 17, 5, 22, 18),
            Block.makeCuboidShape(4, 16, 18, 12, 20, 19),
            Block.makeCuboidShape(6, 10, 17, 10, 11, 18),
            Block.makeCuboidShape(10, 7, 17, 11, 11, 18),
            Block.makeCuboidShape(5, 7, 17, 6, 11, 18),
            Block.makeCuboidShape(3, 22, 17, 13, 23, 18),
            Block.makeCuboidShape(13, 7, 17, 15, 23, 18),
            Block.makeCuboidShape(1, 7, 17, 3, 23, 18),
            Block.makeCuboidShape(1, 1, 17, 15, 7, 18),
            Block.makeCuboidShape(1, 23, -14, 15, 24, 18),
            Block.makeCuboidShape(1, 0, -14, 15, 1, 18),
            Block.makeCuboidShape(15, 0, -14, 16, 24, 18),
            Block.makeCuboidShape(0, 0, -14, 1, 24, 18),
            Block.makeCuboidShape(0, 0, -16, 16, 24, -14)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_N = Stream.of(
                    Block.makeCuboidShape(0, 0, 30, 16, 24, 32),
                    Block.makeCuboidShape(1, 1, -1, 15, 23, 22),
                    Block.makeCuboidShape(5, 11, -2, 11, 22, -1),
                    Block.makeCuboidShape(3, 7, -2, 5, 22, -1),
                    Block.makeCuboidShape(11, 7, -2, 13, 22, -1),
                    Block.makeCuboidShape(4, 16, -3, 12, 20, -2),
                    Block.makeCuboidShape(6, 10, -2, 10, 11, -1),
                    Block.makeCuboidShape(5, 7, -2, 6, 11, -1),
                    Block.makeCuboidShape(10, 7, -2, 11, 11, -1),
                    Block.makeCuboidShape(3, 22, -2, 13, 23, -1),
                    Block.makeCuboidShape(1, 7, -2, 3, 23, -1),
                    Block.makeCuboidShape(13, 7, -2, 15, 23, -1),
                    Block.makeCuboidShape(1, 1, -2, 15, 7, -1),
                    Block.makeCuboidShape(1, 23, -2, 15, 24, 30),
                    Block.makeCuboidShape(1, 0, -2, 15, 1, 30),
                    Block.makeCuboidShape(0, 0, -2, 1, 24, 30),
                    Block.makeCuboidShape(15, 0, -2, 16, 24, 30)
            ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(30, 0, 0, 32, 24, 16),
            Block.makeCuboidShape(-1, 1, 1, 22, 23, 15),
            Block.makeCuboidShape(-2, 11, 5, -1, 22, 11),
            Block.makeCuboidShape(-2, 7, 11, -1, 22, 13),
            Block.makeCuboidShape(-2, 7, 3, -1, 22, 5),
            Block.makeCuboidShape(-3, 16, 4, -2, 20, 12),
            Block.makeCuboidShape(-2, 10, 6, -1, 11, 10),
            Block.makeCuboidShape(-2, 7, 10, -1, 11, 11),
            Block.makeCuboidShape(-2, 7, 5, -1, 11, 6),
            Block.makeCuboidShape(-2, 22, 3, -1, 23, 13),
            Block.makeCuboidShape(-2, 7, 13, -1, 23, 15),
            Block.makeCuboidShape(-2, 7, 1, -1, 23, 3),
            Block.makeCuboidShape(-2, 1, 1, -1, 7, 15),
            Block.makeCuboidShape(-2, 23, 1, 30, 24, 15),
            Block.makeCuboidShape(-2, 0, 1, 30, 1, 15),
            Block.makeCuboidShape(-2, 0, 15, 30, 24, 16),
            Block.makeCuboidShape(-2, 0, 0, 30, 24, 1)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(-16, 0, 0, -14, 24, 16),
            Block.makeCuboidShape(-6, 1, 1, 17, 23, 15),
            Block.makeCuboidShape(17, 11, 5, 18, 22, 11),
            Block.makeCuboidShape(17, 7, 3, 18, 22, 5),
            Block.makeCuboidShape(17, 7, 11, 18, 22, 13),
            Block.makeCuboidShape(18, 16, 4, 19, 20, 12),
            Block.makeCuboidShape(17, 10, 6, 18, 11, 10),
            Block.makeCuboidShape(17, 7, 5, 18, 11, 6),
            Block.makeCuboidShape(17, 7, 10, 18, 11, 11),
            Block.makeCuboidShape(17, 22, 3, 18, 23, 13),
            Block.makeCuboidShape(17, 7, 1, 18, 23, 3),
            Block.makeCuboidShape(17, 7, 13, 18, 23, 15),
            Block.makeCuboidShape(17, 1, 1, 18, 7, 15),
            Block.makeCuboidShape(-14, 23, 1, 18, 24, 15),
            Block.makeCuboidShape(-14, 0, 1, 18, 1, 15),
            Block.makeCuboidShape(-14, 0, 0, 18, 24, 1),
            Block.makeCuboidShape(-14, 0, 15, 18, 24, 16)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public TokenAtm() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.1f,10f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)

        );
        setRegistryName("token_atm");

        this.setDefaultState(this.getStateContainer().getBaseState().with(FACING, Direction.NORTH));

    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch(state.get(FACING))
        {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;

        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }


}
