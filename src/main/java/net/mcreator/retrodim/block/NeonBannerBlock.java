package net.mcreator.retrodim.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import com.google.common.collect.ImmutableMap;

public class NeonBannerBlock extends Block {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	private final ImmutableMap<BlockState, VoxelShape> shapes = this.makeShapes();

	public NeonBannerBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1f, 10f).lightLevel(blockstate -> 15).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	private ImmutableMap<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				case NORTH -> Shapes.or(box(0, 3, 14, 1, 4, 16), box(15, 3, 14, 16, 4, 16), box(1, 3, 14, 15, 4, 15), box(15, 6, 14, 16, 7, 16), box(1, 6, 14, 15, 7, 15), box(0, 6, 14, 1, 7, 16), box(0, 10, 14, 1, 11, 16), box(1, 10, 14, 15, 11, 15),
						box(15, 10, 14, 16, 11, 16), box(15, 15, 14, 16, 16, 16), box(1, 15, 14, 15, 16, 15), box(0, 15, 14, 1, 16, 16));
				case EAST -> Shapes.or(box(0, 3, 0, 2, 4, 1), box(0, 3, 15, 2, 4, 16), box(1, 3, 1, 2, 4, 15), box(0, 6, 15, 2, 7, 16), box(1, 6, 1, 2, 7, 15), box(0, 6, 0, 2, 7, 1), box(0, 10, 0, 2, 11, 1), box(1, 10, 1, 2, 11, 15),
						box(0, 10, 15, 2, 11, 16), box(0, 15, 15, 2, 16, 16), box(1, 15, 1, 2, 16, 15), box(0, 15, 0, 2, 16, 1));
				case WEST -> Shapes.or(box(14, 3, 15, 16, 4, 16), box(14, 3, 0, 16, 4, 1), box(14, 3, 1, 15, 4, 15), box(14, 6, 0, 16, 7, 1), box(14, 6, 1, 15, 7, 15), box(14, 6, 15, 16, 7, 16), box(14, 10, 15, 16, 11, 16),
						box(14, 10, 1, 15, 11, 15), box(14, 10, 0, 16, 11, 1), box(14, 15, 0, 16, 16, 1), box(14, 15, 1, 15, 16, 15), box(14, 15, 15, 16, 16, 16));
				case UP -> Shapes.or(box(0, 0, 3, 1, 2, 4), box(15, 0, 3, 16, 2, 4), box(1, 1, 3, 15, 2, 4), box(15, 0, 6, 16, 2, 7), box(1, 1, 6, 15, 2, 7), box(0, 0, 6, 1, 2, 7), box(0, 0, 10, 1, 2, 11), box(1, 1, 10, 15, 2, 11),
						box(15, 0, 10, 16, 2, 11), box(15, 0, 15, 16, 2, 16), box(1, 1, 15, 15, 2, 16), box(0, 0, 15, 1, 2, 16));
				case DOWN -> Shapes.or(box(0, 14, 12, 1, 16, 13), box(15, 14, 12, 16, 16, 13), box(1, 14, 12, 15, 15, 13), box(15, 14, 9, 16, 16, 10), box(1, 14, 9, 15, 15, 10), box(0, 14, 9, 1, 16, 10), box(0, 14, 5, 1, 16, 6),
						box(1, 14, 5, 15, 15, 6), box(15, 14, 5, 16, 16, 6), box(15, 14, 0, 16, 16, 1), box(1, 14, 0, 15, 15, 1), box(0, 14, 0, 1, 16, 1));
				default -> Shapes.or(box(15, 3, 0, 16, 4, 2), box(0, 3, 0, 1, 4, 2), box(1, 3, 1, 15, 4, 2), box(0, 6, 0, 1, 7, 2), box(1, 6, 1, 15, 7, 2), box(15, 6, 0, 16, 7, 2), box(15, 10, 0, 16, 11, 2), box(1, 10, 1, 15, 11, 2),
						box(0, 10, 0, 1, 11, 2), box(0, 15, 0, 1, 16, 2), box(1, 15, 1, 15, 16, 2), box(15, 15, 0, 16, 16, 2));
			};
		});
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return shapes.get(state);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		if (state == null)
			return null;
		return state.setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}