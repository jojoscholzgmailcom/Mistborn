package com.mistborn.items;

import com.mistborn.main.Mistborn;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class uweisblech extends Item {
	public uweisblech(int id){
		super();
	}
	//int ersterrechtsklick = 1;
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer entity) {
		//Achtung nicht funktionstüchtig
		//while (ersterrechtsklick == 1){
		//if (entity.inventory.hasItem(Mistborn.uweisblech) == true){
			entity.addPotionEffect(new PotionEffect(Potion.blindness.id, 1200, 3));
			entity.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 240, 2));
			if(!entity.capabilities.isCreativeMode){
				--stack.stackSize;
			}
			
		//}
		//else {if (entity.inventory.hasItem(Mistborn.weisblech) == false ){
					//ersterrechtsklick = 0;
				//}
			
			//}
		//}
		return super.onItemRightClick(stack, world, entity);
	}
}
