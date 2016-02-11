package iamtheissue.eattheworld.main;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class Blocks
{
	//public static Block lamp;
	
	
	public static void init()
	{
		//lamp = new Lamp().setUnlocalizedName("lamp");
	}
	
	public static void register()
	{
		//GameRegistry.registerBlock(lamp, lamp.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		//registerRender(lamp);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
