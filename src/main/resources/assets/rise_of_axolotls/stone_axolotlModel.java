// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class stone_axolotl extends EntityModel<Entity> {
	private final ModelRenderer root;
	private final ModelRenderer body;
	private final ModelRenderer Back;
	private final ModelRenderer thing2_r1;
	private final ModelRenderer thing1_r1;
	private final ModelRenderer thing2_r2;
	private final ModelRenderer thing3_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer tail;
	private final ModelRenderer head;
	private final ModelRenderer left_gills;
	private final ModelRenderer right_gills;
	private final ModelRenderer top_gills;

	public stone_axolotl() {
		textureWidth = 64;
		textureHeight = 64;

		root = new ModelRenderer(this);
		root.setRotationPoint(0.0F, 28.0F, 0.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -7.0F, 4.0F);
		root.addChild(body);
		body.setTextureOffset(0, 11).addBox(-4.0F, -1.0F, -9.0F, 8.0F, 4.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(2, 17).addBox(0.0F, -2.0F, -9.0F, 0.0F, 5.0F, 9.0F, 0.0F, false);

		Back = new ModelRenderer(this);
		Back.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(Back);
		

		thing2_r1 = new ModelRenderer(this);
		thing2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Back.addChild(thing2_r1);
		setRotationAngle(thing2_r1, 0.102F, 0.1932F, 0.2717F);
		thing2_r1.setTextureOffset(56, 54).addBox(0.0F, -12.0F, -6.0F, 3.0F, 12.0F, 3.0F, 0.0F, false);

		thing1_r1 = new ModelRenderer(this);
		thing1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Back.addChild(thing1_r1);
		setRotationAngle(thing1_r1, 0.0F, 0.2182F, -0.2182F);
		thing1_r1.setTextureOffset(56, 54).addBox(-2.0F, -8.0F, -6.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		thing2_r2 = new ModelRenderer(this);
		thing2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Back.addChild(thing2_r2);
		setRotationAngle(thing2_r2, -0.3054F, 0.0F, 0.0F);
		thing2_r2.setTextureOffset(56, 54).addBox(-2.0F, -8.0F, -5.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		thing3_r1 = new ModelRenderer(this);
		thing3_r1.setRotationPoint(0.4391F, -3.423F, -3.5482F);
		Back.addChild(thing3_r1);
		setRotationAngle(thing3_r1, -1.9511F, 1.0472F, -1.8979F);
		thing3_r1.setTextureOffset(56, 54).addBox(-1.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, 2.0F, -8.0F);
		body.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, -1.5708F, 1.5708F);
		right_arm.setTextureOffset(2, 13).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.0F, 2.0F, 0.0F);
		body.addChild(right_leg);
		setRotationAngle(right_leg, 0.0F, 1.5708F, 1.5708F);
		right_leg.setTextureOffset(2, 13).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.0F, 2.0F, -8.0F);
		body.addChild(left_arm);
		setRotationAngle(left_arm, 0.0F, 1.5708F, -1.5708F);
		left_arm.setTextureOffset(2, 13).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.0F, 2.0F, 0.0F);
		body.addChild(left_leg);
		setRotationAngle(left_leg, 0.0F, -1.5708F, -1.5708F);
		left_leg.setTextureOffset(2, 13).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 1.0F, 0.0F);
		body.addChild(tail);
		tail.setTextureOffset(2, 19).addBox(0.0F, -3.0F, 0.0F, 0.0F, 5.0F, 12.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, -9.0F);
		body.addChild(head);
		head.setTextureOffset(0, 1).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 5.0F, 5.0F, 0.0F, false);

		left_gills = new ModelRenderer(this);
		left_gills.setRotationPoint(4.0F, 0.0F, -1.0F);
		head.addChild(left_gills);
		left_gills.setTextureOffset(11, 40).addBox(0.0F, -5.0F, 0.0F, 3.0F, 7.0F, 0.0F, 0.0F, false);

		right_gills = new ModelRenderer(this);
		right_gills.setRotationPoint(-4.0F, 0.0F, -1.0F);
		head.addChild(right_gills);
		right_gills.setTextureOffset(0, 40).addBox(-3.0F, -5.0F, 0.0F, 3.0F, 7.0F, 0.0F, 0.0F, false);

		top_gills = new ModelRenderer(this);
		top_gills.setRotationPoint(0.0F, -3.0F, -1.0F);
		head.addChild(top_gills);
		top_gills.setTextureOffset(3, 37).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 3.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		root.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}