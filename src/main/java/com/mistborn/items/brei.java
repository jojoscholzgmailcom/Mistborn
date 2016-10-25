package com.mistborn.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class brei extends ItemFood{

	public brei() {
		super(4, 1, false);
		// TODO Auto-generated constructor stub
	}
	@Override
	public ItemStack onEaten(ItemStack stack, World world, EntityPlayer entity) {
		entity.addPotionEffect(new PotionEffect(Potion.confusion.id, 120, 3));
		return super.onEaten(stack, world, entity);
	}
}
