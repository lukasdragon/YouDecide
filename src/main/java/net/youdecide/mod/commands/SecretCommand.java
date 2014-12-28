package net.youdecide.mod.commands;//based on master condiguration

import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.youdecide.mod.Youdecide;

public class SecretCommand implements ICommand{
	
	public int getRequiredPermissionLevel()
	{
	return 2;
	}

	@Override
	public int compareTo(Object o) {
		return -1;
	}

	@Override
	public String getCommandName() {
		return "secret";
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return "/secret secret";
	}

	@Override
	public List getCommandAliases() {
		return null;
	}

	@Override
	public void processCommand(ICommandSender var1, String[] cmd){
		int i = var1.getPlayerCoordinates().posX;
		int j = var1.getPlayerCoordinates().posY;
		int k = var1.getPlayerCoordinates().posZ;
		EntityPlayer entity = (EntityPlayer)var1;


		World world = null;
		WorldServer[] list = MinecraftServer.getServer().worldServers;
		for(WorldServer ins : list){
			if(ins.provider.dimensionId==entity.worldObj.provider.dimensionId)
				world = ins;
		}
		if(world==null)
			world = list[0];


		
	if(true){
	if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(Youdecide.itemBullet, 1));}
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_) {
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
		return true;
	}

}