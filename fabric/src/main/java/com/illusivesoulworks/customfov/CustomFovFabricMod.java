package com.illusivesoulworks.customfov;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;

public class CustomFovFabricMod implements ClientModInitializer {

  @Override
  public void onInitializeClient() {
    KeyBindingHelper.registerKeyBinding(CustomFovProfiles.registerKeys());
    ClientTickEvents.END_CLIENT_TICK.register(client -> CustomFovProfiles.tick());
    ClientLifecycleEvents.CLIENT_STARTED.register(client -> CustomFovProfiles.setupProfiles());
  }
}
