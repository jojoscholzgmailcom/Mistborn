package com.mistborn.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabUMetall extends CreativeTabs {
public CreativeTabUMetall(int a, String b){
		
		super(a,b);
	}
	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Mistborn.uragonium;
	}

}
