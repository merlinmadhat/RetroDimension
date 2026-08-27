package net.mcreator.retrodim.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.retrodim.init.RetrodimModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class NeonAnimateProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
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
			}
		}
	}
}