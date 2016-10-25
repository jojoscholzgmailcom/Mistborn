package com.mistborn.items;

import com.mistborn.main.Mistborn;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class bronze extends Item{
	public bronze(int id){
		super();
	}
	int ersterrechtsklick = 1;
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer entity) {
		//Achtung nicht funktionstüchtig mit while
		//while (ersterrechtsklick == 1){
		if (entity.inventory.hasItem(Mistborn.bronze) == true){
			world.getClosestVulnerablePlayerToEntity(entity, 100).addPotionEffect(new PotionEffect (Potion.weakness.id, 3600, 3));
			//entity.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, 3));
			if(!entity.capabilities.isCreativeMode){
				--stack.stackSize;
			}
		}
		else {if (entity.inventory.hasItem(Mistborn.zinn) == false ){
			ersterrechtsklick = 0;
		}
			
		}
		//}
		
		return super.onItemRightClick(stack, world, entity);
	}
	
}
