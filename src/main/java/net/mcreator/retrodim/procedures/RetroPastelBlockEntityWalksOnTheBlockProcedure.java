package net.mcreator.retrodim.procedures;

import net.minecraft.world.level.LevelAccessor;

public class RetroPastelBlockEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		PastelToggleColorProcedure.execute(world, x, y, z);
	}
}