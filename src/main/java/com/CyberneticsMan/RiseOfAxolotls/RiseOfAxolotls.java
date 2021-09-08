package com.CyberneticsMan.RiseOfAxolotls;

import com.CyberneticsMan.RiseOfAxolotls.Cave.StoneAxolotl;
import com.CyberneticsMan.RiseOfAxolotls.Yeti.YetAxolotl;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

public class RiseOfAxolotls  implements ModInitializer {
    public static final String MOD_ID = "rise_of_axolotls";


    public static final EntityType<StoneAxolotl> STONE_AXOLOTL = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID, "stone_axolotl"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, StoneAxolotl::new).dimensions(EntityDimensions.fixed(1.3f, 0.6f)).build()
    );
    public static final EntityType<YetAxolotl> YETI_AXOLOTL = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID, "yeti_axolotl"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, YetAxolotl::new).dimensions(EntityDimensions.fixed(3f, 2f)).build()
    );

    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        FabricDefaultAttributeRegistry.register(STONE_AXOLOTL,StoneAxolotl.createAxolotlAttributes());
        FabricDefaultAttributeRegistry.register(YETI_AXOLOTL,YetAxolotl.createMobAttributes().add(EntityAttributes.GENERIC_ATTACK_DAMAGE));


    }
}