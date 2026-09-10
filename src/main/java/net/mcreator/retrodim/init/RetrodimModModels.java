/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.retrodim.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.retrodim.client.model.Modelpastel_flipper;

@EventBusSubscriber(Dist.CLIENT)
public class RetrodimModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelpastel_flipper.LAYER_LOCATION, Modelpastel_flipper::createBodyLayer);
	}
}