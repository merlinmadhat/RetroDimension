/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.retrodim.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.retrodim.RetrodimMod;

public class RetrodimModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, RetrodimMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> PORTALSYNTHWAVE = REGISTRY.register("portalsynthwave", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("retrodim", "portalsynthwave")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PLINK = REGISTRY.register("plink", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("retrodim", "plink")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MPLINK = REGISTRY.register("mplink", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("retrodim", "mplink")));
	public static final DeferredHolder<SoundEvent, SoundEvent> THWUMP = REGISTRY.register("thwump", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("retrodim", "thwump")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ERR = REGISTRY.register("err", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("retrodim", "err")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SWAP = REGISTRY.register("swap", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("retrodim", "swap")));
}