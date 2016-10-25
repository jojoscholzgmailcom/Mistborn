package com.mistborn.items;

import com.mojang.authlib.GameProfile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;


public class EntityPlayerJonas extends EntityPlayer{

	public boolean isRightClick =false;
	
	public EntityPlayerJonas(World p_i45324_1_, GameProfile p_i45324_2_) {
		super(p_i45324_1_, p_i45324_2_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addChatMessage(IChatComponent p_145747_1_) {
		this.addChatMessage(p_145747_1_);
		
	}

	@Override
	public boolean canCommandSenderUseCommand(int p_70003_1_, String p_70003_2_) {
		
		return this.canCommandSenderUseCommand(p_70003_1_, p_70003_2_);
	}

	@Override
	public ChunkCoordinates getPlayerCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

}
