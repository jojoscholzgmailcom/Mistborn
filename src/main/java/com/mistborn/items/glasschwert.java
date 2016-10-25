package com.mistborn.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class glasschwert extends ItemSword{
	public glasschwert(Item.ToolMaterial mat){
		super(mat);
	}
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		
		player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 600, 3));
		
		return super.onLeftClickEntity(stack, player, entity);
	}
}

