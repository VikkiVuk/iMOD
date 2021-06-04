package com.VikkiVuk.iMOD.objects.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class BlockResta extends Block{

	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

	private static final VoxelShape SHAPE_N = Stream.of(
			Block.makeCuboidShape(13, 5, 13, 14, 6, 14),
			Block.makeCuboidShape(0, 0, 0, 16, 4, 16),
			Block.makeCuboidShape(1, 4, 1, 15, 5, 15),
			Block.makeCuboidShape(2, 5, 2, 3, 6, 3),
			Block.makeCuboidShape(2, 5, 13, 3, 6, 14),
			Block.makeCuboidShape(13, 5, 2, 14, 6, 3),
			Block.makeCuboidShape(0, 6, 0, 16, 7, 16)
	).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	  public BlockResta() {
	        super(Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(2.1f));
	        setRegistryName("custom_resta");
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
	}



	
}
