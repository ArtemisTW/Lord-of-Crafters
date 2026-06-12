package net.artemis.lordofcrafters.components;

import net.artemis.lordofcrafters.LordOfCrafters;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;

public class LOCAttributes {
    public static final Holder<Attribute> DURABILITY = register("attribute.durability", (new RangedAttribute("attribute.name.durability", 0.0f, 0.0f, 1024.0f).setSyncable(true)));
    public static final Holder<Attribute> SPIRITUALITY = register("attribute.spirituality", (new RangedAttribute("attribute.name.spirituality", 0.0f, 0.0f, Double.MAX_VALUE).setSyncable(true)));



    private static Holder<Attribute> register(String name, Attribute attribute) {
        return Registry.registerForHolder(BuiltInRegistries.ATTRIBUTE, ResourceLocation.fromNamespaceAndPath(LordOfCrafters.MODID, name), attribute);
    }
}
