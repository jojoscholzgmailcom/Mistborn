package com.mistborn.items;

import java.util.List;

import com.mistborn.entity.Entitydolch;
import com.mistborn.main.Mistborn;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class nebeldolch extends ItemSword{
	public nebeldolch(Item.ToolMaterial mat){
		super(mat);
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		
		//entity.setDead();
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 200, 3));
			
		return super.onLeftClickEntity(stack, player, entity);
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer entity, List list, boolean b) {
		
		if(stack.areItemStacksEqual(entity.getHeldItem(), stack)==true){
			entity.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100, 3));
		}
		super.addInformation(stack, entity, list, b);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		if(!player.capabilities.isCreativeMode){
			--itemstack.stackSize;
		}
		if(!world.isRemote){
			world.spawnEntityInWorld(new Entitydolch(world, player));
		}
		
		
		return super.onItemRightClick(itemstack, world, player);
	}
}
