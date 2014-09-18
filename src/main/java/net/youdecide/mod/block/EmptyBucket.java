package net.youdecide.mod.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.youdecide.mod.Youdecide;
import net.youdecide.mod.tileentity.TileEntityEmptyBucket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EmptyBucket extends BlockContainer {

	public EmptyBucket(Material material) {
		super(material);
		
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		
		this.setCreativeTab(Youdecide.YDTab);
		
		 float f = 0.375F;
	        float f1 = f / 2.0F;
		this.setBlockBounds(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f, 0.5F + f1);
	}

	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityEmptyBucket();
	}
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Youdecide.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
