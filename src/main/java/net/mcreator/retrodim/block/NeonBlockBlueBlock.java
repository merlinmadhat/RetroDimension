package net.mcreator.retrodim.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.util.StringRepresentable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class NeonBlockBlueBlock extends Block {
	public static final EnumProperty<ResonanceProperty> RESONANCE = EnumProperty.create("resonance", ResonanceProperty.class);

	public NeonBlockBlueBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.glass.break")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink"))))
				.strength(1f, 10f).lightLevel(blockstate -> 15).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
		this.registerDefaultState(this.stateDefinition.any().setValue(RESONANCE, ResonanceProperty.SOLID));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(RESONANCE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		if (state == null)
			return null;
		return state.setValue(RESONANCE, ResonanceProperty.SOLID);
	}

	public enum ResonanceProperty implements StringRepresentable {
		SOLID("solid"), FLASHING1SX("flashing1sx"), FLASHING1SY("flashing1sy"), FLASHING1SZ("flashing1sz"), FLASHING2SA("flashing2sa"), FLASHING2SB("flashing2sb"), FLICKERING3SA("flickering3sa"), FLICKERING3SB("flickering3sb"), FLICKERING3SC(
				"flickering3sc"), FLICKERING5SA("flickering5sa"), PULSING2SA("pulsing2sa");

		private final String name;

		private ResonanceProperty(String name) {
			this.name = name;
		}

		@Override
		public String getSerializedName() {
			return this.name;
		}

		@Override
		public String toString() {
			return this.name;
		}
	}
}