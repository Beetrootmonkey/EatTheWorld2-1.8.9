package iamtheissue.eattheworld.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void register()
	{
		registerSmelting();
		registerShapeless();
		registerShaped();
		
	}
	
	private static void registerSmelting()
	{
		GameRegistry.addSmelting(Items.raw_bat, new ItemStack(Items.cooked_bat), 0.35f);
		GameRegistry.addSmelting(Items.raw_ghast_meat, new ItemStack(Items.cooked_ghast_meat), 0.35f);
		GameRegistry.addSmelting(Items.raw_horse_meat, new ItemStack(Items.cooked_horse_meat), 0.35f);
		GameRegistry.addSmelting(Items.raw_human_meat, new ItemStack(Items.cooked_human_meat), 0.35f);
		GameRegistry.addSmelting(Items.raw_ocelot_meat, new ItemStack(Items.cooked_ocelot_meat), 0.35f);
		GameRegistry.addSmelting(Items.raw_silverfish, new ItemStack(Items.cooked_silverfish), 0.35f);
		GameRegistry.addSmelting(net.minecraft.init.Items.spider_eye, new ItemStack(Items.cooked_spider_eye), 0.35f);
		GameRegistry.addSmelting(Items.raw_spider_leg, new ItemStack(Items.cooked_spider_leg), 0.35f);
		GameRegistry.addSmelting(Items.raw_squid_meat, new ItemStack(Items.cooked_squid_meat), 0.35f);
		GameRegistry.addSmelting(Items.raw_wolf_meat, new ItemStack(Items.cooked_wolf_meat), 0.35f);
	}
	
	private static void registerShaped()
	{
		GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Items.leather), new Object[]{"HHH", "HHH", "HHH", 'H', Items.bat_hide});
		GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Items.leather), new Object[]{"HH", 'H', Items.chicken_skin});
		GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Items.leather), new Object[]{"HH", 'H', Items.human_skin});
		GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Items.leather), new Object[]{"HH", "HH", 'H', Items.ocelot_hide});
		GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Items.leather), new Object[]{"HH", 'H', Items.pig_skin});
		GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Items.leather), new Object[]{"HH", 'H', Items.sheep_hide});
		GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Items.leather), new Object[]{"HHH", 'H', Items.wolf_hide});
		
		GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Blocks.torch, 2), new Object[]{"F", "S", 'F', Items.fat, 'S', net.minecraft.init.Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.init.Items.string, 2), new Object[]{"H", "H", 'H', Items.horse_hair});
	}
	
	private static void registerShapeless()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.leather), Items.cow_hide);
		GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.leather), Items.ghast_skin);
		GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.leather), Items.horse_hide);
		GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.leather), Items.mooshroom_hide);
		GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.leather), Items.cow_hide);
		
		GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.dye, 1, 15), Items.small_bone);
	}
}
