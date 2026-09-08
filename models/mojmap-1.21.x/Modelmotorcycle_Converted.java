// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmotorcycle_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "motorcycle_converted"), "main");
	private final ModelPart bone;

	public Modelmotorcycle_Converted(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(38, 19)
						.addBox(-10.0F, -8.0F, 14.5F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(2, 47)
						.addBox(-10.0F, -8.0F, -3.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(34, 37)
						.addBox(-11.0F, -13.9F, -1.1F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(14, 1)
						.addBox(-14.5F, -13.1F, 3.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 1)
						.addBox(-10.5F, -11.0F, 6.0F, 5.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(1, 7)
						.addBox(-12.5F, -4.5F, 9.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(1, 7)
						.addBox(-5.5F, -4.5F, 9.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(-11.0F, -12.5F, 12.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -11.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(1, 35).addBox(-5.375F, -5.25F, -2.0F, 4.75F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -4.75F, 12.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(19, 12).addBox(-4.125F, -5.5F, -8.5F, 4.75F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.25F, -2.75F, 9.75F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(28, 53).addBox(-2.996F, -2.0F, -3.1F, 5.995F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -10.2696F, 5.3462F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}