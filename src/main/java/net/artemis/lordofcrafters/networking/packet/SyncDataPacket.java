package net.artemis.lordofcrafters.networking.packet;

import net.artemis.lordofcrafters.LordOfCrafters;
import net.minecraft.client.Minecraft;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

// Sync Attachment Data with the Client Side
public class SyncDataPacket extends AbstractPacket {
    public static final Type<SyncDataPacket> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(LordOfCrafters.MODID, "sync_data_packet"));
    public static final StreamCodec<RegistryFriendlyByteBuf, SyncDataPacket> CODEC = StreamCodec.ofMember(SyncDataPacket::toBytes, SyncDataPacket::new);

    public SyncDataPacket(RegistryFriendlyByteBuf byteBuf) {

    }

    public <T> SyncDataPacket(T Data) {

    }

    public void toBytes(RegistryFriendlyByteBuf buf) {

    }

    @Override
    public void onClientReceived(Minecraft minecraft, Player player) {
    }

    @Override
    public void onServerReceived(MinecraftServer minecraftServer, ServerPlayer serverPlayer) {

    }

    @Override
    public @NotNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
