package com.CyberneticsMan.RiseOfAxolotls.Yeti;

import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class YetAxolotlRenderer extends GeoEntityRenderer<YetAxolotl> {
    public YetAxolotlRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new YetAxolotlModel());
    }
}
