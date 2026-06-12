package net.artemis.lordofcrafters.components;

import net.artemis.lordofcrafters.LordOfCrafters;
import net.artemis.lordofcrafters.beyonder.Beyonder;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class LOCAttachments {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES =
            DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, LordOfCrafters.MODID);


    public static final Supplier<AttachmentType<Beyonder>> BEYONDER = ATTACHMENT_TYPES.register("beyonder",
            () -> AttachmentType.<Beyonder>builder(Beyonder::new).build());



    public static void register(IEventBus eventBus) {
        ATTACHMENT_TYPES.register(eventBus);
    }
}
