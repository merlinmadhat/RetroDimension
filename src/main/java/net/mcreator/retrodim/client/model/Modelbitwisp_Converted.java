package net.mcreator.retrodim.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbitwisp_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("retrodim", "modelbitwisp_converted"), "main");
	public final ModelPart bone;
	public final ModelPart bone7;
	public final ModelPart bone4;
	public final ModelPart bone3;
	public final ModelPart bone6;
	public final ModelPart bone5;
	public final ModelPart bone2;
	public final ModelPart bone8;

	public Modelbitwisp_Converted(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone7 = this.bone.getChild("bone7");
		this.bone4 = this.bone.getChild("bone4");
		this.bone3 = this.bone.getChild("bone3");
		this.bone6 = this.bone.getChild("bone6");
		this.bone5 = this.bone.getChild("bone5");
		this.bone2 = this.bone.getChild("bone2");
		this.bone8 = root.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(8.0F, 24.0F, -8.0F));
		PartDefinition bone7 = bone.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.5F, -3.0F, 6.5F));
		PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.0F, -16.0F, 11.0F));
		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(8, 8).addBox(-0.75F, -0.75F, -0.75F, 1.5F, 1.5F, 1.5F, new CubeDeformation(0.0F)), PartPose.offset(-3.75F, -19.75F, 7.75F));
		PartDefinition bone6 = bone.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -7.5F, 10.0F));
		PartDefinition bone5 = bone.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(8, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, -12.0F, 5.0F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(8, 4).addBox(-0.75F, -1.0F, -0.75F, 1.5F, 2.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offset(-6.75F, -24.0F, 4.75F));
		PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(4, 9).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, 23.5F, 3.5F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bone8.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}