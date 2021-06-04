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

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;



    /* Methods */
    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(0.188, 0, 0.312, 0.812, 0.062, 0.625), // BOTTOM
            Block.makeCuboidShape(0.062, 0.062, 0.375, 0.938, 0.75, 0.562), // BASE
            Block.makeCuboidShape(0.812, 0.625, 0.312, 0.875, 0.688, 0.375), // POWER_LED
            Block.makeCuboidShape(0.75, 0.625, 0.312, 0.812, 0.688, 0.375), // DSL_LED
            Block.makeCuboidShape(0.688, 0.625, 0.312, 0.75, 0.688, 0.375), // INTERNET_LED
            Block.makeCuboidShape(0.562, 0.625, 0.312, 0.625, 0.688, 0.375), // LAN1_LED
            Block.makeCuboidShape(0.312, 0.625, 0.312, 0.375, 0.688, 0.375), // WLAN_LED
            Block.makeCuboidShape(0, 0.25, 0.438, 0.062, 0.312, 0.5), // WPS_BUTTON
            Block.makeCuboidShape(0, 0.375, 0.438, 0.062, 0.438, 0.5), // WLAN_BUTTON
            Block.makeCuboidShape(0.125, 0.125, 0.562, 0.188, 0.188, 0.625), // POWERCABLE_HOLE
            Block.makeCuboidShape(0.188, 0.125, 0.562, 0.25, 0.188, 0.625), // LAN1
            Block.makeCuboidShape(0.25, 0.125, 0.562, 0.312, 0.188, 0.625), // LAN2
            Block.makeCuboidShape(0.312, 0.125, 0.562, 0.375, 0.188, 0.625), // LAN3
            Block.makeCuboidShape(0.375, 0.125, 0.562, 0.438, 0.188, 0.625), // LAN4
            Block.makeCuboidShape(0.5, 0.125, 0.562, 0.562, 0.188, 0.625) // DSL_HOLE
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();




    public WifiRouter() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.1f,10f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)

        );
        setRegistryName("wifi_router");

    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch(state.get(FACING))
        {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_N;
            case EAST:
                return SHAPE_N;
            case WEST:
                return SHAPE_N;
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
    } }
