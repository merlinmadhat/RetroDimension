package net.mcreator.retrodim.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class RetroBlueBlockBlock extends Block {
	public RetroBlueBlockBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).sound(SoundType.BONE_BLOCK).strength(1f, 10f).lightLevel(blockstate -> 7));
	}
}