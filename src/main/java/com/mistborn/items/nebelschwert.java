package com.mistborn.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class nebelschwert extends ItemSword{
	public nebelschwert(Item.ToolMaterial mat){
		super(mat);
	}
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		
		entity.setDead();
		
		return super.onLeftClickEntity(stack, player, entity);
	}
	
	
	
}
