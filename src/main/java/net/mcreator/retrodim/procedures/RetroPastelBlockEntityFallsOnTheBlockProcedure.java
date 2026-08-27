package net.mcreator.retrodim.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class RetroPastelBlockEntityFallsOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double distance) {
		if (entity == null)
			return;
		double energyadded = 0;
		if ((entity instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) > 0) {
			energyadded = (entity instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) * 1000;
		} else if (distance > 0) {
			energyadded = distance * 1000;
		}
		if (energyadded > 0) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("emitting", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			PastelAddEnergyProcedure.execute(world, x, y, z, energyadded);
		}
	}
}