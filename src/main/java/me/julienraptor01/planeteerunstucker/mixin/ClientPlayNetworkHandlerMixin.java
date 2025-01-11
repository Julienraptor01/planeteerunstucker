package me.julienraptor01.planeteerunstucker.mixin;

import org.spongepowered.asm.mixin.Mixin;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket;

import static me.julienraptor01.planeteerunstucker.PlaneteerUnstucker.LOGGER;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {
	@WrapMethod(
			method = "onEntityPassengersSet"
	)
	private void onEntityPassengersSet(EntityPassengersSetS2CPacket packet, Operation<Void> original) {
		LOGGER.warn("""
				EntityPassengersSetS2CPacket:
				- ID: {}
				- Passenger IDs: {}""", packet.getId(), packet.getPassengerIds());
	}
}
