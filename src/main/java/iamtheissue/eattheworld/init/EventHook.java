package iamtheissue.eattheworld.init;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import iamtheissue.eattheworld.config.AlteredDrops;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHook
{
	private void addToDrops(LivingDropsEvent event, Item item, int amount, int meta)
	{
		event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(item, amount, meta)));
	}
	private void addDrop(LivingDropsEvent event, Item item, int min, int max)
	{
		addDrop(event, item, min, max, 0);
	}
	private void addDrop(LivingDropsEvent event, Item item, int min, int max, int meta)
	{
		addDrop(event, item, min, max, meta, false);
	}
	private void addDrop(LivingDropsEvent event, Item item, int min, int max, boolean increasedByLooting)
	{
		addDrop(event, item, min, max, 0, increasedByLooting);
	}
	private void addDrop(LivingDropsEvent event, Item item, int min, int max, int meta, boolean increasedByLooting)
	{
		Random r = new Random();
		int lootingIncrease = increasedByLooting ? event.lootingLevel : 0;
		int amount = r.nextInt(1 + max - min + lootingIncrease) + min;
		addDrop(event, item, amount, meta);
	}
	
	private void removeDrop(LivingDropsEvent event, Item item)
	{
		List<EntityItem> list = new ArrayList<EntityItem>();
		for (Object drop : event.drops)
		{
			if(((EntityItem) drop).getEntityItem().getUnlocalizedName() == item.getUnlocalizedName())
			{
				list.add((EntityItem) drop);
			}
		}
		for (Object drop : list)
		{
			event.drops.remove(drop);
		}
	}
	
	@SubscribeEvent
	public void entityDies(LivingDropsEvent event)
	{
		// Steam Engines Mod integration would allow their own version of fat to be dropped
		if(AlteredDrops.bat && event.entity instanceof EntityBat)
		{
			if(event.entity.isBurning())
			{
				addDrop(event, Items.cooked_bat, 0, 1);
			}
			else
			{
				addDrop(event, Items.raw_bat, 0, 1);
			}
			addDrop(event, Items.bat_hide, 0, 1, true);
			addDrop(event, Items.small_bone, 0, 1, true);
		}
		else if(AlteredDrops.chicken && event.entity instanceof EntityChicken)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				removeDrop(event, net.minecraft.init.Items.feather);
				addDrop(event, net.minecraft.init.Items.feather, 2, 5, true);
				addDrop(event, Items.chicken_skin, 0, 1);
				addDrop(event, Items.fat, 0, 1, true);
				addDrop(event, Items.small_bone, 0, 2, true);
			}
		}
		else if(AlteredDrops.mooshroom && event.entity instanceof EntityMooshroom)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				removeDrop(event, net.minecraft.init.Items.leather);
				addDrop(event, Items.mooshroom_hide, 0, 1);
				addDrop(event, Items.fat, 0, 3, true);
				addDrop(event, net.minecraft.init.Items.bone, 0, 3, true);
			}
		}
		else if(AlteredDrops.cow && event.entity instanceof EntityCow)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				removeDrop(event, net.minecraft.init.Items.leather);
				addDrop(event, Items.cow_hide, 0, 1);
				addDrop(event, Items.fat, 0, 3, true);
				addDrop(event, net.minecraft.init.Items.bone, 0, 3, true);
			}
		}
		else if(AlteredDrops.ghast && event.entity instanceof EntityGhast)
		{
			addDrop(event, Items.ghast_skin, 0, 8, true);
			addDrop(event, Items.raw_ghast_meat, 0, 6, true);
		}
		else if(AlteredDrops.horse && event.entity instanceof EntityHorse)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				removeDrop(event, net.minecraft.init.Items.leather);
				if(event.entity.isBurning())
				{
					addDrop(event, Items.cooked_horse_meat, 0, 3, true);
				}
				else
				{
					addDrop(event, Items.raw_horse_meat, 0, 3, true);
				}
				addDrop(event, Items.horse_hide, 0, 1);
				addDrop(event, Items.fat, 0, 3, true);
				addDrop(event, Items.horse_hair, 0, 2, true);
				addDrop(event, net.minecraft.init.Items.bone, 0, 3, true);
			}
		}
		else if(AlteredDrops.villager && event.entity instanceof EntityVillager)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, Items.cooked_human_meat, 0, 2, true);
				}
				else
				{
					addDrop(event, Items.raw_human_meat, 0, 2, true);
				}
				addDrop(event, Items.human_skin, 0, 1);
				addDrop(event, Items.fat, 0, 2, true);
				addDrop(event, net.minecraft.init.Items.bone, 0, 2, true);
			}
		}
		else if(AlteredDrops.ocelot && event.entity instanceof EntityOcelot)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, Items.cooked_ocelot_meat, 0, 1);
				}
				else
				{
					addDrop(event, Items.raw_ocelot_meat, 0, 1);
				}
				addDrop(event, Items.fat, 0, 1, true);
				addDrop(event, Items.small_bone, 0, 2, true);
				switch(((EntityOcelot)event.entity).getTameSkin())
				{
					case 0:
					{
						if(AlteredDrops.ocelot)
							addDrop(event, Items.ocelot_hide, 0, 1);
						break;
					}
					case 1:
					{
						if(AlteredDrops.tamedOcelot)
							addDrop(event, Items.tuxedo_cat_hide, 0, 1);
						break;
					}
					case 2:
					{
						if(AlteredDrops.tamedOcelot)
							addDrop(event, Items.tabby_cat_hide, 0, 1);
						break;
					}
					case 3:
					{
						if(AlteredDrops.tamedOcelot)
							addDrop(event, Items.siamese_cat_hide, 0, 1);
						break;
					}
				}
				
			}
		}
		else if(AlteredDrops.pig && event.entity instanceof EntityPig)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				addDrop(event, Items.pig_skin, 0, 1);
				addDrop(event, Items.fat, 0, 5, true);
				addDrop(event, net.minecraft.init.Items.bone, 0, 2, true);
			}
		}
		else if(AlteredDrops.sheep && event.entity instanceof EntitySheep)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				addDrop(event, Items.sheep_hide, 0, 1);
				addDrop(event, Items.fat, 0, 2, true);
				addDrop(event, net.minecraft.init.Items.bone, 0, 2, true);
			}
		}
		else if(AlteredDrops.silverfish && event.entity instanceof EntitySilverfish)
		{
			if(event.entity.isBurning())
			{
				addDrop(event, Items.cooked_silverfish, 0, 1);
			}
			else
			{
				addDrop(event, Items.raw_silverfish, 0, 1);
			}
		}
		else if(AlteredDrops.spider && event.entity instanceof EntitySpider)
		{
			removeDrop(event, net.minecraft.init.Items.spider_eye);
			if(event.entity.isBurning())
			{
				addDrop(event, Items.cooked_spider_eye, 0, 5, true);
				addDrop(event, Items.cooked_spider_leg, 0, 5, true);
			}
			else
			{
				addDrop(event, net.minecraft.init.Items.spider_eye, 0, 5, true);
				addDrop(event, Items.raw_spider_leg, 0, 5, true);
			}
		}
		else if(AlteredDrops.squid && event.entity instanceof EntitySquid)
		{
			if(event.entity.isBurning())
			{
				addDrop(event, Items.cooked_squid_meat, 0, 5, true);
			}
			else
			{
				addDrop(event, Items.raw_squid_meat, 0, 5, true);
			}
		}
		else if(AlteredDrops.wolf && event.entity instanceof EntityWolf)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, Items.cooked_wolf_meat, 0, 2);
				}
				else
				{
					addDrop(event, Items.raw_wolf_meat, 0, 2);
				}
				addDrop(event, Items.wolf_hide, 0, 1);
				addDrop(event, Items.fat, 0, 2, true);
				addDrop(event, net.minecraft.init.Items.bone, 0, 2, true);
			}
		}
		else if(AlteredDrops.zombie && event.entity instanceof EntityZombie)
		{
			if(!((EntityZombie)event.entity).isChild())
			{
				addDrop(event, net.minecraft.init.Items.bone, 0, 2, true);
			}
			else
			{
				addDrop(event, Items.small_bone, 0, 2, true);
			}
		}
		else if(AlteredDrops.ironGolem && event.entity instanceof EntityIronGolem)
		{
			addDrop(event, Item.getItemFromBlock(net.minecraft.init.Blocks.iron_block), 0, 2);
			addDrop(event, net.minecraft.init.Items.iron_ingot, 0, 5, true);
			// Thaumcraft integration would allow it to drop iron nuggets
			addDrop(event, Items.heart_of_gold, 1, 1);
		}
		else if(AlteredDrops.snowGolem && event.entity instanceof EntityGolem)
		{
			addDrop(event, Items.frozen_heart, 0, 1);
		}
		else if(AlteredDrops.rabbit && event.entity instanceof EntityRabbit)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				addDrop(event, Items.fat, 0, 1);
				addDrop(event, Items.small_bone, 0, 2, true);
			}
		}
		else if(event.entity instanceof EntitySkeleton)
		{
			
		}
		else if(AlteredDrops.pigZombie && event.entity instanceof EntityPigZombie)
		{
			event.drops.clear();
			if(!((EntityPigZombie)event.entity).isChild())
			{
				addDrop(event, Items.fat, 0, 3, true);
				addDrop(event, net.minecraft.init.Items.bone, 0, 2, true);
			}
			else
			{
				addDrop(event, Items.fat, 0, 1, true);
				addDrop(event, Items.small_bone, 0, 2, true);
			}
		}
		else if(AlteredDrops.blaze && event.entity instanceof EntityBlaze)
		{
			// Tinker's Construct integration would allow them to drop their head
		}
		else if(AlteredDrops.magmaCube && event.entity instanceof EntityMagmaCube)
		{
			// Doesn't do shit
		}
		else if(AlteredDrops.slime && event.entity instanceof EntitySlime)
		{
			// This doesn't do shit either
		}
		else if(AlteredDrops.witch && event.entity instanceof EntityWitch)
		{
			if(event.entity.isBurning())
			{
				addDrop(event, Items.cooked_human_meat, 0, 2, true);
			}
			else
			{
				addDrop(event, Items.raw_human_meat, 0, 2, true);
			}
			addDrop(event, Items.human_skin, 0, 1);
			addDrop(event, Items.fat, 0, 2, true);
			addDrop(event, net.minecraft.init.Items.bone, 0, 2, true);
		}
		else if(AlteredDrops.enderman && event.entity instanceof EntityEnderman)
		{
			
		}
		else if(AlteredDrops.creeper && event.entity instanceof EntityCreeper)
		{
			
		}
		else if(AlteredDrops.enderDragon && event.entity instanceof EntityDragon)
		{
			// Drops nothing special. How boring. Pls fix.
		}
		else if(AlteredDrops.wither && event.entity instanceof EntityWither)
		{
			// Should drop some more stuff. I mean, it is a boss!
		}
		return;
	}
	
	
	
}
