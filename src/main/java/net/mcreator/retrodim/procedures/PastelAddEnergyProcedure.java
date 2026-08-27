package net.mcreator.retrodim.procedures;

import net.neoforged.neoforge.energy.IEnergyStorage;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.retrodim.init.RetrodimModBlocks;

public class PastelAddEnergyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, double energyAdded) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double energyused = 0;
		double cx = 0;
		double cy = 0;
		double cz = 0;
		double tx = 0;
		double ty = 0;
		double tz = 0;
		double loops = 0;
		if (world instanceof ILevelExtension _ext) {
			IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
			if (_entityStorage != null)
				_entityStorage.receiveEnergy((int) energyAdded, false);
		}
		tx = x;
		ty = y;
		tz = z;
		found = false;
		energyused = Mth.clamp(getEnergyStored(world, BlockPos.containing(x, y, z), null) * 0.1, 10, 100);
		loops = Mth.clamp(energyused / 10, 1, 3);
		sx = -1;
		for (int _i1 = 0; _i1 < 3; _i1++) {
			sz = -1;
			for (int _i2 = 0; _i2 < 3; _i2++) {
				if ((world.getBlockState(BlockPos.containing(tx + sx, ty + sy, tz + sz))).getBlock() == RetrodimModBlocks.RETRO_PASTEL_BLOCK.get() && !(sx == 0 && sy == 0 && sz == 0)) {
					found = true;
					if (world instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
						if (_entityStorage != null)
							_entityStorage.extractEnergy((int) energyused, false);
					}
					PastelToggleColorProcedure.execute(world, tx + sx, ty + sy, tz + sz);
					for (int _i3 = 0; _i3 < (int) loops; _i3++) {
						cx = 0;
						cz = 0;
						while (cx == 0 && cz == 0) {
							cx = Mth.nextInt(RandomSource.create(), -1, 1);
							cz = Mth.nextInt(RandomSource.create(), -1, 1);
						}
						if ((world.getBlockState(BlockPos.containing(tx + sx + cx, ty + sy, tz + sz + cz))).getBlock() == RetrodimModBlocks.RETRO_PASTEL_BLOCK.get()) {
							PastelToggleColorProcedure.execute(world, tx + sx + cx, ty + sy, tz + sz + cz);
						} else {
							break;
						}
					}
				}
				sz = sz + 1;
			}
			sx = sx + 1;
		}
	}

	public static int getEnergyStored(LevelAccessor level, BlockPos pos, Direction direction) {
		if (level instanceof ILevelExtension levelExtension) {
			IEnergyStorage energyStorage = levelExtension.getCapability(Capabilities.EnergyStorage.BLOCK, pos, direction);
			if (energyStorage != null)
				return energyStorage.getEnergyStored();
		}
		return 0;
	}
}