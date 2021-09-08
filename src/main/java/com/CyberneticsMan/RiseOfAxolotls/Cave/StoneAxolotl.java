package com.CyberneticsMan.RiseOfAxolotls.Cave;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AxolotlEntity;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class StoneAxolotl extends AxolotlEntity implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);


    public StoneAxolotl(EntityType<? extends AxolotlEntity> entityType, World world) {
        super(entityType, world);
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.stone_axolotl.walk", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;

    }
}
