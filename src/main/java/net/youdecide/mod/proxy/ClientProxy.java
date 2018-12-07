package net.youdecide.mod.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.youdecide.mod.Youdecide;
import net.youdecide.mod.renderer.ItemRender3D;
import net.youdecide.mod.renderer.RenderEmptyBucket;
import net.youdecide.mod.renderer.RenderLavaBucket;
import net.youdecide.mod.renderer.RenderMilkBucket;
import net.youdecide.mod.renderer.RenderStatue;
import net.youdecide.mod.renderer.RenderWaterBucket;
import net.youdecide.mod.tileentity.TileEntityEmptyBucket;
import net.youdecide.mod.tileentity.TileEntityLavaBucket;
import net.youdecide.mod.tileentity.TileEntityMilkBucket;
import net.youdecide.mod.tileentity.TileEntityStatue;
import net.youdecide.mod.tileentity.TileEntityWaterBucket;
import com.jadarstudios.developercapes.DevCapes;


public class ClientProxy extends CommonProxy {

	public void registerRenderThings() {
		
		//Bucket
		TileEntitySpecialRenderer render = new RenderEmptyBucket();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEmptyBucket.class, render);
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Youdecide.blockEmptyBucket), new ItemRender3D(render, new TileEntityEmptyBucket()));
		
		TileEntitySpecialRenderer render2 = new RenderWaterBucket();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWaterBucket.class, render2);
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Youdecide.blockWaterBucket), new ItemRender3D(render, new TileEntityWaterBucket()));
		
		TileEntitySpecialRenderer render3 = new RenderLavaBucket();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLavaBucket.class, render3);
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Youdecide.blockLavaBucket), new ItemRender3D(render, new TileEntityLavaBucket()));
		
		TileEntitySpecialRenderer render4 = new RenderMilkBucket();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMilkBucket.class, render4);
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Youdecide.blockMilkBucket), new ItemRender3D(render, new TileEntityMilkBucket()));
		
		TileEntitySpecialRenderer render5 = new RenderStatue();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStatue.class, render5);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Youdecide.blockStatue), new ItemRender3D(new RenderStatue(), new TileEntityStatue()));
		
		DevCapes.getInstance().registerConfig("https://cdn.jsdelivr.net/gh/lukasdragon/YouDecide/capes/capes.json", "A32D");
	}
	
	public void registerTileEntitySpecialRenderer() {
		
	}
}