package net.youdecide.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.youdecide.mod.Youdecide;

public class UDItem extends Item{
	
	
	public UDItem() {
							
				this.setCreativeTab(Youdecide.YDTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Youdecide.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	
	
}
