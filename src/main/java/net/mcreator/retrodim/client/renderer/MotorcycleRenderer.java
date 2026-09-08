package net.mcreator.retrodim.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.retrodim.entity.MotorcycleEntity;
import net.mcreator.retrodim.client.model.Modelmotorcycle_Converted;

public class MotorcycleRenderer extends MobRenderer<MotorcycleEntity, Modelmotorcycle_Converted<MotorcycleEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("retrodim:textures/entities/motorcycle.png");

	public MotorcycleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmotorcycle_Converted<MotorcycleEntity>(context.bakeLayer(Modelmotorcycle_Converted.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MotorcycleEntity entity) {
		return entityTexture;
	}
}