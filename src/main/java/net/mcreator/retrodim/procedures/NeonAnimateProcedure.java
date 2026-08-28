package net.mcreator.retrodim.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.retrodim.init.RetrodimModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class NeonAnimateProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("retrodim:neon_capacitor")))) {
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Blue")) {
				if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Light")) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_LIGHT_BLUE.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack11 = new ItemStack(RetrodimModBlocks.PULSING_LIGHT_BLUE_2S_A.get()).copy();
								_setstack11.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack11);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack14 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_BLUE_1S_X.get()).copy();
								_setstack14.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack14);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_BLUE_1S_X.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack20 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_LIGHT_BLUE.get()).copy();
								_setstack20.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack20);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack23 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_BLUE_1S_Y.get()).copy();
								_setstack23.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack23);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_BLUE_1S_Y.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack29 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_BLUE_1S_X.get()).copy();
								_setstack29.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack29);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack32 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_BLUE_1S_Z.get()).copy();
								_setstack32.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack32);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_BLUE_1S_Z.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack38 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_BLUE_1S_Y.get()).copy();
								_setstack38.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack38);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack41 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_BLUE_2S_A.get()).copy();
								_setstack41.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack41);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_BLUE_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack47 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_BLUE_1S_Z.get()).copy();
								_setstack47.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack47);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack50 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_BLUE_2S_B.get()).copy();
								_setstack50.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack50);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_BLUE_2S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack56 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_BLUE_2S_A.get()).copy();
								_setstack56.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack56);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack59 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_BLUE_3S_A.get()).copy();
								_setstack59.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack59);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_BLUE_3S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack65 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_BLUE_2S_B.get()).copy();
								_setstack65.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack65);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack68 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_BLUE_3S_B.get()).copy();
								_setstack68.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack68);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_BLUE_3S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack74 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_BLUE_3S_A.get()).copy();
								_setstack74.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack74);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack77 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_BLUE_3S_C.get()).copy();
								_setstack77.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack77);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_BLUE_3S_C.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack83 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_BLUE_3S_B.get()).copy();
								_setstack83.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack83);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack86 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_BLUE_5S_A.get()).copy();
								_setstack86.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack86);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_BLUE_5S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack92 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_BLUE_3S_C.get()).copy();
								_setstack92.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack92);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack95 = new ItemStack(RetrodimModBlocks.PULSING_LIGHT_BLUE_2S_A.get()).copy();
								_setstack95.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack95);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_LIGHT_BLUE_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack101 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_BLUE_5S_A.get()).copy();
								_setstack101.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack101);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack104 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_LIGHT_BLUE.get()).copy();
								_setstack104.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack104);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
				} else {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_BLUE.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack110 = new ItemStack(RetrodimModBlocks.PULSING_BLUE_2S_A.get()).copy();
								_setstack110.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack110);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack113 = new ItemStack(RetrodimModBlocks.FLASHING_BLUE_1S_X.get()).copy();
								_setstack113.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack113);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BLUE_1S_X.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack119 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_BLUE.get()).copy();
								_setstack119.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack119);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack122 = new ItemStack(RetrodimModBlocks.FLASHING_BLUE_1S_Y.get()).copy();
								_setstack122.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack122);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BLUE_1S_Y.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack128 = new ItemStack(RetrodimModBlocks.FLASHING_BLUE_1S_X.get()).copy();
								_setstack128.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack128);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack131 = new ItemStack(RetrodimModBlocks.FLASHING_BLUE_1S_Z.get()).copy();
								_setstack131.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack131);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BLUE_1S_Z.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack137 = new ItemStack(RetrodimModBlocks.FLASHING_BLUE_1S_Y.get()).copy();
								_setstack137.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack137);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack140 = new ItemStack(RetrodimModBlocks.FLASHING_BLUE_2S_A.get()).copy();
								_setstack140.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack140);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BLUE_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack146 = new ItemStack(RetrodimModBlocks.FLASHING_BLUE_1S_Z.get()).copy();
								_setstack146.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack146);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack149 = new ItemStack(RetrodimModBlocks.FLASHING_BLUE_2S_B.get()).copy();
								_setstack149.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack149);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BLUE_2S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack155 = new ItemStack(RetrodimModBlocks.FLASHING_BLUE_2S_A.get()).copy();
								_setstack155.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack155);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack158 = new ItemStack(RetrodimModBlocks.FLICKERING_BLUE_3S_A.get()).copy();
								_setstack158.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack158);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BLUE_3S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack164 = new ItemStack(RetrodimModBlocks.FLASHING_BLUE_2S_B.get()).copy();
								_setstack164.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack164);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack167 = new ItemStack(RetrodimModBlocks.FLICKERING_BLUE_3S_B.get()).copy();
								_setstack167.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack167);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BLUE_3S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack173 = new ItemStack(RetrodimModBlocks.FLICKERING_BLUE_3S_A.get()).copy();
								_setstack173.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack173);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack176 = new ItemStack(RetrodimModBlocks.FLICKERING_BLUE_3S_C.get()).copy();
								_setstack176.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack176);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BLUE_3S_C.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack182 = new ItemStack(RetrodimModBlocks.FLICKERING_BLUE_3S_B.get()).copy();
								_setstack182.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack182);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack185 = new ItemStack(RetrodimModBlocks.FLICKERING_BLUE_5S_A.get()).copy();
								_setstack185.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack185);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BLUE_5S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack191 = new ItemStack(RetrodimModBlocks.FLICKERING_BLUE_3S_C.get()).copy();
								_setstack191.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack191);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack194 = new ItemStack(RetrodimModBlocks.PULSING_BLUE_2S_A.get()).copy();
								_setstack194.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack194);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_BLUE_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack200 = new ItemStack(RetrodimModBlocks.FLICKERING_BLUE_5S_A.get()).copy();
								_setstack200.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack200);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack203 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_BLUE.get()).copy();
								_setstack203.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack203);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Brown")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_BROWN.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack211 = new ItemStack(RetrodimModBlocks.PULSING_BROWN_2S_A.get()).copy();
							_setstack211.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack211);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack214 = new ItemStack(RetrodimModBlocks.FLASHING_BROWN_1S_X.get()).copy();
							_setstack214.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack214);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BROWN_1S_X.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack220 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_BROWN.get()).copy();
							_setstack220.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack220);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack223 = new ItemStack(RetrodimModBlocks.FLASHING_BROWN_1S_Y.get()).copy();
							_setstack223.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack223);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BROWN_1S_Y.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack229 = new ItemStack(RetrodimModBlocks.FLASHING_BROWN_1S_X.get()).copy();
							_setstack229.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack229);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack232 = new ItemStack(RetrodimModBlocks.FLASHING_BROWN_1S_Z.get()).copy();
							_setstack232.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack232);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BROWN_1S_Z.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack238 = new ItemStack(RetrodimModBlocks.FLASHING_BROWN_1S_Y.get()).copy();
							_setstack238.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack238);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack241 = new ItemStack(RetrodimModBlocks.FLASHING_BROWN_2S_A.get()).copy();
							_setstack241.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack241);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BROWN_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack247 = new ItemStack(RetrodimModBlocks.FLASHING_BROWN_1S_Z.get()).copy();
							_setstack247.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack247);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack250 = new ItemStack(RetrodimModBlocks.FLASHING_BROWN_2S_B.get()).copy();
							_setstack250.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack250);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BROWN_2S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack256 = new ItemStack(RetrodimModBlocks.FLASHING_BROWN_2S_A.get()).copy();
							_setstack256.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack256);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack259 = new ItemStack(RetrodimModBlocks.FLICKERING_BROWN_3S_A.get()).copy();
							_setstack259.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack259);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BROWN_3S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack265 = new ItemStack(RetrodimModBlocks.FLASHING_BROWN_2S_B.get()).copy();
							_setstack265.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack265);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack268 = new ItemStack(RetrodimModBlocks.FLICKERING_BROWN_3S_B.get()).copy();
							_setstack268.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack268);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BROWN_3S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack274 = new ItemStack(RetrodimModBlocks.FLICKERING_BROWN_3S_A.get()).copy();
							_setstack274.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack274);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack277 = new ItemStack(RetrodimModBlocks.FLICKERING_BROWN_3S_C.get()).copy();
							_setstack277.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack277);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BROWN_3S_C.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack283 = new ItemStack(RetrodimModBlocks.FLICKERING_BROWN_3S_B.get()).copy();
							_setstack283.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack283);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack286 = new ItemStack(RetrodimModBlocks.FLICKERING_BROWN_5S_A.get()).copy();
							_setstack286.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack286);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BROWN_5S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack292 = new ItemStack(RetrodimModBlocks.FLICKERING_BROWN_3S_C.get()).copy();
							_setstack292.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack292);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack295 = new ItemStack(RetrodimModBlocks.PULSING_BROWN_2S_A.get()).copy();
							_setstack295.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack295);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_BROWN_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack301 = new ItemStack(RetrodimModBlocks.FLICKERING_BROWN_5S_A.get()).copy();
							_setstack301.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack301);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack304 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_BROWN.get()).copy();
							_setstack304.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack304);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Bubblegum")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_BUBBLEGUM.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack312 = new ItemStack(RetrodimModBlocks.PULSING_BUBBLEGUM_2S_A.get()).copy();
							_setstack312.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack312);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack315 = new ItemStack(RetrodimModBlocks.FLASHING_BUBBLEGUM_1S_X.get()).copy();
							_setstack315.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack315);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BUBBLEGUM_1S_X.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack321 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_BUBBLEGUM.get()).copy();
							_setstack321.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack321);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack324 = new ItemStack(RetrodimModBlocks.FLASHING_BUBBLEGUM_1S_Y.get()).copy();
							_setstack324.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack324);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BUBBLEGUM_1S_Y.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack330 = new ItemStack(RetrodimModBlocks.FLASHING_BUBBLEGUM_1S_X.get()).copy();
							_setstack330.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack330);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack333 = new ItemStack(RetrodimModBlocks.FLASHING_BUBBLEGUM_1S_Z.get()).copy();
							_setstack333.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack333);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BUBBLEGUM_1S_Z.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack339 = new ItemStack(RetrodimModBlocks.FLASHING_BUBBLEGUM_1S_Y.get()).copy();
							_setstack339.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack339);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack342 = new ItemStack(RetrodimModBlocks.FLASHING_BUBBLEGUM_2S_A.get()).copy();
							_setstack342.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack342);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BUBBLEGUM_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack348 = new ItemStack(RetrodimModBlocks.FLASHING_BUBBLEGUM_1S_Z.get()).copy();
							_setstack348.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack348);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack351 = new ItemStack(RetrodimModBlocks.FLASHING_BUBBLEGUM_2S_B.get()).copy();
							_setstack351.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack351);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_BUBBLEGUM_2S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack357 = new ItemStack(RetrodimModBlocks.FLASHING_BUBBLEGUM_2S_A.get()).copy();
							_setstack357.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack357);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack360 = new ItemStack(RetrodimModBlocks.FLICKERING_BUBBLEGUM_3S_A.get()).copy();
							_setstack360.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack360);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BUBBLEGUM_3S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack366 = new ItemStack(RetrodimModBlocks.FLASHING_BUBBLEGUM_2S_B.get()).copy();
							_setstack366.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack366);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack369 = new ItemStack(RetrodimModBlocks.FLICKERING_BUBBLEGUM_3S_B.get()).copy();
							_setstack369.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack369);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BUBBLEGUM_3S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack375 = new ItemStack(RetrodimModBlocks.FLICKERING_BUBBLEGUM_3S_A.get()).copy();
							_setstack375.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack375);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack378 = new ItemStack(RetrodimModBlocks.FLICKERING_BUBBLEGUM_3S_C.get()).copy();
							_setstack378.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack378);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BUBBLEGUM_3S_C.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack384 = new ItemStack(RetrodimModBlocks.FLICKERING_BUBBLEGUM_3S_B.get()).copy();
							_setstack384.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack384);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack387 = new ItemStack(RetrodimModBlocks.FLICKERING_BUBBLEGUM_5S_A.get()).copy();
							_setstack387.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack387);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_BUBBLEGUM_5S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack393 = new ItemStack(RetrodimModBlocks.FLICKERING_BUBBLEGUM_3S_C.get()).copy();
							_setstack393.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack393);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack396 = new ItemStack(RetrodimModBlocks.PULSING_BUBBLEGUM_2S_A.get()).copy();
							_setstack396.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack396);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_BUBBLEGUM_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack402 = new ItemStack(RetrodimModBlocks.FLICKERING_BUBBLEGUM_5S_A.get()).copy();
							_setstack402.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack402);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack405 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_BUBBLEGUM.get()).copy();
							_setstack405.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack405);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Cyan")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_CYAN.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack413 = new ItemStack(RetrodimModBlocks.PULSING_CYAN_2S_A.get()).copy();
							_setstack413.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack413);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack416 = new ItemStack(RetrodimModBlocks.FLASHING_CYAN_1S_X.get()).copy();
							_setstack416.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack416);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_CYAN_1S_X.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack422 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_CYAN.get()).copy();
							_setstack422.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack422);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack425 = new ItemStack(RetrodimModBlocks.FLASHING_CYAN_1S_Y.get()).copy();
							_setstack425.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack425);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_CYAN_1S_Y.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack431 = new ItemStack(RetrodimModBlocks.FLASHING_CYAN_1S_X.get()).copy();
							_setstack431.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack431);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack434 = new ItemStack(RetrodimModBlocks.FLASHING_CYAN_1S_Z.get()).copy();
							_setstack434.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack434);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_CYAN_1S_Z.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack440 = new ItemStack(RetrodimModBlocks.FLASHING_CYAN_1S_Y.get()).copy();
							_setstack440.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack440);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack443 = new ItemStack(RetrodimModBlocks.FLASHING_CYAN_2S_A.get()).copy();
							_setstack443.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack443);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_CYAN_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack449 = new ItemStack(RetrodimModBlocks.FLASHING_CYAN_1S_Z.get()).copy();
							_setstack449.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack449);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack452 = new ItemStack(RetrodimModBlocks.FLASHING_CYAN_2S_B.get()).copy();
							_setstack452.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack452);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_CYAN_2S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack458 = new ItemStack(RetrodimModBlocks.FLASHING_CYAN_2S_A.get()).copy();
							_setstack458.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack458);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack461 = new ItemStack(RetrodimModBlocks.FLICKERING_CYAN_3S_A.get()).copy();
							_setstack461.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack461);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_CYAN_3S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack467 = new ItemStack(RetrodimModBlocks.FLASHING_CYAN_2S_B.get()).copy();
							_setstack467.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack467);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack470 = new ItemStack(RetrodimModBlocks.FLICKERING_CYAN_3S_B.get()).copy();
							_setstack470.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack470);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_CYAN_3S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack476 = new ItemStack(RetrodimModBlocks.FLICKERING_CYAN_3S_A.get()).copy();
							_setstack476.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack476);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack479 = new ItemStack(RetrodimModBlocks.FLICKERING_CYAN_3S_C.get()).copy();
							_setstack479.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack479);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_CYAN_3S_C.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack485 = new ItemStack(RetrodimModBlocks.FLICKERING_CYAN_3S_B.get()).copy();
							_setstack485.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack485);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack488 = new ItemStack(RetrodimModBlocks.FLICKERING_CYAN_5S_A.get()).copy();
							_setstack488.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack488);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_CYAN_5S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack494 = new ItemStack(RetrodimModBlocks.FLICKERING_CYAN_3S_C.get()).copy();
							_setstack494.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack494);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack497 = new ItemStack(RetrodimModBlocks.PULSING_CYAN_2S_A.get()).copy();
							_setstack497.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack497);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_CYAN_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack503 = new ItemStack(RetrodimModBlocks.FLICKERING_CYAN_5S_A.get()).copy();
							_setstack503.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack503);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack506 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_CYAN.get()).copy();
							_setstack506.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack506);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Gray")) {
				if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Light")) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_LIGHT_GRAY.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack516 = new ItemStack(RetrodimModBlocks.PULSING_LIGHT_GRAY_2S_A.get()).copy();
								_setstack516.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack516);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack519 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_GRAY_1S_X.get()).copy();
								_setstack519.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack519);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_GRAY_1S_X.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack525 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_LIGHT_GRAY.get()).copy();
								_setstack525.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack525);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack528 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_GRAY_1S_Y.get()).copy();
								_setstack528.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack528);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_GRAY_1S_Y.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack534 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_GRAY_1S_X.get()).copy();
								_setstack534.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack534);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack537 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_GRAY_1S_Z.get()).copy();
								_setstack537.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack537);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_GRAY_1S_Z.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack543 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_GRAY_1S_Y.get()).copy();
								_setstack543.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack543);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack546 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_GRAY_2S_A.get()).copy();
								_setstack546.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack546);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_GRAY_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack552 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_GRAY_1S_Z.get()).copy();
								_setstack552.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack552);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack555 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_GRAY_2S_B.get()).copy();
								_setstack555.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack555);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_GRAY_2S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack561 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_GRAY_2S_A.get()).copy();
								_setstack561.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack561);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack564 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_GRAY_3S_A.get()).copy();
								_setstack564.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack564);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_GRAY_3S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack570 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_GRAY_2S_B.get()).copy();
								_setstack570.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack570);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack573 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_GRAY_3S_B.get()).copy();
								_setstack573.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack573);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_GRAY_3S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack579 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_GRAY_3S_A.get()).copy();
								_setstack579.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack579);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack582 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_GRAY_3S_C.get()).copy();
								_setstack582.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack582);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_GRAY_3S_C.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack588 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_GRAY_3S_B.get()).copy();
								_setstack588.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack588);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack591 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_GRAY_5S_A.get()).copy();
								_setstack591.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack591);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_GRAY_5S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack597 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_GRAY_3S_C.get()).copy();
								_setstack597.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack597);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack600 = new ItemStack(RetrodimModBlocks.PULSING_LIGHT_GRAY_2S_A.get()).copy();
								_setstack600.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack600);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_LIGHT_GRAY_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack606 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_GRAY_5S_A.get()).copy();
								_setstack606.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack606);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack609 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_LIGHT_GRAY.get()).copy();
								_setstack609.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack609);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
				} else {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_GRAY.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack615 = new ItemStack(RetrodimModBlocks.PULSING_GRAY_2S_A.get()).copy();
								_setstack615.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack615);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack618 = new ItemStack(RetrodimModBlocks.FLASHING_GRAY_1S_X.get()).copy();
								_setstack618.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack618);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_GRAY_1S_X.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack624 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_GRAY.get()).copy();
								_setstack624.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack624);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack627 = new ItemStack(RetrodimModBlocks.FLASHING_GRAY_1S_Y.get()).copy();
								_setstack627.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack627);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_GRAY_1S_Y.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack633 = new ItemStack(RetrodimModBlocks.FLASHING_GRAY_1S_X.get()).copy();
								_setstack633.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack633);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack636 = new ItemStack(RetrodimModBlocks.FLASHING_GRAY_1S_Z.get()).copy();
								_setstack636.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack636);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_GRAY_1S_Z.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack642 = new ItemStack(RetrodimModBlocks.FLASHING_GRAY_1S_Y.get()).copy();
								_setstack642.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack642);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack645 = new ItemStack(RetrodimModBlocks.FLASHING_GRAY_2S_A.get()).copy();
								_setstack645.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack645);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_GRAY_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack651 = new ItemStack(RetrodimModBlocks.FLASHING_GRAY_1S_Z.get()).copy();
								_setstack651.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack651);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack654 = new ItemStack(RetrodimModBlocks.FLASHING_GRAY_2S_B.get()).copy();
								_setstack654.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack654);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_GRAY_2S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack660 = new ItemStack(RetrodimModBlocks.FLASHING_GRAY_2S_A.get()).copy();
								_setstack660.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack660);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack663 = new ItemStack(RetrodimModBlocks.FLICKERING_GRAY_3S_A.get()).copy();
								_setstack663.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack663);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_GRAY_3S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack669 = new ItemStack(RetrodimModBlocks.FLASHING_GRAY_2S_B.get()).copy();
								_setstack669.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack669);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack672 = new ItemStack(RetrodimModBlocks.FLICKERING_GRAY_3S_B.get()).copy();
								_setstack672.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack672);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_GRAY_3S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack678 = new ItemStack(RetrodimModBlocks.FLICKERING_GRAY_3S_A.get()).copy();
								_setstack678.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack678);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack681 = new ItemStack(RetrodimModBlocks.FLICKERING_GRAY_3S_C.get()).copy();
								_setstack681.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack681);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_GRAY_3S_C.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack687 = new ItemStack(RetrodimModBlocks.FLICKERING_GRAY_3S_B.get()).copy();
								_setstack687.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack687);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack690 = new ItemStack(RetrodimModBlocks.FLICKERING_GRAY_5S_A.get()).copy();
								_setstack690.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack690);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_GRAY_5S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack696 = new ItemStack(RetrodimModBlocks.FLICKERING_GRAY_3S_C.get()).copy();
								_setstack696.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack696);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack699 = new ItemStack(RetrodimModBlocks.PULSING_GRAY_2S_A.get()).copy();
								_setstack699.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack699);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_GRAY_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack705 = new ItemStack(RetrodimModBlocks.FLICKERING_GRAY_5S_A.get()).copy();
								_setstack705.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack705);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack708 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_GRAY.get()).copy();
								_setstack708.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack708);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Green")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_GREEN.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack716 = new ItemStack(RetrodimModBlocks.PULSING_GREEN_2S_A.get()).copy();
							_setstack716.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack716);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack719 = new ItemStack(RetrodimModBlocks.FLASHING_GREEN_1S_X.get()).copy();
							_setstack719.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack719);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_GREEN_1S_X.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack725 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_GREEN.get()).copy();
							_setstack725.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack725);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack728 = new ItemStack(RetrodimModBlocks.FLASHING_GREEN_1S_Y.get()).copy();
							_setstack728.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack728);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_GREEN_1S_Y.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack734 = new ItemStack(RetrodimModBlocks.FLASHING_GREEN_1S_X.get()).copy();
							_setstack734.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack734);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack737 = new ItemStack(RetrodimModBlocks.FLASHING_GREEN_1S_Z.get()).copy();
							_setstack737.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack737);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_GREEN_1S_Z.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack743 = new ItemStack(RetrodimModBlocks.FLASHING_GREEN_1S_Y.get()).copy();
							_setstack743.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack743);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack746 = new ItemStack(RetrodimModBlocks.FLASHING_GREEN_2S_A.get()).copy();
							_setstack746.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack746);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_GREEN_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack752 = new ItemStack(RetrodimModBlocks.FLASHING_GREEN_1S_Z.get()).copy();
							_setstack752.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack752);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack755 = new ItemStack(RetrodimModBlocks.FLASHING_GREEN_2S_B.get()).copy();
							_setstack755.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack755);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_GREEN_2S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack761 = new ItemStack(RetrodimModBlocks.FLASHING_GREEN_2S_A.get()).copy();
							_setstack761.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack761);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack764 = new ItemStack(RetrodimModBlocks.FLICKERING_GREEN_3S_A.get()).copy();
							_setstack764.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack764);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_GREEN_3S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack770 = new ItemStack(RetrodimModBlocks.FLASHING_GREEN_2S_B.get()).copy();
							_setstack770.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack770);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack773 = new ItemStack(RetrodimModBlocks.FLICKERING_GREEN_3S_B.get()).copy();
							_setstack773.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack773);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_GREEN_3S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack779 = new ItemStack(RetrodimModBlocks.FLICKERING_GREEN_3S_A.get()).copy();
							_setstack779.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack779);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack782 = new ItemStack(RetrodimModBlocks.FLICKERING_GREEN_3S_C.get()).copy();
							_setstack782.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack782);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_GREEN_3S_C.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack788 = new ItemStack(RetrodimModBlocks.FLICKERING_GREEN_3S_B.get()).copy();
							_setstack788.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack788);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack791 = new ItemStack(RetrodimModBlocks.FLICKERING_GREEN_5S_A.get()).copy();
							_setstack791.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack791);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_GREEN_5S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack797 = new ItemStack(RetrodimModBlocks.FLICKERING_GREEN_3S_C.get()).copy();
							_setstack797.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack797);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack800 = new ItemStack(RetrodimModBlocks.PULSING_GREEN_2S_A.get()).copy();
							_setstack800.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack800);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_GREEN_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack806 = new ItemStack(RetrodimModBlocks.FLICKERING_GREEN_5S_A.get()).copy();
							_setstack806.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack806);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack809 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_GREEN.get()).copy();
							_setstack809.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack809);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Lime")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_LIME.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack817 = new ItemStack(RetrodimModBlocks.PULSING_LIME_2S_A.get()).copy();
							_setstack817.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack817);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack820 = new ItemStack(RetrodimModBlocks.FLASHING_LIME_1S_X.get()).copy();
							_setstack820.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack820);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIME_1S_X.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack826 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_LIME.get()).copy();
							_setstack826.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack826);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack829 = new ItemStack(RetrodimModBlocks.FLASHING_LIME_1S_Y.get()).copy();
							_setstack829.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack829);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIME_1S_Y.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack835 = new ItemStack(RetrodimModBlocks.FLASHING_LIME_1S_X.get()).copy();
							_setstack835.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack835);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack838 = new ItemStack(RetrodimModBlocks.FLASHING_LIME_1S_Z.get()).copy();
							_setstack838.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack838);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIME_1S_Z.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack844 = new ItemStack(RetrodimModBlocks.FLASHING_LIME_1S_Y.get()).copy();
							_setstack844.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack844);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack847 = new ItemStack(RetrodimModBlocks.FLASHING_LIME_2S_A.get()).copy();
							_setstack847.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack847);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIME_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack853 = new ItemStack(RetrodimModBlocks.FLASHING_LIME_1S_Z.get()).copy();
							_setstack853.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack853);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack856 = new ItemStack(RetrodimModBlocks.FLASHING_LIME_2S_B.get()).copy();
							_setstack856.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack856);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIME_2S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack862 = new ItemStack(RetrodimModBlocks.FLASHING_LIME_2S_A.get()).copy();
							_setstack862.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack862);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack865 = new ItemStack(RetrodimModBlocks.FLICKERING_LIME_3S_A.get()).copy();
							_setstack865.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack865);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIME_3S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack871 = new ItemStack(RetrodimModBlocks.FLASHING_LIME_2S_B.get()).copy();
							_setstack871.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack871);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack874 = new ItemStack(RetrodimModBlocks.FLICKERING_LIME_3S_B.get()).copy();
							_setstack874.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack874);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIME_3S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack880 = new ItemStack(RetrodimModBlocks.FLICKERING_LIME_3S_A.get()).copy();
							_setstack880.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack880);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack883 = new ItemStack(RetrodimModBlocks.FLICKERING_LIME_3S_C.get()).copy();
							_setstack883.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack883);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIME_3S_C.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack889 = new ItemStack(RetrodimModBlocks.FLICKERING_LIME_3S_B.get()).copy();
							_setstack889.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack889);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack892 = new ItemStack(RetrodimModBlocks.FLICKERING_LIME_5S_A.get()).copy();
							_setstack892.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack892);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIME_5S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack898 = new ItemStack(RetrodimModBlocks.FLICKERING_LIME_3S_C.get()).copy();
							_setstack898.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack898);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack901 = new ItemStack(RetrodimModBlocks.PULSING_LIME_2S_A.get()).copy();
							_setstack901.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack901);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_LIME_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack907 = new ItemStack(RetrodimModBlocks.FLICKERING_LIME_5S_A.get()).copy();
							_setstack907.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack907);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack910 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_LIME.get()).copy();
							_setstack910.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack910);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Magenta")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_MAGENTA.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack918 = new ItemStack(RetrodimModBlocks.PULSING_MAGENTA_2S_A.get()).copy();
							_setstack918.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack918);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack921 = new ItemStack(RetrodimModBlocks.FLASHING_MAGENTA_1S_X.get()).copy();
							_setstack921.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack921);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_MAGENTA_1S_X.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack927 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_MAGENTA.get()).copy();
							_setstack927.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack927);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack930 = new ItemStack(RetrodimModBlocks.FLASHING_MAGENTA_1S_Y.get()).copy();
							_setstack930.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack930);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_MAGENTA_1S_Y.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack936 = new ItemStack(RetrodimModBlocks.FLASHING_MAGENTA_1S_X.get()).copy();
							_setstack936.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack936);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack939 = new ItemStack(RetrodimModBlocks.FLASHING_MAGENTA_1S_Z.get()).copy();
							_setstack939.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack939);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_MAGENTA_1S_Z.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack945 = new ItemStack(RetrodimModBlocks.FLASHING_MAGENTA_1S_Y.get()).copy();
							_setstack945.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack945);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack948 = new ItemStack(RetrodimModBlocks.FLASHING_MAGENTA_2S_A.get()).copy();
							_setstack948.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack948);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_MAGENTA_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack954 = new ItemStack(RetrodimModBlocks.FLASHING_MAGENTA_1S_Z.get()).copy();
							_setstack954.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack954);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack957 = new ItemStack(RetrodimModBlocks.FLASHING_MAGENTA_2S_B.get()).copy();
							_setstack957.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack957);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_MAGENTA_2S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack963 = new ItemStack(RetrodimModBlocks.FLASHING_MAGENTA_2S_A.get()).copy();
							_setstack963.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack963);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack966 = new ItemStack(RetrodimModBlocks.FLICKERING_MAGENTA_3S_A.get()).copy();
							_setstack966.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack966);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_MAGENTA_3S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack972 = new ItemStack(RetrodimModBlocks.FLASHING_MAGENTA_2S_B.get()).copy();
							_setstack972.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack972);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack975 = new ItemStack(RetrodimModBlocks.FLICKERING_MAGENTA_3S_B.get()).copy();
							_setstack975.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack975);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_MAGENTA_3S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack981 = new ItemStack(RetrodimModBlocks.FLICKERING_MAGENTA_3S_A.get()).copy();
							_setstack981.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack981);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack984 = new ItemStack(RetrodimModBlocks.FLICKERING_MAGENTA_3S_C.get()).copy();
							_setstack984.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack984);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_MAGENTA_3S_C.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack990 = new ItemStack(RetrodimModBlocks.FLICKERING_MAGENTA_3S_B.get()).copy();
							_setstack990.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack990);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack993 = new ItemStack(RetrodimModBlocks.FLICKERING_MAGENTA_5S_A.get()).copy();
							_setstack993.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack993);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_MAGENTA_5S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack999 = new ItemStack(RetrodimModBlocks.FLICKERING_MAGENTA_3S_C.get()).copy();
							_setstack999.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack999);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1002 = new ItemStack(RetrodimModBlocks.PULSING_MAGENTA_2S_A.get()).copy();
							_setstack1002.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1002);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_MAGENTA_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1008 = new ItemStack(RetrodimModBlocks.FLICKERING_MAGENTA_5S_A.get()).copy();
							_setstack1008.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1008);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1011 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_MAGENTA.get()).copy();
							_setstack1011.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1011);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Orange")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_ORANGE.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1019 = new ItemStack(RetrodimModBlocks.PULSING_ORANGE_2S_A.get()).copy();
							_setstack1019.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1019);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1022 = new ItemStack(RetrodimModBlocks.FLASHING_ORANGE_1S_X.get()).copy();
							_setstack1022.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1022);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_ORANGE_1S_X.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1028 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_ORANGE.get()).copy();
							_setstack1028.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1028);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1031 = new ItemStack(RetrodimModBlocks.FLASHING_ORANGE_1S_Y.get()).copy();
							_setstack1031.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1031);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_ORANGE_1S_Y.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1037 = new ItemStack(RetrodimModBlocks.FLASHING_ORANGE_1S_X.get()).copy();
							_setstack1037.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1037);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1040 = new ItemStack(RetrodimModBlocks.FLASHING_ORANGE_1S_Z.get()).copy();
							_setstack1040.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1040);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_ORANGE_1S_Z.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1046 = new ItemStack(RetrodimModBlocks.FLASHING_ORANGE_1S_Y.get()).copy();
							_setstack1046.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1046);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1049 = new ItemStack(RetrodimModBlocks.FLASHING_ORANGE_2S_A.get()).copy();
							_setstack1049.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1049);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_ORANGE_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1055 = new ItemStack(RetrodimModBlocks.FLASHING_ORANGE_1S_Z.get()).copy();
							_setstack1055.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1055);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1058 = new ItemStack(RetrodimModBlocks.FLASHING_ORANGE_2S_B.get()).copy();
							_setstack1058.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1058);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_ORANGE_2S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1064 = new ItemStack(RetrodimModBlocks.FLASHING_ORANGE_2S_A.get()).copy();
							_setstack1064.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1064);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1067 = new ItemStack(RetrodimModBlocks.FLICKERING_ORANGE_3S_A.get()).copy();
							_setstack1067.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1067);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_ORANGE_3S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1073 = new ItemStack(RetrodimModBlocks.FLASHING_ORANGE_2S_B.get()).copy();
							_setstack1073.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1073);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1076 = new ItemStack(RetrodimModBlocks.FLICKERING_ORANGE_3S_B.get()).copy();
							_setstack1076.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1076);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_ORANGE_3S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1082 = new ItemStack(RetrodimModBlocks.FLICKERING_ORANGE_3S_A.get()).copy();
							_setstack1082.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1082);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1085 = new ItemStack(RetrodimModBlocks.FLICKERING_ORANGE_3S_C.get()).copy();
							_setstack1085.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1085);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_ORANGE_3S_C.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1091 = new ItemStack(RetrodimModBlocks.FLICKERING_ORANGE_3S_B.get()).copy();
							_setstack1091.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1091);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1094 = new ItemStack(RetrodimModBlocks.FLICKERING_ORANGE_5S_A.get()).copy();
							_setstack1094.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1094);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_ORANGE_5S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1100 = new ItemStack(RetrodimModBlocks.FLICKERING_ORANGE_3S_C.get()).copy();
							_setstack1100.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1100);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1103 = new ItemStack(RetrodimModBlocks.PULSING_ORANGE_2S_A.get()).copy();
							_setstack1103.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1103);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_ORANGE_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1109 = new ItemStack(RetrodimModBlocks.FLICKERING_ORANGE_5S_A.get()).copy();
							_setstack1109.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1109);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1112 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_ORANGE.get()).copy();
							_setstack1112.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1112);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Pink")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_PINK.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1120 = new ItemStack(RetrodimModBlocks.PULSING_PINK_2S_A.get()).copy();
							_setstack1120.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1120);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1123 = new ItemStack(RetrodimModBlocks.FLASHING_PINK_1S_X.get()).copy();
							_setstack1123.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1123);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_PINK_1S_X.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1129 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_PINK.get()).copy();
							_setstack1129.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1129);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1132 = new ItemStack(RetrodimModBlocks.FLASHING_PINK_1S_Y.get()).copy();
							_setstack1132.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1132);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_PINK_1S_Y.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1138 = new ItemStack(RetrodimModBlocks.FLASHING_PINK_1S_X.get()).copy();
							_setstack1138.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1138);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1141 = new ItemStack(RetrodimModBlocks.FLASHING_PINK_1S_Z.get()).copy();
							_setstack1141.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1141);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_PINK_1S_Z.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1147 = new ItemStack(RetrodimModBlocks.FLASHING_PINK_1S_Y.get()).copy();
							_setstack1147.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1147);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1150 = new ItemStack(RetrodimModBlocks.FLASHING_PINK_2S_A.get()).copy();
							_setstack1150.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1150);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_PINK_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1156 = new ItemStack(RetrodimModBlocks.FLASHING_PINK_1S_Z.get()).copy();
							_setstack1156.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1156);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1159 = new ItemStack(RetrodimModBlocks.FLASHING_PINK_2S_B.get()).copy();
							_setstack1159.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1159);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_PINK_2S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1165 = new ItemStack(RetrodimModBlocks.FLASHING_PINK_2S_A.get()).copy();
							_setstack1165.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1165);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1168 = new ItemStack(RetrodimModBlocks.FLICKERING_PINK_3S_A.get()).copy();
							_setstack1168.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1168);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_PINK_3S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1174 = new ItemStack(RetrodimModBlocks.FLASHING_PINK_2S_B.get()).copy();
							_setstack1174.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1174);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1177 = new ItemStack(RetrodimModBlocks.FLICKERING_PINK_3S_B.get()).copy();
							_setstack1177.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1177);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_PINK_3S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1183 = new ItemStack(RetrodimModBlocks.FLICKERING_PINK_3S_A.get()).copy();
							_setstack1183.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1183);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1186 = new ItemStack(RetrodimModBlocks.FLICKERING_PINK_3S_C.get()).copy();
							_setstack1186.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1186);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_PINK_3S_C.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1192 = new ItemStack(RetrodimModBlocks.FLICKERING_PINK_3S_B.get()).copy();
							_setstack1192.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1192);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1195 = new ItemStack(RetrodimModBlocks.FLICKERING_PINK_5S_A.get()).copy();
							_setstack1195.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1195);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_PINK_5S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1201 = new ItemStack(RetrodimModBlocks.FLICKERING_PINK_3S_C.get()).copy();
							_setstack1201.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1201);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1204 = new ItemStack(RetrodimModBlocks.PULSING_PINK_2S_A.get()).copy();
							_setstack1204.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1204);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_PINK_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1210 = new ItemStack(RetrodimModBlocks.FLICKERING_PINK_5S_A.get()).copy();
							_setstack1210.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1210);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1213 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_PINK.get()).copy();
							_setstack1213.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1213);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Purple")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_PURPLE.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1221 = new ItemStack(RetrodimModBlocks.PULSING_PURPLE_2S_A.get()).copy();
							_setstack1221.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1221);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1224 = new ItemStack(RetrodimModBlocks.FLASHING_PURPLE_1S_X.get()).copy();
							_setstack1224.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1224);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_PURPLE_1S_X.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1230 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_PURPLE.get()).copy();
							_setstack1230.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1230);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1233 = new ItemStack(RetrodimModBlocks.FLASHING_PURPLE_1S_Y.get()).copy();
							_setstack1233.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1233);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_PURPLE_1S_Y.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1239 = new ItemStack(RetrodimModBlocks.FLASHING_PURPLE_1S_X.get()).copy();
							_setstack1239.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1239);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1242 = new ItemStack(RetrodimModBlocks.FLASHING_PURPLE_1S_Z.get()).copy();
							_setstack1242.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1242);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_PURPLE_1S_Z.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1248 = new ItemStack(RetrodimModBlocks.FLASHING_PURPLE_1S_Y.get()).copy();
							_setstack1248.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1248);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1251 = new ItemStack(RetrodimModBlocks.FLASHING_PURPLE_2S_A.get()).copy();
							_setstack1251.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1251);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_PURPLE_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1257 = new ItemStack(RetrodimModBlocks.FLASHING_PURPLE_1S_Z.get()).copy();
							_setstack1257.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1257);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1260 = new ItemStack(RetrodimModBlocks.FLASHING_PURPLE_2S_B.get()).copy();
							_setstack1260.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1260);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_PURPLE_2S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1266 = new ItemStack(RetrodimModBlocks.FLASHING_PURPLE_2S_A.get()).copy();
							_setstack1266.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1266);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1269 = new ItemStack(RetrodimModBlocks.FLICKERING_PURPLE_3S_A.get()).copy();
							_setstack1269.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1269);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_PURPLE_3S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1275 = new ItemStack(RetrodimModBlocks.FLASHING_PURPLE_2S_B.get()).copy();
							_setstack1275.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1275);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1278 = new ItemStack(RetrodimModBlocks.FLICKERING_PURPLE_3S_B.get()).copy();
							_setstack1278.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1278);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_PURPLE_3S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1284 = new ItemStack(RetrodimModBlocks.FLICKERING_PURPLE_3S_A.get()).copy();
							_setstack1284.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1284);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1287 = new ItemStack(RetrodimModBlocks.FLICKERING_PURPLE_3S_C.get()).copy();
							_setstack1287.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1287);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_PURPLE_3S_C.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1293 = new ItemStack(RetrodimModBlocks.FLICKERING_PURPLE_3S_B.get()).copy();
							_setstack1293.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1293);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1296 = new ItemStack(RetrodimModBlocks.FLICKERING_PURPLE_5S_A.get()).copy();
							_setstack1296.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1296);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_PURPLE_5S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1302 = new ItemStack(RetrodimModBlocks.FLICKERING_PURPLE_3S_C.get()).copy();
							_setstack1302.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1302);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1305 = new ItemStack(RetrodimModBlocks.PULSING_PURPLE_2S_A.get()).copy();
							_setstack1305.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1305);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_PURPLE_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1311 = new ItemStack(RetrodimModBlocks.FLICKERING_PURPLE_5S_A.get()).copy();
							_setstack1311.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1311);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1314 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_PURPLE.get()).copy();
							_setstack1314.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1314);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Red")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_RED.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1322 = new ItemStack(RetrodimModBlocks.PULSING_RED_2S_A.get()).copy();
							_setstack1322.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1322);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1325 = new ItemStack(RetrodimModBlocks.FLASHING_RED_1S_X.get()).copy();
							_setstack1325.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1325);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_RED_1S_X.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1331 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_RED.get()).copy();
							_setstack1331.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1331);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1334 = new ItemStack(RetrodimModBlocks.FLASHING_RED_1S_Y.get()).copy();
							_setstack1334.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1334);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_RED_1S_Y.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1340 = new ItemStack(RetrodimModBlocks.FLASHING_RED_1S_X.get()).copy();
							_setstack1340.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1340);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1343 = new ItemStack(RetrodimModBlocks.FLASHING_RED_1S_Z.get()).copy();
							_setstack1343.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1343);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_RED_1S_Z.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1349 = new ItemStack(RetrodimModBlocks.FLASHING_RED_1S_Y.get()).copy();
							_setstack1349.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1349);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1352 = new ItemStack(RetrodimModBlocks.FLASHING_RED_2S_A.get()).copy();
							_setstack1352.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1352);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_RED_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1358 = new ItemStack(RetrodimModBlocks.FLASHING_RED_1S_Z.get()).copy();
							_setstack1358.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1358);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1361 = new ItemStack(RetrodimModBlocks.FLASHING_RED_2S_B.get()).copy();
							_setstack1361.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1361);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_RED_2S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1367 = new ItemStack(RetrodimModBlocks.FLASHING_RED_2S_A.get()).copy();
							_setstack1367.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1367);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1370 = new ItemStack(RetrodimModBlocks.FLICKERING_RED_3S_A.get()).copy();
							_setstack1370.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1370);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_RED_3S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1376 = new ItemStack(RetrodimModBlocks.FLASHING_RED_2S_B.get()).copy();
							_setstack1376.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1376);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1379 = new ItemStack(RetrodimModBlocks.FLICKERING_RED_3S_B.get()).copy();
							_setstack1379.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1379);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_RED_3S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1385 = new ItemStack(RetrodimModBlocks.FLICKERING_RED_3S_A.get()).copy();
							_setstack1385.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1385);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1388 = new ItemStack(RetrodimModBlocks.FLICKERING_RED_3S_C.get()).copy();
							_setstack1388.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1388);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_RED_3S_C.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1394 = new ItemStack(RetrodimModBlocks.FLICKERING_RED_3S_B.get()).copy();
							_setstack1394.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1394);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1397 = new ItemStack(RetrodimModBlocks.FLICKERING_RED_5S_A.get()).copy();
							_setstack1397.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1397);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_RED_5S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1403 = new ItemStack(RetrodimModBlocks.FLICKERING_RED_3S_C.get()).copy();
							_setstack1403.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1403);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1406 = new ItemStack(RetrodimModBlocks.PULSING_RED_2S_A.get()).copy();
							_setstack1406.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1406);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_RED_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1412 = new ItemStack(RetrodimModBlocks.FLICKERING_RED_5S_A.get()).copy();
							_setstack1412.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1412);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1415 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_RED.get()).copy();
							_setstack1415.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1415);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("White")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_WHITE.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1423 = new ItemStack(RetrodimModBlocks.PULSING_WHITE_2S_A.get()).copy();
							_setstack1423.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1423);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1426 = new ItemStack(RetrodimModBlocks.FLASHING_WHITE_1S_X.get()).copy();
							_setstack1426.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1426);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_WHITE_1S_X.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1432 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_WHITE.get()).copy();
							_setstack1432.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1432);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1435 = new ItemStack(RetrodimModBlocks.FLASHING_WHITE_1S_Y.get()).copy();
							_setstack1435.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1435);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_WHITE_1S_Y.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1441 = new ItemStack(RetrodimModBlocks.FLASHING_WHITE_1S_X.get()).copy();
							_setstack1441.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1441);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1444 = new ItemStack(RetrodimModBlocks.FLASHING_WHITE_1S_Z.get()).copy();
							_setstack1444.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1444);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_WHITE_1S_Z.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1450 = new ItemStack(RetrodimModBlocks.FLASHING_WHITE_1S_Y.get()).copy();
							_setstack1450.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1450);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1453 = new ItemStack(RetrodimModBlocks.FLASHING_WHITE_2S_A.get()).copy();
							_setstack1453.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1453);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_WHITE_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1459 = new ItemStack(RetrodimModBlocks.FLASHING_WHITE_1S_Z.get()).copy();
							_setstack1459.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1459);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1462 = new ItemStack(RetrodimModBlocks.FLASHING_WHITE_2S_B.get()).copy();
							_setstack1462.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1462);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_WHITE_2S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1468 = new ItemStack(RetrodimModBlocks.FLASHING_WHITE_2S_A.get()).copy();
							_setstack1468.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1468);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1471 = new ItemStack(RetrodimModBlocks.FLICKERING_WHITE_3S_A.get()).copy();
							_setstack1471.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1471);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_WHITE_3S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1477 = new ItemStack(RetrodimModBlocks.FLASHING_WHITE_2S_B.get()).copy();
							_setstack1477.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1477);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1480 = new ItemStack(RetrodimModBlocks.FLICKERING_WHITE_3S_B.get()).copy();
							_setstack1480.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1480);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_WHITE_3S_B.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1486 = new ItemStack(RetrodimModBlocks.FLICKERING_WHITE_3S_A.get()).copy();
							_setstack1486.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1486);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1489 = new ItemStack(RetrodimModBlocks.FLICKERING_WHITE_3S_C.get()).copy();
							_setstack1489.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1489);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_WHITE_3S_C.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1495 = new ItemStack(RetrodimModBlocks.FLICKERING_WHITE_3S_B.get()).copy();
							_setstack1495.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1495);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1498 = new ItemStack(RetrodimModBlocks.FLICKERING_WHITE_5S_A.get()).copy();
							_setstack1498.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1498);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_WHITE_5S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1504 = new ItemStack(RetrodimModBlocks.FLICKERING_WHITE_3S_C.get()).copy();
							_setstack1504.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1504);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1507 = new ItemStack(RetrodimModBlocks.PULSING_WHITE_2S_A.get()).copy();
							_setstack1507.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1507);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_WHITE_2S_A.get().asItem()) {
					if (entity.isShiftKeyDown()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1513 = new ItemStack(RetrodimModBlocks.FLICKERING_WHITE_5S_A.get()).copy();
							_setstack1513.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1513);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack1516 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_WHITE.get()).copy();
							_setstack1516.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1516);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Yellow")) {
				if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString()).contains("Light")) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_LIGHT_YELLOW.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1526 = new ItemStack(RetrodimModBlocks.PULSING_LIGHT_YELLOW_2S_A.get()).copy();
								_setstack1526.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1526);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1529 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_YELLOW_1S_X.get()).copy();
								_setstack1529.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1529);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_YELLOW_1S_X.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1535 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_LIGHT_YELLOW.get()).copy();
								_setstack1535.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1535);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1538 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_YELLOW_1S_Y.get()).copy();
								_setstack1538.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1538);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_YELLOW_1S_Y.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1544 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_YELLOW_1S_X.get()).copy();
								_setstack1544.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1544);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1547 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_YELLOW_1S_Z.get()).copy();
								_setstack1547.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1547);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_YELLOW_1S_Z.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1553 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_YELLOW_1S_Y.get()).copy();
								_setstack1553.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1553);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1556 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_YELLOW_2S_A.get()).copy();
								_setstack1556.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1556);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_YELLOW_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1562 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_YELLOW_1S_Z.get()).copy();
								_setstack1562.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1562);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1565 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_YELLOW_2S_B.get()).copy();
								_setstack1565.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1565);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_LIGHT_YELLOW_2S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1571 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_YELLOW_2S_A.get()).copy();
								_setstack1571.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1571);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1574 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_3S_A.get()).copy();
								_setstack1574.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1574);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_3S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1580 = new ItemStack(RetrodimModBlocks.FLASHING_LIGHT_YELLOW_2S_B.get()).copy();
								_setstack1580.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1580);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1583 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_3S_B.get()).copy();
								_setstack1583.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1583);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_3S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1589 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_3S_A.get()).copy();
								_setstack1589.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1589);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1592 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_3S_C.get()).copy();
								_setstack1592.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1592);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_3S_C.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1598 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_3S_B.get()).copy();
								_setstack1598.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1598);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1601 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_5S_A.get()).copy();
								_setstack1601.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1601);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_5S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1607 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_3S_C.get()).copy();
								_setstack1607.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1607);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1610 = new ItemStack(RetrodimModBlocks.PULSING_LIGHT_YELLOW_2S_A.get()).copy();
								_setstack1610.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1610);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_LIGHT_YELLOW_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1616 = new ItemStack(RetrodimModBlocks.FLICKERING_LIGHT_YELLOW_5S_A.get()).copy();
								_setstack1616.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1616);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1619 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_LIGHT_YELLOW.get()).copy();
								_setstack1619.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1619);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
				} else {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.NEON_BLOCK_YELLOW.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1625 = new ItemStack(RetrodimModBlocks.PULSING_YELLOW_2S_A.get()).copy();
								_setstack1625.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1625);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1628 = new ItemStack(RetrodimModBlocks.FLASHING_YELLOW_1S_X.get()).copy();
								_setstack1628.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1628);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_YELLOW_1S_X.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1634 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_YELLOW.get()).copy();
								_setstack1634.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1634);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1637 = new ItemStack(RetrodimModBlocks.FLASHING_YELLOW_1S_Y.get()).copy();
								_setstack1637.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1637);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_YELLOW_1S_Y.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1643 = new ItemStack(RetrodimModBlocks.FLASHING_YELLOW_1S_X.get()).copy();
								_setstack1643.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1643);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1646 = new ItemStack(RetrodimModBlocks.FLASHING_YELLOW_1S_Z.get()).copy();
								_setstack1646.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1646);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_YELLOW_1S_Z.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1652 = new ItemStack(RetrodimModBlocks.FLASHING_YELLOW_1S_Y.get()).copy();
								_setstack1652.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1652);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1655 = new ItemStack(RetrodimModBlocks.FLASHING_YELLOW_2S_A.get()).copy();
								_setstack1655.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1655);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_YELLOW_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1661 = new ItemStack(RetrodimModBlocks.FLASHING_YELLOW_1S_Z.get()).copy();
								_setstack1661.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1661);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1664 = new ItemStack(RetrodimModBlocks.FLASHING_YELLOW_2S_B.get()).copy();
								_setstack1664.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1664);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLASHING_YELLOW_2S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1670 = new ItemStack(RetrodimModBlocks.FLASHING_YELLOW_2S_A.get()).copy();
								_setstack1670.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1670);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1673 = new ItemStack(RetrodimModBlocks.FLICKERING_YELLOW_3S_A.get()).copy();
								_setstack1673.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1673);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_YELLOW_3S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1679 = new ItemStack(RetrodimModBlocks.FLASHING_YELLOW_2S_B.get()).copy();
								_setstack1679.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1679);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1682 = new ItemStack(RetrodimModBlocks.FLICKERING_YELLOW_3S_B.get()).copy();
								_setstack1682.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1682);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_YELLOW_3S_B.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1688 = new ItemStack(RetrodimModBlocks.FLICKERING_YELLOW_3S_A.get()).copy();
								_setstack1688.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1688);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1691 = new ItemStack(RetrodimModBlocks.FLICKERING_YELLOW_3S_C.get()).copy();
								_setstack1691.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1691);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_YELLOW_3S_C.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1697 = new ItemStack(RetrodimModBlocks.FLICKERING_YELLOW_3S_B.get()).copy();
								_setstack1697.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1697);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1700 = new ItemStack(RetrodimModBlocks.FLICKERING_YELLOW_5S_A.get()).copy();
								_setstack1700.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1700);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.FLICKERING_YELLOW_5S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1706 = new ItemStack(RetrodimModBlocks.FLICKERING_YELLOW_3S_C.get()).copy();
								_setstack1706.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1706);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1709 = new ItemStack(RetrodimModBlocks.PULSING_YELLOW_2S_A.get()).copy();
								_setstack1709.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1709);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RetrodimModBlocks.PULSING_YELLOW_2S_A.get().asItem()) {
						if (entity.isShiftKeyDown()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1715 = new ItemStack(RetrodimModBlocks.FLICKERING_YELLOW_5S_A.get()).copy();
								_setstack1715.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1715);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack1718 = new ItemStack(RetrodimModBlocks.NEON_BLOCK_YELLOW.get()).copy();
								_setstack1718.setCount((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount());
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1718);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:swap")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("retrodim:swap")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}