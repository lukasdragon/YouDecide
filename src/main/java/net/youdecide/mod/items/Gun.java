package net.youdecide.mod.items;//based on master condiguration

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.youdecide.mod.Youdecide;

public class Gun {

public Gun(){}

public static Item block;
public static Object instance;

public void load(){

}

static{
block = (new ItemgGUN());
Item.itemRegistry.addObject(426, "gun", block);
}

static class ItemgGUN extends Item{

public ItemgGUN(){
super();
setMaxDamage(100);
maxStackSize = 1;
setFull3D();
setUnlocalizedName("gun");
setTextureName("bow_standby");
setCreativeTab(Youdecide.YDTab);
}

public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }

   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, final EntityPlayer par3EntityPlayer){

        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (flag || par3EntityPlayer.inventory.hasItem(Youdecide.itemBullet))
        {
            float f = 2.0F;

            EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, f * 2.0F)
            {

				public void onCollideWithPlayer(EntityPlayer entity){
					super.onCollideWithPlayer(entity);
					int i = MathHelper.floor_double(this.boundingBox.minX + 0.001D);
					int j = MathHelper.floor_double(this.boundingBox.minY + 0.001D);
					int k = MathHelper.floor_double(this.boundingBox.minZ + 0.001D);
					World world = this.worldObj;
					
if(true){
EntityArrow entityarrow = new EntityArrow(world, (EntityLivingBase)entity, 3 * 2.0F);
entityarrow.setDamage(3*2.0F);
entityarrow.setKnockbackStrength(1);
world.playSoundAtEntity(entity, "random.bow", 1.0F, 1.0F / (0.5F * 0.4F + 1.2F) + 3 * 0.5F);
if (!world.isRemote) world.spawnEntityInWorld(entityarrow);
}

if(true){
world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
}

if(true){
if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(Youdecide.itemBullet, 1));
}

				}

            	public void onUpdate(){
				     super.onUpdate();
				     int i = MathHelper.floor_double(this.boundingBox.minX + 0.001D);
				     int j = MathHelper.floor_double(this.boundingBox.minY + 0.001D);
				     int k = MathHelper.floor_double(this.boundingBox.minZ + 0.001D);
				     World world = this.worldObj;
				     Entity entity = (Entity)par3EntityPlayer;
				     
if(true){
world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
}

				     if (this.worldObj.getBlock(i, j, k) != Blocks.air || this.worldObj.getBlock(i, j-1, k) != Blocks.air ||
				     this.worldObj.getBlock(i, j+1, k) != Blocks.air ||
				     this.worldObj.getBlock(i+1, j, k) != Blocks.air || this.worldObj.getBlock(i-1, j, k) != Blocks.air
				     || this.worldObj.getBlock(i, j, k+1) != Blocks.air || this.worldObj.getBlock(i, j, k-1) != Blocks.air){
				       	

				    	 
				    	 if(true){
world.createExplosion((Entity)null, i, j, k, 4F, true);
}

if(true){
world.setBlock(i, j, k, Blocks.tnt, 0, 2);
}

if(true){
world.createExplosion((Entity)null, i, j, k, 0.1F, true);
}

				       	this.kill();
				     }

            	}

            	};

                entityarrow.setIsCritical(true);
                entityarrow.setDamage(10.0);
                entityarrow.setKnockbackStrength(5);

                if(true){
                	entityarrow.setFire(100);
				}

            	par1ItemStack.damageItem(1, par3EntityPlayer);
            	par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (flag)
            {
                entityarrow.canBePickedUp = 2;
            }
            else
            {
                par3EntityPlayer.inventory.consumeInventoryItem(Youdecide.itemBullet);
            }

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(entityarrow);
            }
            World world = par2World;
            EntityPlayer entity = par3EntityPlayer;
			int i = (int)entity.posX;
			int j = (int)entity.posY;
			int k = (int)entity.posZ;
            
if(true){
entity.addPotionEffect(new PotionEffect(11, 4, 5));
entity.addPotionEffect(new PotionEffect(6, 2, 3));
}

        }

        return par1ItemStack;
    }



    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }

    public void onCreated(ItemStack itemstack, World world, EntityPlayer entity){
    	float var4 = 1.0F;
    	int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
    	int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
    	int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);


    	if(true){
    	if(entity instanceof EntityPlayer)((EntityPlayer)entity).addStat(Youdecide.AchievementSecret, 1);
    	}

    	if(true){
    	world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
    	}

}

}
}
