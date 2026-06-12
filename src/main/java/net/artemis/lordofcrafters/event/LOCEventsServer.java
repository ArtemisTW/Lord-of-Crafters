package net.artemis.lordofcrafters.event;

import net.artemis.lordofcrafters.LordOfCrafters;
import net.artemis.lordofcrafters.components.LOCAttachments;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

import java.util.Objects;

import static net.artemis.lordofcrafters.components.LOCAttributes.DURABILITY;
import static net.artemis.lordofcrafters.components.LOCAttributes.SPIRITUALITY;

@EventBusSubscriber(modid = LordOfCrafters.MODID)
public class LOCEventsServer {
    @SubscribeEvent
    public static void beyonderDeath(LivingDeathEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if (player.hasData(LOCAttachments.BEYONDER)) {
                ItemStack characteristic = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(LordOfCrafters.MODID, player.getData(LOCAttachments.BEYONDER).SEQUENCE_NAME + "_characteristic")).getDefaultInstance();
                player.addItem(characteristic);
                player.drop(characteristic, true);
                player.removeData(LOCAttachments.BEYONDER);
            }
        }
    }

    @SubscribeEvent
    public static void addAttributes(EntityAttributeModificationEvent event) {
        event.add(EntityType.PLAYER, DURABILITY);
        event.add(EntityType.PLAYER, SPIRITUALITY);
    }

    // Rudimentary Logic for now until I get more accurate / complex logic in for Durability calculation
    @SubscribeEvent
    public static void applyDurabilityCalculation(LivingDamageEvent.Pre event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            event.setNewDamage((float) (event.getNewDamage() - Objects.requireNonNull(player.getAttribute(DURABILITY)).getValue()));
        }
    }











}
