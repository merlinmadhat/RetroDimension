package net.mcreator.retrodim.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.List;

public class FlashingCyan1sXBlock extends Block {
	public FlashingCyan1sXBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.glass.break")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:plink"))))
				.strength(1f, 10f).lightLevel(blockstate -> 15).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("block.retrodim.flashing_cyan_1s_x.description_0"));
		list.add(Component.translatable("block.retrodim.flashing_cyan_1s_x.description_1"));
	}
}