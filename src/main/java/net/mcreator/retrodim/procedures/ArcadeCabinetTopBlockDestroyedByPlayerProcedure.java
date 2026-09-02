package net.mcreator.retrodim.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.retrodim.init.RetrodimModBlocks;
import net.mcreator.retrodim.RetrodimMod;

public class ArcadeCabinetTopBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == RetrodimModBlocks.ARCADE_CABINET.get()) {
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				RetrodimMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y - 1), z, new ItemStack(RetrodimModBlocks.ARCADE_CABINET.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
	}
}