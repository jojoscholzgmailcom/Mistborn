package com.mistborn.items;

import com.mistborn.entity.Entitydolch;
import com.mistborn.entity.Entityobsidiandolch;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class obsidiandolch extends ItemSword{
	public obsidiandolch(Item.ToolMaterial mat){
		super(mat);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		if(!player.capabilities.isCreativeMode){
			--itemstack.stackSize;
		}
		
		if(!world.isRemote){
			world.spawnEntityInWorld(new Entityobsidiandolch(world, player));
		}
		
		
		return super.onItemRightClick(itemstack, world, player);
	}
}
