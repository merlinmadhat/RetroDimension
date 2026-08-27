package net.mcreator.retrodim.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.Entity;

public class RetroPastelBlockOnBlockHitByProjectileProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) > 0) {
			PastelAddEnergyProcedure.execute(world, x, y, z, (entity instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) * 1000);
		}
	}
}