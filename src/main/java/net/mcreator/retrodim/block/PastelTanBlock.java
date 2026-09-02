package net.mcreator.retrodim.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PastelTanBlock extends Block {
	public PastelTanBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(1f, 10f).lightLevel(blockstate -> 1).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}
}