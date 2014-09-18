package net.youdecide.mod.handler;

import net.youdecide.mod.Youdecide;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
    
	public int getBurnTime(ItemStack fuel) {
		
		if(fuel.getItem() == Youdecide.itemTreePitch) return 800;
		return 0;
	}

}


