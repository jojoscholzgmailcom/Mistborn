package com.mistborn.items;

import com.mistborn.entity.Entitydolch;
import com.mistborn.entity.Entityglasdolch;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemBow;
import net.minecraft.world.World;

public class glasdolch extends ItemSword{
	public glasdolch(Item.ToolMaterial mat){
		super(mat);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		if(!player.capabilities.isCreativeMode){
			--itemstack.stackSize;
		}
		if(!world.isRemote){
			world.spawnEntityInWorld(new Entityglasdolch(world, player));
		}
		
		
		return super.onItemRightClick(itemstack, world, player);
	}
	/*@Override
	*public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer entity) {
	*	if(entity.canEntityBeSeen(entity)){
	*	ItemBow itemBow	= new ItemBow();
	*	Entity entity1 = itemBow.createEntity(world, entity, stack);
	*	
	*	}
	*	
	*	return super.onItemRightClick(stack, world, entity);
	*}
	*/
}
