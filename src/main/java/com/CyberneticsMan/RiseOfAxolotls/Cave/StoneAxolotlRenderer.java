package com.CyberneticsMan.RiseOfAxolotls.Cave;

import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class StoneAxolotlRenderer extends GeoEntityRenderer<StoneAxolotl> {
    public StoneAxolotlRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new StoneAxolotlModel());
    }
}
