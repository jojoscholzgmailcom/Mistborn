package com.mistborn.main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	public static void Mistborn(){
		addCraftingRecipes();
	}
	public static void addCraftingRecipes(){
		GameRegistry.addShapedRecipe(new ItemStack(Mistborn.glasdolch), "   "," g "," s ",'g', Blocks.glass,'s', Items.stick );
		GameRegistry.addShapedRecipe(new ItemStack(Mistborn.obsidiandolch), "   "," o "," s ",'o', Blocks.obsidian,'s', Items.stick );
	}
}
