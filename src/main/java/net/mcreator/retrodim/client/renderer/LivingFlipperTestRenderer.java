package net.mcreator.retrodim.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.retrodim.entity.LivingFlipperTestEntity;
import net.mcreator.retrodim.client.model.animations.pastel_flipperAnimation;
import net.mcreator.retrodim.client.model.Modelpastel_flipper;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LivingFlipperTestRenderer extends MobRenderer<LivingFlipperTestEntity, Modelpastel_flipper<LivingFlipperTestEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("retrodim:textures/entities/pastelflipperone.png");

	public LivingFlipperTestRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelpastel_flipper.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<LivingFlipperTestEntity, Modelpastel_flipper<LivingFlipperTestEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("retrodim:textures/entities/pastelflipperone.png");
			final EntityModel LAYER_MODEL = new Modelpastel_flipper(Minecraft.getInstance().getEntityModels().bakeLayer(Modelpastel_flipper.LAYER_LOCATION));

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingFlipperTestEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().copyPropertiesTo(LAYER_MODEL);
				LAYER_MODEL.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				LAYER_MODEL.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				LAYER_MODEL.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	protected void scale(LivingFlipperTestEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(LivingFlipperTestEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelpastel_flipper<LivingFlipperTestEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<LivingFlipperTestEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(LivingFlipperTestEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, pastel_flipperAnimation.Swing, ageInTicks, 0.8f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(LivingFlipperTestEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}