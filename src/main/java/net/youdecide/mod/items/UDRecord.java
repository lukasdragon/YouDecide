package net.youdecide.mod.items;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.youdecide.mod.Youdecide;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class UDRecord extends ItemRecord
{
public final String title;
public UDRecord(String name, String title)
{
super(name.toLowerCase().replace("disc", ""));
setUnlocalizedName(name);
setTextureName(Youdecide.MODID + ":" + name);
GameRegistry.registerItem(this, name);
setCreativeTab(Youdecide.YDTab);
this.title=title;
}
@Override
@SideOnly(Side.CLIENT)
public String getRecordNameLocal()
{
return title;
}
@Override
@SideOnly(Side.CLIENT)
public ResourceLocation getRecordResource(String name)
{
return new ResourceLocation(Youdecide.MODID, name.substring(8));
}
}