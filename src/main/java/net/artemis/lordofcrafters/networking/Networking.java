package net.artemis.lordofcrafters.networking;

import net.artemis.lordofcrafters.networking.packet.AbstractPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.fml.LogicalSide;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

public class Networking {
    public static void register(final RegisterPayloadHandlersEvent event) {
        final PayloadRegistrar registrar = event.registrar("1");



    }

    public static <T extends AbstractPacket> void handle(T message, IPayloadContext context) {
        if (context.flow().getReceptionSide() == LogicalSide.SERVER) {
            handleServer(message, context);
        }
        else {
            ClientHandler.handleClient(message, context);
        }
    }

    public static <T extends AbstractPacket> void handleServer(T message, IPayloadContext context) {
        MinecraftServer server = context.player().getServer();
        message.onServerReceived(server, (ServerPlayer) context.player());
    }

    private static class ClientHandler {
        public static <T extends AbstractPacket> void handleClient(T message, IPayloadContext context) {
            Minecraft minecraft = Minecraft.getInstance();
            message.onClientReceived(minecraft, minecraft.player);
        }
    }
}
