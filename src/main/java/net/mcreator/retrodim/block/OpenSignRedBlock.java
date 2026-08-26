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
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import com.google.common.collect.ImmutableMap;

public class OpenSignRedBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	private final ImmutableMap<BlockState, VoxelShape> shapes = this.makeShapes();

	public OpenSignRedBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1f, 10f).lightLevel(blockstate -> 15).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	private ImmutableMap<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				case NORTH -> Shapes.or(box(0, 7, 15, 16, 8, 16), box(2, 8.9, 15, 14, 9.4, 16), box(0, 8, 15, 1, 15, 16), box(15, 8, 15, 16, 15, 16), box(0, 15, 15, 16, 16, 16), box(11.6, 10, 15, 12.2, 14, 16), box(13, 10, 15, 13.6, 14, 16),
						box(5.6, 13.4, 15, 7, 14, 16), box(10, 12, 15, 10.6, 14, 16), box(8.5, 12, 15, 9.1, 14, 16), box(9, 13.4, 15, 10, 14, 16), box(10.6, 10, 15.8, 11.6, 10.1, 16), box(7.6, 13.9, 15.8, 8.5, 14, 16),
						box(4.6, 10, 15.8, 5.6, 10.1, 16), box(9, 12, 15, 10, 12.6, 16), box(10, 10, 15, 10.6, 12, 16), box(4, 10, 15, 4.6, 14, 16), box(3, 10, 15, 3.6, 14, 16), box(2.4, 10, 15, 3, 14, 16), box(5.6, 11.8, 15, 7, 12.4, 16),
						box(12.2, 10, 15, 13, 10.6, 16), box(13.7, 9.3, 15.8, 13.8, 10.1, 16), box(12.2, 13.4, 15, 13, 14, 16), box(5.6, 10, 15, 7, 10.6, 16), box(7, 10, 15, 7.6, 14, 16));
				case EAST -> Shapes.or(box(0, 7, 0, 1, 8, 16), box(0, 8.9, 2, 1, 9.4, 14), box(0, 8, 0, 1, 15, 1), box(0, 8, 15, 1, 15, 16), box(0, 15, 0, 1, 16, 16), box(0, 10, 11.6, 1, 14, 12.2), box(0, 10, 13, 1, 14, 13.6),
						box(0, 13.4, 5.6, 1, 14, 7), box(0, 12, 10, 1, 14, 10.6), box(0, 12, 8.5, 1, 14, 9.1), box(0, 13.4, 9, 1, 14, 10), box(0, 10, 10.6, 0.2, 10.1, 11.6), box(0, 13.9, 7.6, 0.2, 14, 8.5), box(0, 10, 4.6, 0.2, 10.1, 5.6),
						box(0, 12, 9, 1, 12.6, 10), box(0, 10, 10, 1, 12, 10.6), box(0, 10, 4, 1, 14, 4.6), box(0, 10, 3, 1, 14, 3.6), box(0, 10, 2.4, 1, 14, 3), box(0, 11.8, 5.6, 1, 12.4, 7), box(0, 10, 12.2, 1, 10.6, 13),
						box(0, 9.3, 13.7, 0.2, 10.1, 13.8), box(0, 13.4, 12.2, 1, 14, 13), box(0, 10, 5.6, 1, 10.6, 7), box(0, 10, 7, 1, 14, 7.6));
				case WEST -> Shapes.or(box(15, 7, 0, 16, 8, 16), box(15, 8.9, 2, 16, 9.4, 14), box(15, 8, 15, 16, 15, 16), box(15, 8, 0, 16, 15, 1), box(15, 15, 0, 16, 16, 16), box(15, 10, 3.8, 16, 14, 4.4), box(15, 10, 2.4, 16, 14, 3),
						box(15, 13.4, 9, 16, 14, 10.4), box(15, 12, 5.4, 16, 14, 6), box(15, 12, 6.9, 16, 14, 7.5), box(15, 13.4, 6, 16, 14, 7), box(15.8, 10, 4.4, 16, 10.1, 5.4), box(15.8, 13.9, 7.5, 16, 14, 8.4),
						box(15.8, 10, 10.4, 16, 10.1, 11.4), box(15, 12, 6, 16, 12.6, 7), box(15, 10, 5.4, 16, 12, 6), box(15, 10, 11.4, 16, 14, 12), box(15, 10, 12.4, 16, 14, 13), box(15, 10, 13, 16, 14, 13.6), box(15, 11.8, 9, 16, 12.4, 10.4),
						box(15, 10, 3, 16, 10.6, 3.8), box(15.8, 9.3, 2.2, 16, 10.1, 2.3), box(15, 13.4, 3, 16, 14, 3.8), box(15, 10, 9, 16, 10.6, 10.4), box(15, 10, 8.4, 16, 14, 9));
				default -> Shapes.or(box(0, 7, 0, 16, 8, 1), box(2, 8.9, 0, 14, 9.4, 1), box(15, 8, 0, 16, 15, 1), box(0, 8, 0, 1, 15, 1), box(0, 15, 0, 16, 16, 1), box(3.8, 10, 0, 4.4, 14, 1), box(2.4, 10, 0, 3, 14, 1), box(9, 13.4, 0, 10.4, 14, 1),
						box(5.4, 12, 0, 6, 14, 1), box(6.9, 12, 0, 7.5, 14, 1), box(6, 13.4, 0, 7, 14, 1), box(4.4, 10, 0, 5.4, 10.1, 0.2), box(7.5, 13.9, 0, 8.4, 14, 0.2), box(10.4, 10, 0, 11.4, 10.1, 0.2), box(6, 12, 0, 7, 12.6, 1),
						box(5.4, 10, 0, 6, 12, 1), box(11.4, 10, 0, 12, 14, 1), box(12.4, 10, 0, 13, 14, 1), box(13, 10, 0, 13.6, 14, 1), box(9, 11.8, 0, 10.4, 12.4, 1), box(3, 10, 0, 3.8, 10.6, 1), box(2.2, 9.3, 0, 2.3, 10.1, 0.2),
						box(3, 13.4, 0, 3.8, 14, 1), box(9, 10, 0, 10.4, 10.6, 1), box(8.4, 10, 0, 9, 14, 1));
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
		return state.setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}