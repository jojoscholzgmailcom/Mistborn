package com.mistborn.tabs;

import com.mistborn.main.Mistborn;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEssen extends CreativeTabs {
public CreativeTabEssen(int a, String b){
		
		super(a,b);
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Mistborn.brei;
	}

}
