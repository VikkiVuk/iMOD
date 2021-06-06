package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
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
import net.minecraft.world.World;

import java.util.stream.Stream;


public class Chairsy extends Block
{
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

	private static final VoxelShape SHAPE_S = Stream.of(
			Block.makeCuboidShape(14, 10, 0, 16, 12, 16),
			Block.makeCuboidShape(14, 0, 0, 16, 2, 16),
			Block.makeCuboidShape(0, 10, 0, 2, 12, 16),
			Block.makeCuboidShape(14, 2, 0, 16, 10, 2),
			Block.makeCuboidShape(14, 2, 14, 16, 10, 16),
			Block.makeCuboidShape(0, 2, 14, 2, 10, 16),
			Block.makeCuboidShape(0, 2, 0, 2, 10, 2),
			Block.makeCuboidShape(2, 0, 0, 14, 7, 16),
			Block.makeCuboidShape(2, 7, 11, 14, 16, 16),
			Block.makeCuboidShape(0, 0, 0, 2, 2, 16)
	).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_N = Stream.of(
			Block.makeCuboidShape(0, 10, 0, 2, 12, 16),
			Block.makeCuboidShape(0, 0, 0, 2, 2, 16),
			Block.makeCuboidShape(14, 10, 0, 16, 12, 16),
			Block.makeCuboidShape(0, 2, 14, 2, 10, 16),
			Block.makeCuboidShape(0, 2, 0, 2, 10, 2),
			Block.makeCuboidShape(14, 2, 0, 16, 10, 2),
			Block.makeCuboidShape(14, 2, 14, 16, 10, 16),
			Block.makeCuboidShape(2, 0, 0, 14, 7, 16),
			Block.makeCuboidShape(2, 7, 0, 14, 16, 5),
			Block.makeCuboidShape(14, 0, 0, 16, 2, 16)
	).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_E = Stream.of(
			Block.makeCuboidShape(0, 10, 0, 16, 12, 2),
			Block.makeCuboidShape(0, 0, 0, 16, 2, 2),
			Block.makeCuboidShape(0, 10, 14, 16, 12, 16),
			Block.makeCuboidShape(0, 2, 0, 2, 10, 2),
			Block.makeCuboidShape(14, 2, 0, 16, 10, 2),
			Block.makeCuboidShape(14, 2, 14, 16, 10, 16),
			Block.makeCuboidShape(0, 2, 14, 2, 10, 16),
			Block.makeCuboidShape(0, 0, 2, 16, 7, 14),
			Block.makeCuboidShape(11, 7, 2, 16, 16, 14),
			Block.makeCuboidShape(0, 0, 14, 16, 2, 16)
	).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_W = Stream.of(
			Block.makeCuboidShape(0, 10, 14, 16, 12, 16),
			Block.makeCuboidShape(0, 0, 14, 16, 2, 16),
			Block.makeCuboidShape(0, 10, 0, 16, 12, 2),
			Block.makeCuboidShape(14, 2, 14, 16, 10, 16),
			Block.makeCuboidShape(0, 2, 14, 2, 10, 16),
			Block.makeCuboidShape(0, 2, 0, 2, 10, 2),
			Block.makeCuboidShape(14, 2, 0, 16, 10, 2),
			Block.makeCuboidShape(0, 0, 2, 16, 7, 14),
			Block.makeCuboidShape(0, 7, 2, 5, 16, 14),
			Block.makeCuboidShape(0, 0, 0, 16, 2, 2)
	).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();



	  public Chairsy() {
	        super(Properties.create(Material.WOOL).sound(SoundType.CLOTH).hardnessAndResistance(2.0f));
		  // setRegistryName("chairsy");
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
