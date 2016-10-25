package com.mistborn.items;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class holzstab extends ItemSword{
	public holzstab(Item.ToolMaterial mat){
		super(mat);
	}
	int holzstab = 0;
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Angriff ist die beste Verteidigung"));
		
		
		return super.onItemRightClick(stack, world, player);
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
		
		
		
		super.addInformation(stack, player, list, b);
	}
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Hallo ich heiße Marvin, und ich bin sehr froh das wir nun eine längere Zeit zusammen kämpfen werden."));
		super.onCreated(stack, world, player);
	}
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if(holzstab == 0){
		player.addChatComponentMessage(new ChatComponentText("Guten Tag, wie geht es dir heute?"));
		 holzstab = 1;
		}else{
			if(holzstab == 1){
				player.addChatComponentMessage(new ChatComponentText("Wow, ein grandioser Schlag!"));
				 holzstab = 2;
				}else{
					if(holzstab == 2){
						player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Ist das dein Ernst?"));
						 holzstab = 3;
						}else{
							if(holzstab == 3){
								player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Aua, das tut weh!"));
								 holzstab = 4;
								}else{
									if(holzstab == 4){
										player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Hörst du bitte auf mich für DAS zu beschädigen."));
										 holzstab = 5;
										}else{
											if(holzstab == 5){
												player.addChatComponentMessage(new ChatComponentText("Schau mal über dir, ich glaube da fliegt ein toter Vogel."));
												 holzstab = 7;
												}else{
													if(holzstab == 7){
														player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Lass dass!!!"));
														 holzstab = 8;
														}else{
															if(holzstab == 8){
																player.addChatComponentMessage(new ChatComponentText("Leg dich mal mit Gegnern in deiner Größe an!!"));
																 holzstab = 9;
																}else{
																	if(holzstab == 9){
																		player.addChatComponentMessage(new ChatComponentText("Du hast nichtmal dein ganzes Inventar voller Nethersterne."));
																		 holzstab = 10;
																		}else{
																			if(holzstab == 10){
																				player.addChatComponentMessage(new ChatComponentText("Schau nicht so doof!"));
																				 holzstab = 11;
																				}else{
																					if(holzstab == 11){
																						player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Was sollte DAS schon wieder?"));
																						 holzstab = 12;
																						}else{
																							if(holzstab == 12){
																								player.addChatComponentMessage(new ChatComponentText("Womit habe ich dich nur verdient?"));
																								 holzstab = 13;
																								}else{
																									if(holzstab == 13){
																										player.addChatComponentMessage(new ChatComponentText("Hast du Diamanten, ich habe einen Mordskohldampf"));
																										 holzstab = 14;
																										}else{
																											if(holzstab == 14){
																												player.addChatComponentMessage(new ChatComponentText("..."));
																												 holzstab = 15;
																												}else{
																													if(holzstab == 15){
																														player.addChatComponentMessage(new ChatComponentText("Los nur Mut du schaffst es"));
																														 holzstab = 16;
																														}else{
																															if(holzstab == 16){
																																player.addChatComponentMessage(new ChatComponentText("NICHT!!!"));
																																 holzstab = 17;
																																}else{
																																	if(holzstab == 17){
																																		player.addChatComponentMessage(new ChatComponentText("Wusstest du ,dass ich schlauer bin als du?"));
																																		 holzstab = 18;
																																		}else{
																																			if(holzstab == 18){
																																				player.addChatComponentMessage(new ChatComponentText("Ich *hicks* hab*hicks*e Schluck*hicks*auf"));
																																				 holzstab = 19;
																																				}else{
																																					if(holzstab == 19){
																																						player.addChatComponentMessage(new ChatComponentText("Gleich hast du es geschafft!"));
																																						 holzstab = 20;
																																						}else{
																																							if(holzstab == 20){
																																								player.addChatComponentMessage(new ChatComponentText("Ähhmmmmmmmm"));
																																								 holzstab = 0;
																																								}else{
																																									
																																								}
																																						}
																																				}	
																																		}
																																}
																														}
																												}
																										}
																								}
																						}
																				}
																		}
																}
														}
												}
										}
								}
						}
				}
		}
		return super.onLeftClickEntity(stack, player, entity);
	}
}
