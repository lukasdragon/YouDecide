package net.youdecide.mod;

import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import net.youdecide.mod.block.EmptyBucket;
import net.youdecide.mod.block.LavaBucket;
import net.youdecide.mod.block.MilkBucket;
import net.youdecide.mod.block.Statue;
import net.youdecide.mod.block.WaterBucket;
import net.youdecide.mod.commands.EnderChestCommand;
import net.youdecide.mod.commands.HealCommand;
import net.youdecide.mod.crafting.RecipeRemover;
import net.youdecide.mod.handler.FuelHandler;
import net.youdecide.mod.items.UDItem;
import net.youdecide.mod.items.UDItem;
import net.youdecide.mod.proxy.CommonProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(name = "UDecide", modid = Youdecide.MODID, version = Youdecide.VERSION)
public class Youdecide
{
    public static final String MODID = "youdecide";
    public static final String VERSION = "1.1.1";
    
    
    
    
    
    
    
    public static CreativeTabs YDTab;
    
    
    
    @Instance(MODID)
    public static Youdecide instance;
    

    
    
    
    //items
    public static Item itemtestitem;
    public static Item itemBreadDough;
    
   
    
    
  
    
    //Blocks
    public static Block blockEmptyBucket;
    public static Block blockWaterBucket;
    public static Block blockLavaBucket;
    public static Block blockMilkBucket;
    
    public static Block blockStatue;
   
    
    
   
    
    //Fuels
    public static Item itemTreePitch;
    

    
   
    
   
    
    @SidedProxy(clientSide = "net.youdecide.mod.proxy.ClientProxy", serverSide = "net.youdecide.mod.proxy.CommonProxy")
    public static CommonProxy Proxy;
    
    
    
    
    @EventHandler
    public void PreInit(FMLPreInitializationEvent PreEvent){
    
    	
    	
    	
    	YDTab = new CreativeTabs("You Decide") {
    		@SideOnly(Side.CLIENT)
    		 		public Item getTabIconItem() {
    			return Item.getItemFromBlock(Blocks.tnt);
    		}
    		
    		
    	};     	
    	
    	//Items
    	
    	
    	
    	itemTreePitch = new UDItem("TreePitch", null);   	
    	itemtestitem = new UDItem("testitem", null);
    	itemBreadDough = new UDItem("BreadDough", "Bread Dough!");
    	
    	
      	

    	//Blocks
    	blockEmptyBucket = new EmptyBucket(Material.iron).setBlockName("EmptyBucket").setBlockTextureName("EmptyBucket");
    	blockWaterBucket = new WaterBucket(Material.iron).setBlockName("WaterBucket").setBlockTextureName("WaterBucket");
    	blockLavaBucket = new LavaBucket(Material.iron).setBlockName("LavaBucket").setBlockTextureName("LavaBucket");
    	blockMilkBucket = new MilkBucket(Material.iron).setBlockName("MilkBucket").setBlockTextureName("MilkBucket");
    	blockStatue = new Statue(Material.rock).setBlockName("Statue").setBlockTextureName("Statue");	
    	
    	
    	
    	
    //Registry
    	GameRegistry.registerBlock(blockEmptyBucket, "EmptyBucket");
    	GameRegistry.registerBlock(blockWaterBucket, "WaterBucket");
    	GameRegistry.registerBlock(blockLavaBucket, "LavaBucket");
    	GameRegistry.registerBlock(blockMilkBucket, "MilkBucket");
    	
    	GameRegistry.registerBlock(blockStatue, "Statue");
    	
    	//Renders
    	Proxy.registerRenderThings();
    }
    
    
    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
    event.registerServerCommand(new EnderChestCommand());
    event.registerServerCommand(new HealCommand());
    }
    
    @EventHandler
    public void Init(FMLInitializationEvent event){
    	
    	
    	//Recipes
    	RecipeRemover.removeRecipe();
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(itemBreadDough, 2), new Object[]
    			{Items.wheat, Items.wheat, Items.wheat, Items.water_bucket});
    	
    	
    	//Smelting
    	GameRegistry.addSmelting(itemBreadDough, new ItemStack(Items.bread), 0);
    	
    	
    	    	    	    	
    	    	
    	
    	
    	//Registry
    	//FMLCommonHandler.instance().bus().register(new CraftingHandler());
    	GameRegistry.registerFuelHandler(new FuelHandler());
    	
    	
    	
    	//Event Handler
    	//MinecraftForge.EVENT_BUS.register(new YDEventHandler());
    	
    	
    	
    	
    }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent postEvent){   	
    	
    	
    	
    	
    	    }
    
    }
    


