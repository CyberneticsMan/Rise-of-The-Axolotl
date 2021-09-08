package com.CyberneticsMan.RiseOfAxolotls;


import com.CyberneticsMan.RiseOfAxolotls.Cave.StoneAxolotlRenderer;
import com.CyberneticsMan.RiseOfAxolotls.Yeti.YetAxolotlRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;


@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {




    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(RiseOfAxolotls.STONE_AXOLOTL, StoneAxolotlRenderer::new);
        EntityRendererRegistry.INSTANCE.register(RiseOfAxolotls.YETI_AXOLOTL, YetAxolotlRenderer::new);

    }
}
