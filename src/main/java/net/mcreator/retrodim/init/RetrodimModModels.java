/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.retrodim.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.retrodim.client.model.Modelmotorcycle_Converted;
import net.mcreator.retrodim.client.model.Modelbitwisp_Converted;

@EventBusSubscriber(Dist.CLIENT)
public class RetrodimModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbitwisp_Converted.LAYER_LOCATION, Modelbitwisp_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelmotorcycle_Converted.LAYER_LOCATION, Modelmotorcycle_Converted::createBodyLayer);
	}
}