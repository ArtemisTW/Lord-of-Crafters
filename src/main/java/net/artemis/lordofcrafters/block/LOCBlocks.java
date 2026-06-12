package net.artemis.lordofcrafters.block;

import net.artemis.lordofcrafters.LordOfCrafters;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LOCBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LordOfCrafters.MODID);




    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
