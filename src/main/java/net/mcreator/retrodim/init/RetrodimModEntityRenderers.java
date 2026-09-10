/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.retrodim.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.retrodim.client.renderer.LivingFlipperTestRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class RetrodimModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RetrodimModEntities.LIVING_FLIPPER_TEST.get(), LivingFlipperTestRenderer::new);
	}
}