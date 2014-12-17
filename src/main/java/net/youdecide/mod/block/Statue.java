package net.youdecide.mod.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.youdecide.mod.Youdecide;
import net.youdecide.mod.tileentity.TileEntityEmptyBucket;
import net.youdecide.mod.tileentity.TileEntityStatue;
import net.youdecide.mod.tileentity.TileEntityWaterBucket;

public class Statue extends BlockContainer {
	
	

	public Statue(Material material) {
		super(material);
		
		
		
		this.setCreativeTab(Youdecide.YDTab);
		
		this.setBlockBounds(0F, 0F, 0F, 1F, 2F, 1F);
		
		
	
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
		return new TileEntityStatue();
	}	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Youdecide.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
		float x1 = (float)x + random.nextFloat() + 0.1F;
		float y1 = (float)y + random.nextFloat() + 1.5F;
		float z1 = (float)z + random.nextFloat() + 0.1F;
		float f = 0.52F;
		float f1 = random.nextFloat() * 0.6F - 0.3F;
		
		
		world.spawnParticle("fireworksSpark", (double)(x1), (double)(y1), (double)(z1), 0D, 0D, 0D);
		//world.spawnParticle("heart", (double)(x1), (double)(y1), (double)(z1), 0D, 0D, 0D);
	
	}

}