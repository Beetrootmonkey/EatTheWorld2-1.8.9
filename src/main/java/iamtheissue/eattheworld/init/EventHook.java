package iamtheissue.eattheworld.init;

import java.util.Random;

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
	private void addDrop(LivingDropsEvent event, Item item, int amount, int meta)
	{
		event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(item, amount, meta)));
	}
	private void addDrop(LivingDropsEvent event, Item item, int amount, float chance)
	{
		addDrop(event, item, amount, chance, 0);
	}
	private void addDrop(LivingDropsEvent event, Item item, int amount, float chance, int meta)
	{
		float chance2 = event.entity.isBurning() ? chance * 0.5f : chance;
		Random r = new Random();
		int actualAmount = 0;
		float extendedChance = chance2;
		for(int i = 0; i < event.lootingLevel; i++)
		{
			extendedChance += chance2 * (1 - extendedChance);
		}
		for(int i = 0; i < amount; i++)
		{
			if(r.nextFloat() <= extendedChance)
			{
				actualAmount++;
			}
		}
		if(!event.entity.isBurning() && actualAmount == 0 && amount > 1)
		{
			actualAmount = 1;
		}
		addDrop(event, item, actualAmount, meta);
	}
	private void dropExp(LivingDropsEvent event, float min, float max)
	{
		//.add(new EntityXPOrb(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, 1));
	}
	
	@SubscribeEvent
	public void entityDies(LivingDropsEvent event)
	{
		// Steam Engines Mod integration would allow their own version of fat to be dropped
		if(event.entity instanceof EntityBat)
		{
			if(event.entity.isBurning())
			{
				addDrop(event, Items.cooked_bat, 1, 0.9f);
			}
			else
			{
				addDrop(event, Items.raw_bat, 1, 0.9f);
			}
			addDrop(event, Items.bat_hide, 1, 0.9f);
			addDrop(event, Items.fat, 1, 0.5f);
			addDrop(event, Items.small_bone, 2, 0.4f);
		}
		else if(event.entity instanceof EntityChicken)
		{
			event.drops.clear();
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, net.minecraft.init.Items.cooked_chicken, 1, 0.9f);
				}
				else
				{
					addDrop(event, net.minecraft.init.Items.chicken, 1, 0.9f);
				}
				addDrop(event, net.minecraft.init.Items.feather, 10, 0.5f);
				addDrop(event, Items.chicken_skin, 1, 0.9f);
				addDrop(event, Items.fat, 2, 0.4f);
				addDrop(event, Items.small_bone, 3, 0.7f);
			}
		}
		else if(event.entity instanceof EntityMooshroom)
		{
			event.drops.clear();
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, net.minecraft.init.Items.cooked_beef, 3, 0.9f);
				}
				else
				{
					addDrop(event, net.minecraft.init.Items.beef, 3, 0.9f);
				}
				addDrop(event, Items.mooshroom_hide, 1, 0.9f);
				addDrop(event, Items.fat, 5, 0.8f);
				addDrop(event, net.minecraft.init.Items.bone, 3, 0.9f);
				addDrop(event, Item.getItemFromBlock(net.minecraft.init.Blocks.red_mushroom), 3, 0.9f);
			}
		}
		else if(event.entity instanceof EntityCow)
		{
			event.drops.clear();
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, net.minecraft.init.Items.cooked_beef, 3, 0.9f);
				}
				else
				{
					addDrop(event, net.minecraft.init.Items.beef, 3, 0.9f);
				}
				addDrop(event, Items.cow_hide, 1, 0.9f);
				addDrop(event, Items.fat, 5, 0.8f);
				addDrop(event, net.minecraft.init.Items.bone, 3, 0.9f);
			}
		}
		else if(event.entity instanceof EntityGhast)
		{
			addDrop(event, Items.ghast_skin, 30, 0.5f);
			addDrop(event, Items.raw_ghast_meat, 9, 0.5f);
		}
		else if(event.entity instanceof EntityHorse)
		{
			event.drops.clear();
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, Items.cooked_horse_meat, 4, 0.9f);
				}
				else
				{
					addDrop(event, Items.raw_horse_meat, 4, 0.9f);
				}
				addDrop(event, Items.horse_hide, 1, 0.9f);
				addDrop(event, Items.fat, 6, 0.8f);
				addDrop(event, Items.horse_hair, 3, 0.8f);
				addDrop(event, net.minecraft.init.Items.bone, 4, 0.9f);
			}
		}
		else if(event.entity instanceof EntityVillager)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, Items.cooked_human_meat, 2, 0.9f);
				}
				else
				{
					addDrop(event, Items.raw_human_meat, 2, 0.9f);
				}
				addDrop(event, Items.human_skin, 1, 0.9f);
				addDrop(event, Items.fat, 2, 0.8f);
				addDrop(event, net.minecraft.init.Items.bone, 2, 0.9f);
			}
		}
		else if(event.entity instanceof EntityOcelot)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, Items.cooked_ocelot_meat, 1, 0.9f);
				}
				else
				{
					addDrop(event, Items.raw_ocelot_meat, 1, 0.9f);
				}
				addDrop(event, Items.ocelot_hide, 1, 0.9f);
				addDrop(event, Items.fat, 2, 0.4f);
				addDrop(event, Items.small_bone, 3, 0.9f);
			}
		}
		else if(event.entity instanceof EntityPig)
		{
			event.drops.clear();
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, net.minecraft.init.Items.cooked_porkchop, 3, 0.8f);
				}
				else
				{
					addDrop(event, net.minecraft.init.Items.porkchop, 3, 0.8f);
				}
				addDrop(event, Items.pig_skin, 1, 0.9f);
				addDrop(event, Items.fat, 5, 0.8f);
				addDrop(event, net.minecraft.init.Items.bone, 3, 0.8f);
			}
		}
		else if(event.entity instanceof EntitySheep)
		{
			event.drops.clear();
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, net.minecraft.init.Items.cooked_mutton, 3, 0.7f);
				}
				else
				{
					addDrop(event, net.minecraft.init.Items.mutton, 3, 0.7f);
				}
				addDrop(event, Items.sheep_hide, 1, 0.9f);
				addDrop(event, Item.getItemFromBlock(net.minecraft.init.Blocks.wool), 2, 0.7f);
				addDrop(event, Items.fat, 3, 0.8f);
				addDrop(event, net.minecraft.init.Items.bone, 3, 0.7f);
			}
		}
		else if(event.entity instanceof EntitySilverfish)
		{
			if(event.entity.isBurning())
			{
				addDrop(event, Items.cooked_silverfish, 1, 0.9f);
			}
			else
			{
				addDrop(event, Items.raw_silverfish, 1, 0.9f);
			}
		}
		else if(event.entity instanceof EntitySpider)
		{
			event.drops.clear();
			if(event.entity.isBurning())
			{
				addDrop(event, Items.cooked_spider_eye, 8, 0.5f);
				addDrop(event, Items.cooked_spider_leg, 8, 0.5f);
			}
			else
			{
				addDrop(event, net.minecraft.init.Items.spider_eye, 8, 0.5f);
				addDrop(event, Items.raw_spider_leg, 8, 0.5f);
			}
		}
		else if(event.entity instanceof EntitySquid)
		{
			event.drops.clear();
			if(event.entity.isBurning())
			{
				addDrop(event, Items.cooked_squid_meat, 8, 0.5f);
			}
			else
			{
				addDrop(event, Items.raw_squid_meat, 8, 0.5f);
			}
			addDrop(event, net.minecraft.init.Items.dye, 1, 0.9f);
		}
		else if(event.entity instanceof EntityWolf)
		{
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, Items.cooked_wolf_meat, 2, 0.8f);
				}
				else
				{
					addDrop(event, Items.raw_wolf_meat, 2, 0.8f);
				}
				addDrop(event, Items.wolf_hide, 1, 0.9f);
				addDrop(event, Items.fat, 2, 0.7f);
				addDrop(event, net.minecraft.init.Items.bone, 2, 0.7f);
			}
		}
		else if(event.entity instanceof EntityZombie)
		{
			event.drops.clear();
			if(!((EntityZombie)event.entity).isChild())
			{
				addDrop(event, net.minecraft.init.Items.rotten_flesh, 2, 0.9f);
				addDrop(event, net.minecraft.init.Items.bone, 2, 0.7f);
			}
			else
			{
				addDrop(event, net.minecraft.init.Items.rotten_flesh, 1, 0.9f);
				addDrop(event, Items.small_bone, 2, 0.7f);
			}
			addDrop(event, net.minecraft.init.Items.skull, 1, 0.1f, 2);
		}
		else if(event.entity instanceof EntityIronGolem)
		{
			event.drops.clear();
			addDrop(event, Item.getItemFromBlock(net.minecraft.init.Blocks.iron_block), 2, 0.5f);
			addDrop(event, net.minecraft.init.Items.iron_ingot, 8, 0.5f);
			// Thaumcraft integration would allow it to drop iron nuggets
			addDrop(event, Items.heart_of_gold, 1, 1f);
		}
		else if(event.entity instanceof EntityGolem)
		{
			addDrop(event, Items.frozen_heart, 1, 0.9f);
		}
		else if(event.entity instanceof EntityRabbit)
		{
			event.drops.clear();
			if(!((EntityAgeable)event.entity).isChild())
			{
				if(event.entity.isBurning())
				{
					addDrop(event, net.minecraft.init.Items.cooked_rabbit, 1, 0.9f);
				}
				else
				{
					addDrop(event, net.minecraft.init.Items.rabbit, 1, 0.9f);
				}
				addDrop(event, net.minecraft.init.Items.rabbit_hide, 1, 0.9f);
				addDrop(event, Items.fat, 2, 0.6f);
				addDrop(event, net.minecraft.init.Items.rabbit_foot, 1, 0.1f);
				addDrop(event, Items.small_bone, 2, 0.8f);
			}
		}
		else if(event.entity instanceof EntitySkeleton)
		{
			event.drops.clear();
			int type = ((EntitySkeleton)event.entity).getSkeletonType();
			if(type == 0)
			{
				addDrop(event, net.minecraft.init.Items.bone, 2, 0.9f);
				addDrop(event, Items.small_bone, 4, 0.9f);
				addDrop(event, net.minecraft.init.Items.arrow, 10, 0.5f);
			}
			else
			{
				addDrop(event, net.minecraft.init.Items.bone, 3, 0.9f);
				addDrop(event, Items.small_bone, 2, 0.9f);
			}
			addDrop(event, net.minecraft.init.Items.skull, 1, 0.1f, type);
			
		}
		else if(event.entity instanceof EntityPigZombie)
		{
			event.drops.clear();
			if(!((EntityPigZombie)event.entity).isChild())
			{
				addDrop(event, net.minecraft.init.Items.rotten_flesh, 2, 0.9f);
				addDrop(event, Items.fat, 3, 0.7f);
				addDrop(event, net.minecraft.init.Items.bone, 2, 0.7f);
			}
			else
			{
				addDrop(event, net.minecraft.init.Items.rotten_flesh, 1, 0.9f);
				addDrop(event, Items.fat, 2, 0.5f);
				addDrop(event, Items.small_bone, 2, 0.7f);
			}
		}
		else if(event.entity instanceof EntityBlaze)
		{
			event.drops.clear();
			addDrop(event, net.minecraft.init.Items.blaze_rod, 8, 0.5f);
			// Tinker's Construct integration would allow them to drop their head
		}
		else if(event.entity instanceof EntityMagmaCube)
		{
			// Doesn't do shit
		}
		else if(event.entity instanceof EntitySlime)
		{
			// This doesn't do shit either
		}
		else if(event.entity instanceof EntityWitch)
		{
			if(event.entityLiving.getAge() >= 0)
			{
				if(event.entity.isBurning())
				{
					addDrop(event, Items.cooked_human_meat, 2, 0.9f);
				}
				else
				{
					addDrop(event, Items.raw_human_meat, 2, 0.9f);
				}
				addDrop(event, Items.human_skin, 1, 0.9f);
				addDrop(event, Items.fat, 3, 0.8f);
				addDrop(event, net.minecraft.init.Items.bone, 2, 0.9f);
				// Should add some more random, rare drops, like brewing ingredients
			}
		}
		else if(event.entity instanceof EntityEnderman)
		{
			event.drops.clear();
			addDrop(event, net.minecraft.init.Items.ender_pearl, 1, 0.9f);
		}
		else if(event.entity instanceof EntityCreeper)
		{
			event.drops.clear();
			addDrop(event, net.minecraft.init.Items.gunpowder, 3, 0.6f);
		}
		else if(event.entity instanceof EntityDragon)
		{
			// Drops nothing special. How boring. Pls fix.
		}
		else if(event.entity instanceof EntityWither)
		{
			// Should drop some more stuff. I mean, it is a boss!
		}
		return;
	}
	
	
	
}
