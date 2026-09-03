package net.mcreator.retrodim.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.retrodim.init.RetrodimModBlocks;
import net.mcreator.retrodim.RetrodimMod;

public class PastelToggleColorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState localblock = Blocks.AIR.defaultBlockState();
		if (!world.isClientSide()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetrodimModBlocks.RETRO_PASTEL_BLOCK.get()) {
				localblock = (world.getBlockState(BlockPos.containing(x, y, z)));
				if (!getBlockNBTLogic(world, BlockPos.containing(x, y, z), "emitting")) {
					if ((getPropertyByName(localblock, "color") instanceof EnumProperty _getep5 ? localblock.getValue(_getep5).toString() : "").equals("blue")) {
						{
							String _value = "green";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					} else if ((getPropertyByName(localblock, "color") instanceof EnumProperty _getep7 ? localblock.getValue(_getep7).toString() : "").equals("green")) {
						{
							String _value = "orange";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					} else if ((getPropertyByName(localblock, "color") instanceof EnumProperty _getep9 ? localblock.getValue(_getep9).toString() : "").equals("orange")) {
						{
							String _value = "pink";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					} else if ((getPropertyByName(localblock, "color") instanceof EnumProperty _getep11 ? localblock.getValue(_getep11).toString() : "").equals("pink")) {
						{
							String _value = "purple";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					} else if ((getPropertyByName(localblock, "color") instanceof EnumProperty _getep13 ? localblock.getValue(_getep13).toString() : "").equals("purple")) {
						{
							String _value = "red";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					} else if ((getPropertyByName(localblock, "color") instanceof EnumProperty _getep15 ? localblock.getValue(_getep15).toString() : "").equals("red")) {
						{
							String _value = "tan";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					} else if ((getPropertyByName(localblock, "color") instanceof EnumProperty _getep17 ? localblock.getValue(_getep17).toString() : "").equals("tan")) {
						{
							String _value = "taupe";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					} else if ((getPropertyByName(localblock, "color") instanceof EnumProperty _getep19 ? localblock.getValue(_getep19).toString() : "").equals("taupe")) {
						{
							String _value = "yellow";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					} else if ((getPropertyByName(localblock, "color") instanceof EnumProperty _getep21 ? localblock.getValue(_getep21).toString() : "").equals("yellow")) {
						{
							String _value = "cyan";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					} else if ((getPropertyByName(localblock, "color") instanceof EnumProperty _getep23 ? localblock.getValue(_getep23).toString() : "").equals("cyan")) {
						{
							String _value = "white";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					} else if ((getPropertyByName(localblock, "color") instanceof EnumProperty _getep25 ? localblock.getValue(_getep25).toString() : "").equals("white")) {
						{
							String _value = "blue";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					} else {
						{
							String _value = "green";
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("color") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
								world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
						}
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putBoolean("emitting", true);
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					RetrodimMod.queueServerWork(5, () -> {
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
					});
				}
			}
		}
	}

	private static boolean getBlockNBTLogic(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getBoolean(tag);
		return false;
	}

	private static Property<?> getPropertyByName(BlockState state, String name) {
		for (Property<?> property : state.getProperties()) {
			if (property.getName().equals(name)) {
				return property;
			}
		}
		return null;
	}
}