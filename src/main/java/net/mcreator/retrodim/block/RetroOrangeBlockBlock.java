package net.mcreator.retrodim.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class RetroOrangeBlockBlock extends Block {
	public RetroOrangeBlockBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.BONE_BLOCK).strength(1f, 10f).lightLevel(blockstate -> 7));
	}
}