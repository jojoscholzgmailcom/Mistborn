package com.mistborn.tabs;

import com.mistborn.main.Mistborn;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMetall extends CreativeTabs {
	public CreativeTabMetall(int a, String b){
		
		super(a,b);
	}

	@Override
	public Item getTabIconItem() {
		
		return Mistborn.atium;
	}

}
