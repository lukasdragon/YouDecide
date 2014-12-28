package net.youdecide.mod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.youdecide.mod.Youdecide;
import cpw.mods.fml.common.registry.GameRegistry;

public class YDBlock extends Block{
String unlocalname;
public YDBlock (String name, Material material, int harvestLevel) {
super(material);
unlocalname = name;
setBlockName(name);
GameRegistry.registerBlock(this, name);
if (name.toLowerCase().contains("ore")) {
this.setBlockTextureName(Youdecide.MODID + ":ores/" + name);
} else {
this.setBlockTextureName(Youdecide.MODID + ":" + name);
}
}

/*public Item getItemDropped(int par1, Random rand, int par3) {
if (this == MythicalBlocks.blockRubyOre) {
return MythicalIngot.itemRuby;
}
else if(this == MythicalBlocks.crackedStone) {
return Item.getItemFromBlock(Blocks.cobblestone);
}
else return Item.getItemFromBlock(this);
}*/
}