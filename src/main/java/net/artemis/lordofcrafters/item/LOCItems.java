package net.artemis.lordofcrafters.item;

import net.artemis.lordofcrafters.LordOfCrafters;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LOCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LordOfCrafters.MODID);




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
