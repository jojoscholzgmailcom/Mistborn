package com.mistborn.items;

import com.mistborn.main.Mistborn;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class kupfer extends Item{
	public kupfer(int id){
		super();
	}
	int ersterrechtsklick = 1;
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer entity) {
		//Achtung nicht funktionstüchtig
		//while (ersterrechtsklick == 1){
		if (entity.inventory.hasItem(Mistborn.kupfer) == true){

			world.getClosestPlayerToEntity(entity, 1000).addPotionEffect(new PotionEffect(Potion.blindness.id, 1200, 3));
			if(!entity.capabilities.isCreativeMode){
				--stack.stackSize;
			}
		}
		else {if (entity.inventory.hasItem(Mistborn.kupfer) == false ){
			ersterrechtsklick = 0;
		}
			
		}
		//}
		
		return super.onItemRightClick(stack, world, entity);
	}
	
}
