package com.mistborn.items;

import com.mistborn.main.Mistborn;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class zink extends Item{
	public zink(int id){
		super();
	}
	int ersterrechtsklick = 1;
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer entity) {
		//Achtung nicht funktionst�chtig
		//while (ersterrechtsklick == 1){
		//if (entity.inventory.hasItem(Mistborn.zink) == true){
			entity.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 12000, 3));
			if(!entity.capabilities.isCreativeMode){
				--stack.stackSize;
			}
		//}
		//else {if (entity.inventory.hasItem(Mistborn.stahl) == false ){
			ersterrechtsklick = 0;
		//}
			
		//}
		//}
		
		return super.onItemRightClick(stack, world, entity);
	}
	
}