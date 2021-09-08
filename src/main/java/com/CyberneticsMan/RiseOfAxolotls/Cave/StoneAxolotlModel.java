package com.CyberneticsMan.RiseOfAxolotls.Cave;

import com.CyberneticsMan.RiseOfAxolotls.RiseOfAxolotls;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StoneAxolotlModel extends AnimatedGeoModel<StoneAxolotl> {
    @Override
    public Identifier getModelLocation(StoneAxolotl object) {
        return new Identifier(RiseOfAxolotls.MOD_ID,"geo/stone_axolotl.geo.json");
    }

    @Override
    public Identifier getTextureLocation(StoneAxolotl object) {
        return new Identifier(RiseOfAxolotls.MOD_ID,"textures/entity/stone_axolotl.png");
    }

    @Override
    public Identifier getAnimationFileLocation(StoneAxolotl animatable) {
        return new Identifier(RiseOfAxolotls.MOD_ID,"animations/stone_axolotl.animation.json");
    }
}
