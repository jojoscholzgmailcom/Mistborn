package com.mistborn.tabs;

import com.mistborn.main.Mistborn;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabWirtschaft extends CreativeTabs {
public CreativeTabWirtschaft(int a, String b){
		
		super(a,b);
	}
	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Mistborn.kastling;
	}

}
