package net.mcreator.retrodim.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class FlickeringLightBlue5sABlock extends Block {
	public FlickeringLightBlue5sABlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.glass.break")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink"))))
				.strength(1f, 10f).lightLevel(blockstate -> 15).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}
}