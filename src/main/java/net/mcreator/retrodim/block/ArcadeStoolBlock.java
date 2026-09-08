package net.mcreator.retrodim.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class ArcadeStoolBlock extends Block {
	private static final VoxelShape SHAPE = Shapes.or(box(4, 0, 3, 5, 2, 4), box(11, 0, 3, 12, 2, 4), box(4, 3.2, 10, 12, 4.2, 11), box(4, 3.2, 5, 12, 4.2, 6), box(4, 3.2, 6, 5, 4.2, 10), box(5, 5.2, 6, 6, 6.2, 10), box(6, 6.2, 7, 7, 7.2, 9),
			box(5, 4.2, 5, 6, 6.2, 6), box(5, 4.2, 10, 6, 6.2, 11), box(10, 4.2, 10, 11, 6.2, 11), box(10, 4.2, 5, 11, 6.2, 6), box(10, 5.2, 6, 11, 6.2, 10), box(9, 6.2, 7, 10, 7.2, 9), box(6, 5.2, 5, 10, 6.2, 6), box(6, 6.2, 6, 10, 7.2, 7),
			box(6, 6.2, 9, 10, 7.2, 10), box(7, 1.2, 7, 9, 8.2, 9), box(6, 5.2, 10, 10, 6.2, 11), box(11, 3.2, 6, 12, 4.2, 10), box(4, 0, 12, 5, 2, 13), box(11, 0, 12, 12, 2, 13), box(3, 8, 3, 13, 11, 13));

	public ArcadeStoolBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return SHAPE;
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
}