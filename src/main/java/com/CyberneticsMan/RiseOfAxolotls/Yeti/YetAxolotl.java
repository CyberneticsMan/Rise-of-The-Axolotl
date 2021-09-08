package com.CyberneticsMan.RiseOfAxolotls.Yeti;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class YetAxolotl extends HostileEntity implements IAnimatable {
    private final AnimationFactory factory = new AnimationFactory(this);

    public YetAxolotl(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }


    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {

        if (this.isAttacking()){
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.yeti_axolotl.attack", true));
        }
        else if (event.isMoving()){
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.yeti_axolotl.walk", true));
        }

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
