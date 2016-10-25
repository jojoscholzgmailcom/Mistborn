package com.mistborn.items;

import com.mistborn.main.Mistborn;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class uucadmium extends Item{
	public uucadmium(int id){
		super();
	}
	int ersterrechtsklick = 1;
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer entity) {
		//Achtung nicht funktionstüchtig
		//while (ersterrechtsklick == 1){
		//if (entity.inventory.hasItem(Mistborn.cadmium) == true){
			entity.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 31000, 5));
			if(!entity.capabilities.isCreativeMode){
				--stack.stackSize;
			}
		/*}
		else {if (entity.inventory.hasItem(Mistborn.stahl) == false ){
			ersterrechtsklick = 0;
		}
			
		}*/
		//}
		
		return super.onItemRightClick(stack, world, entity);
	}
	
}
