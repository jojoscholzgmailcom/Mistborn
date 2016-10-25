package com.mistborn.main;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.client.Minecraft;

public class ServerTickHandler {
	private Minecraft mc;
	public ServerTickHandler(Minecraft mc){
		this.mc = mc;
	}
	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event){
		
	}
}
