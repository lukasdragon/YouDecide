package net.youdecide.mod.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.youdecide.mod.Youdecide;
import net.youdecide.mod.renderer.ItemRenderBucket;
import net.youdecide.mod.renderer.RenderEmptyBucket;
import net.youdecide.mod.renderer.RenderLavaBucket;
import net.youdecide.mod.renderer.RenderMilkBucket;
import net.youdecide.mod.renderer.RenderWaterBucket;
import net.youdecide.mod.tileentity.TileEntityEmptyBucket;
import net.youdecide.mod.tileentity.TileEntityLavaBucket;
import net.youdecide.mod.tileentity.TileEntityMilkBucket;
import net.youdecide.mod.tileentity.TileEntityWaterBucket;


public class ClientProxy extends CommonProxy {

	public void registerRenderThings() {
		
		//Bucket
		TileEntitySpecialRenderer render = new RenderEmptyBucket();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEmptyBucket.class, render);
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Youdecide.blockEmptyBucket), new ItemRenderBucket(render, new TileEntityEmptyBucket()));
		
		TileEntitySpecialRenderer render2 = new RenderWaterBucket();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWaterBucket.class, render2);
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Youdecide.blockWaterBucket), new ItemRenderBucket(render, new TileEntityWaterBucket()));
		
		TileEntitySpecialRenderer render3 = new RenderLavaBucket();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLavaBucket.class, render3);
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Youdecide.blockLavaBucket), new ItemRenderBucket(render, new TileEntityLavaBucket()));
		
		TileEntitySpecialRenderer render4 = new RenderMilkBucket();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMilkBucket.class, render4);
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Youdecide.blockMilkBucket), new ItemRenderBucket(render, new TileEntityMilkBucket()));
		
		
		
	}
	
	public void registerTileEntitySpecialRenderer() {
		
	}
}