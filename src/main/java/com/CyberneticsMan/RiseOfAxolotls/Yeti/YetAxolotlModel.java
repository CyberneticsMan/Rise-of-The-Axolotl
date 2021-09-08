package com.CyberneticsMan.RiseOfAxolotls.Yeti;

import com.CyberneticsMan.RiseOfAxolotls.RiseOfAxolotls;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class YetAxolotlModel extends AnimatedGeoModel<YetAxolotl>

    {
        @Override
        public Identifier getModelLocation(YetAxolotl object) {
        return new Identifier(RiseOfAxolotls.MOD_ID,"geo/yeti_axolotl.geo.json");
    }

        @Override
        public Identifier getTextureLocation(YetAxolotl object) {
        return new Identifier(RiseOfAxolotls.MOD_ID,"textures/entity/yeti_axolotl.png");
    }

        @Override
        public Identifier getAnimationFileLocation(YetAxolotl animatable) {
        return new Identifier(RiseOfAxolotls.MOD_ID,"animations/yeti_axolotl.animation.json");
    }
    }
