package iamtheissue.eattheworld.init;

import iamtheissue.eattheworld.items.EffectFood;
import iamtheissue.eattheworld.items.FuelItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items
{
	public static Item bat_hide;
	public static Item chicken_skin;
	public static Item cooked_bat;
	public static Item cooked_ghast_meat;
	public static Item cooked_horse_meat;
	public static Item cooked_human_meat;
	public static Item cooked_ocelote_meat;
	public static Item cooked_silverfish;
	public static Item cooked_spider_eye;
	public static Item cooked_spider_leg;
	public static Item cooked_squid_meat;
	public static Item cooked_wolf_meat;
	public static Item cow_hide;
	public static Item fat;
	public static Item frozen_heart;
	public static Item ghast_skin;
	public static Item heart_of_gold;
	public static Item horse_hair;
	public static Item horse_hide;
	public static Item human_skin;
	public static Item mooshroom_hide;
	public static Item ocelote_hide;
	public static Item pig_skin;
	public static Item raw_bat;
	public static Item raw_ghast_meat;
	public static Item raw_horse_meat;
	public static Item raw_human_meat;
	public static Item raw_ocelote_meat;
	public static Item raw_silverfish;
	public static Item raw_spider_leg;
	public static Item raw_squid_meat;
	public static Item raw_wolf_meat;
	public static Item sheep_hide;
	public static Item small_bone;
	public static Item wolf_hide;

	
	public static void preInit()
	{
		//ModelBakery.registerItemVariants(phial_goo, new ModelResourceLocation(Reference.MOD_ID + ":phial_goo_0", "inventory"), new ModelResourceLocation(Reference.MOD_ID + ":phial_goo_1", "inventory"));
	}
	
	public static void init()
	{
		bat_hide = new Item().setUnlocalizedName("bat_hide");
		chicken_skin = new Item().setUnlocalizedName("chicken_skin");
		cooked_bat = new ItemFood(4, 1.5f, false).setUnlocalizedName("cooked_bat");
		cooked_ghast_meat = new ItemFood(10, 1.5f, false).setUnlocalizedName("cooked_ghast_meat");
		cooked_horse_meat = new ItemFood(8, 1.5f, false).setUnlocalizedName("cooked_horse_meat");
		cooked_human_meat = new ItemFood(6, 1.5f, false).setUnlocalizedName("cooked_human_meat");
		cooked_ocelote_meat = new ItemFood(5, 1.5f, false).setUnlocalizedName("cooked_ocelote_meat");
		cooked_silverfish = new ItemFood(2, 1.5f, false).setUnlocalizedName("cooked_silverfish");
		cooked_spider_eye = new ItemFood(2, 1.5f, false).setUnlocalizedName("cooked_spider_eye");
		cooked_spider_leg = new ItemFood(3, 1.5f, false).setUnlocalizedName("cooked_spider_leg");
		cooked_squid_meat = new ItemFood(3, 1.5f, false).setUnlocalizedName("cooked_squid_meat");
		cooked_wolf_meat = new ItemFood(6, 1.5f, false).setUnlocalizedName("cooked_wolf_meat");
		cow_hide = new Item().setUnlocalizedName("cow_hide");
		fat = new FuelItem(400).setUnlocalizedName("fat");
		frozen_heart = new EffectFood(0, 0f, 12, 400, 0, true).setUnlocalizedName("frozen_heart");
		ghast_skin = new Item().setUnlocalizedName("ghast_skin");
		heart_of_gold = new EffectFood(0, 0f, 11, 400, 3, true).setUnlocalizedName("heart_of_gold");
		horse_hair = new Item().setUnlocalizedName("horse_hair");
		horse_hide = new Item().setUnlocalizedName("horse_hide");
		human_skin = new Item().setUnlocalizedName("human_skin");
		mooshroom_hide = new Item().setUnlocalizedName("mooshroom_hide");
		ocelote_hide = new Item().setUnlocalizedName("ocelote_hide");
		pig_skin = new Item().setUnlocalizedName("pig_skin");
		raw_bat = new EffectFood(2, 0.25f, 19, 200, 0).setUnlocalizedName("raw_bat");
		raw_ghast_meat = new ItemFood(4, 0.25f, false).setUnlocalizedName("raw_ghast_meat");
		raw_horse_meat = new ItemFood(3, 0.25f, false).setUnlocalizedName("raw_horse_meat");
		raw_human_meat = new ItemFood(2, 0.25f, false).setUnlocalizedName("raw_human_meat");
		raw_ocelote_meat = new ItemFood(2, 0.25f, false).setUnlocalizedName("raw_ocelote_meat");
		raw_silverfish = new EffectFood(1, 0.25f, 17, 200, 0).setUnlocalizedName("raw_silverfish");
		raw_spider_leg = new EffectFood(1, 0.25f, 19, 400, 0).setUnlocalizedName("raw_spider_leg");
		raw_squid_meat = new ItemFood(2, 1f, false).setUnlocalizedName("raw_squid_meat");
		raw_wolf_meat = new ItemFood(2, 0.25f, false).setUnlocalizedName("raw_wolf_meat");
		sheep_hide = new Item().setUnlocalizedName("sheep_hide");
		small_bone = new Item().setUnlocalizedName("small_bone");
		wolf_hide = new Item().setUnlocalizedName("wolf_hide");
		
	}
	
	public static void register()
	{
		GameRegistry.registerItem(bat_hide, bat_hide.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(chicken_skin, chicken_skin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_bat, cooked_bat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_ghast_meat, cooked_ghast_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_horse_meat, cooked_horse_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_human_meat, cooked_human_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_ocelote_meat, cooked_ocelote_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_silverfish, cooked_silverfish.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_spider_eye, cooked_spider_eye.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_spider_leg, cooked_spider_leg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_squid_meat, cooked_squid_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_wolf_meat, cooked_wolf_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cow_hide, cow_hide.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fat, fat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(frozen_heart, frozen_heart.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ghast_skin, ghast_skin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(heart_of_gold, heart_of_gold.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(horse_hair, horse_hair.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(horse_hide, horse_hide.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(human_skin, human_skin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mooshroom_hide, mooshroom_hide.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ocelote_hide, ocelote_hide.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pig_skin, pig_skin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_bat, raw_bat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_ghast_meat, raw_ghast_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_horse_meat, raw_horse_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_human_meat, raw_human_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_ocelote_meat, raw_ocelote_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_silverfish, raw_silverfish.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_spider_leg, raw_spider_leg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_squid_meat, raw_squid_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_wolf_meat, raw_wolf_meat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sheep_hide, sheep_hide.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(small_bone, small_bone.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wolf_hide, wolf_hide.getUnlocalizedName().substring(5));
	}
	
	
	public static void registerRenders()
	{
		registerRender(bat_hide);
		registerRender(chicken_skin);
		registerRender(cooked_bat);
		registerRender(cooked_ghast_meat);
		registerRender(cooked_horse_meat);
		registerRender(cooked_human_meat);
		registerRender(cooked_ocelote_meat);
		registerRender(cooked_silverfish);
		registerRender(cooked_spider_eye);
		registerRender(cooked_spider_leg);
		registerRender(cooked_squid_meat);
		registerRender(cooked_wolf_meat);
		registerRender(cow_hide);
		registerRender(fat);
		registerRender(frozen_heart);
		registerRender(ghast_skin);
		registerRender(heart_of_gold);
		registerRender(horse_hair);
		registerRender(horse_hide);
		registerRender(human_skin);
		registerRender(mooshroom_hide);
		registerRender(ocelote_hide);
		registerRender(pig_skin);
		registerRender(raw_bat);
		registerRender(raw_ghast_meat);
		registerRender(raw_horse_meat);
		registerRender(raw_human_meat);
		registerRender(raw_ocelote_meat);
		registerRender(raw_silverfish);
		registerRender(raw_spider_leg);
		registerRender(raw_squid_meat);
		registerRender(raw_wolf_meat);
		registerRender(sheep_hide);
		registerRender(small_bone);
		registerRender(wolf_hide);
		
		
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	private static void registerRender(Item item, int meta)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5) + "_" + meta, "inventory"));
	}
	
	
	
	
	
	
	
	
	
	
}
