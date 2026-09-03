/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.retrodim.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.retrodim.block.entity.RetroPastelBlockBlockEntity;
import net.mcreator.retrodim.block.entity.Bitwisp1BlockEntity;
import net.mcreator.retrodim.RetrodimMod;

@EventBusSubscriber
public class RetrodimModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, RetrodimMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RetroPastelBlockBlockEntity>> RETRO_PASTEL_BLOCK = register("retro_pastel_block", RetrodimModBlocks.RETRO_PASTEL_BLOCK, RetroPastelBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Bitwisp1BlockEntity>> BITWISP_1 = register("bitwisp_1", RetrodimModBlocks.BITWISP_1, Bitwisp1BlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RETRO_PASTEL_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, RETRO_PASTEL_BLOCK.get(), (blockEntity, side) -> blockEntity.getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BITWISP_1.get(), SidedInvWrapper::new);
	}
}