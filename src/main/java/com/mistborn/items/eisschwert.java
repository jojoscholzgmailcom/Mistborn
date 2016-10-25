package com.mistborn.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class eisschwert extends ItemSword{
	public eisschwert(Item.ToolMaterial mat){
		super(mat);
	}
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 4));
		
		return super.onLeftClickEntity(stack, player, entity);
	}
}
