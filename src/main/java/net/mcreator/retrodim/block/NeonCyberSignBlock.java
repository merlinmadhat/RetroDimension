package net.mcreator.retrodim.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import com.google.common.collect.ImmutableMap;

public class NeonCyberSignBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	private final ImmutableMap<BlockState, VoxelShape> shapes = this.makeShapes();

	public NeonCyberSignBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1f, 10f).lightLevel(blockstate -> 15).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	private ImmutableMap<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				case NORTH ->
					Shapes.or(box(3, 2, 13, 13, 28, 14), box(1, 8, 11, 2, 9, 16), box(1, 11, 11, 2, 12, 16), box(1, 17, 11, 2, 18, 16), box(14, 3, 11, 15, 4, 15), box(14, 8, 11, 15, 9, 16), box(13, 23, 12, 14, 24, 15), box(1, 3, 11, 2, 8, 12),
							box(14, 9, 11, 15, 15, 12), box(7, 12, 15, 8, 18, 16), box(1, 12, 11, 2, 17, 12), box(13, 23, 11, 14, 26, 12), box(8, 15, 11, 9, 25, 12), box(2, 3, 11, 14, 4, 12), box(8, 14, 11, 14, 15, 12), box(8, 25, 11, 13, 26, 12),
							box(2, 8, 15, 14, 9, 16), box(2, 11, 15, 8, 12, 16), box(2, 17, 15, 8, 18, 16), box(6, 6, 11, 7, 30, 12), box(6, 20, 15, 7, 29, 16), box(7, 20, 15, 14, 21, 16), box(13, 21, 15, 14, 22, 16), box(6, 29, 12, 7, 30, 16));
				case EAST -> Shapes.or(box(2, 2, 3, 3, 28, 13), box(0, 8, 1, 5, 9, 2), box(0, 11, 1, 5, 12, 2), box(0, 17, 1, 5, 18, 2), box(1, 3, 14, 5, 4, 15), box(0, 8, 14, 5, 9, 15), box(1, 23, 13, 4, 24, 14), box(4, 3, 1, 5, 8, 2),
						box(4, 9, 14, 5, 15, 15), box(0, 12, 7, 1, 18, 8), box(4, 12, 1, 5, 17, 2), box(4, 23, 13, 5, 26, 14), box(4, 15, 8, 5, 25, 9), box(4, 3, 2, 5, 4, 14), box(4, 14, 8, 5, 15, 14), box(4, 25, 8, 5, 26, 13),
						box(0, 8, 2, 1, 9, 14), box(0, 11, 2, 1, 12, 8), box(0, 17, 2, 1, 18, 8), box(4, 6, 6, 5, 30, 7), box(0, 20, 6, 1, 29, 7), box(0, 20, 7, 1, 21, 14), box(0, 21, 13, 1, 22, 14), box(0, 29, 6, 4, 30, 7));
				case WEST ->
					Shapes.or(box(13, 2, 3, 14, 28, 13), box(11, 8, 14, 16, 9, 15), box(11, 11, 14, 16, 12, 15), box(11, 17, 14, 16, 18, 15), box(11, 3, 1, 15, 4, 2), box(11, 8, 1, 16, 9, 2), box(12, 23, 2, 15, 24, 3), box(11, 3, 14, 12, 8, 15),
							box(11, 9, 1, 12, 15, 2), box(15, 12, 8, 16, 18, 9), box(11, 12, 14, 12, 17, 15), box(11, 23, 2, 12, 26, 3), box(11, 15, 7, 12, 25, 8), box(11, 3, 2, 12, 4, 14), box(11, 14, 2, 12, 15, 8), box(11, 25, 3, 12, 26, 8),
							box(15, 8, 2, 16, 9, 14), box(15, 11, 8, 16, 12, 14), box(15, 17, 8, 16, 18, 14), box(11, 6, 9, 12, 30, 10), box(15, 20, 9, 16, 29, 10), box(15, 20, 2, 16, 21, 9), box(15, 21, 2, 16, 22, 3), box(12, 29, 9, 16, 30, 10));
				case UP -> Shapes.or(box(3, 2, 2, 13, 3, 28), box(1, 0, 8, 2, 5, 9), box(1, 0, 11, 2, 5, 12), box(1, 0, 17, 2, 5, 18), box(14, 1, 3, 15, 5, 4), box(14, 0, 8, 15, 5, 9), box(13, 1, 23, 14, 4, 24), box(1, 4, 3, 2, 5, 8),
						box(14, 4, 9, 15, 5, 15), box(7, 0, 12, 8, 1, 18), box(1, 4, 12, 2, 5, 17), box(13, 4, 23, 14, 5, 26), box(8, 4, 15, 9, 5, 25), box(2, 4, 3, 14, 5, 4), box(8, 4, 14, 14, 5, 15), box(8, 4, 25, 13, 5, 26),
						box(2, 0, 8, 14, 1, 9), box(2, 0, 11, 8, 1, 12), box(2, 0, 17, 8, 1, 18), box(6, 4, 6, 7, 5, 30), box(6, 0, 20, 7, 1, 29), box(7, 0, 20, 14, 1, 21), box(13, 0, 21, 14, 1, 22), box(6, 0, 29, 7, 4, 30));
				case DOWN ->
					Shapes.or(box(3, 13, -12, 13, 14, 14), box(1, 11, 7, 2, 16, 8), box(1, 11, 4, 2, 16, 5), box(1, 11, -2, 2, 16, -1), box(14, 11, 12, 15, 15, 13), box(14, 11, 7, 15, 16, 8), box(13, 12, -8, 14, 15, -7), box(1, 11, 8, 2, 12, 13),
							box(14, 11, 1, 15, 12, 7), box(7, 15, -2, 8, 16, 4), box(1, 11, -1, 2, 12, 4), box(13, 11, -10, 14, 12, -7), box(8, 11, -9, 9, 12, 1), box(2, 11, 12, 14, 12, 13), box(8, 11, 1, 14, 12, 2), box(8, 11, -10, 13, 12, -9),
							box(2, 15, 7, 14, 16, 8), box(2, 15, 4, 8, 16, 5), box(2, 15, -2, 8, 16, -1), box(6, 11, -14, 7, 12, 10), box(6, 15, -13, 7, 16, -4), box(7, 15, -5, 14, 16, -4), box(13, 15, -6, 14, 16, -5), box(6, 12, -14, 7, 16, -13));
				default -> Shapes.or(box(3, 2, 2, 13, 28, 3), box(14, 8, 0, 15, 9, 5), box(14, 11, 0, 15, 12, 5), box(14, 17, 0, 15, 18, 5), box(1, 3, 1, 2, 4, 5), box(1, 8, 0, 2, 9, 5), box(2, 23, 1, 3, 24, 4), box(14, 3, 4, 15, 8, 5),
						box(1, 9, 4, 2, 15, 5), box(8, 12, 0, 9, 18, 1), box(14, 12, 4, 15, 17, 5), box(2, 23, 4, 3, 26, 5), box(7, 15, 4, 8, 25, 5), box(2, 3, 4, 14, 4, 5), box(2, 14, 4, 8, 15, 5), box(3, 25, 4, 8, 26, 5), box(2, 8, 0, 14, 9, 1),
						box(8, 11, 0, 14, 12, 1), box(8, 17, 0, 14, 18, 1), box(9, 6, 4, 10, 30, 5), box(9, 20, 0, 10, 29, 1), box(2, 20, 0, 9, 21, 1), box(2, 21, 0, 3, 22, 1), box(9, 29, 0, 10, 30, 4));
			};
		});
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return shapes.get(state);
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		if (state == null)
			return null;
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return state.setValue(FACING, context.getNearestLookingDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}
}