package com.mistborn.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class obsidianschwert extends ItemSword{
	public obsidianschwert(Item.ToolMaterial mat){
		super(mat);
	}
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		
		entity.setFire(10);
		player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 220, 3));
		
		return super.onLeftClickEntity(stack, player, entity);
	}
}

