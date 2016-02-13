package iamtheissue.eattheworld.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config
{
	private static String CATEGORY_DROPS = "drops";
	public static void load(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		//boolean someConfigFlag = config.get(Configuration.CATEGORY_GENERAL, "SomeConfigFlag", false).getBoolean(false);
		//Notice there is nothing that gets the value of this property so the expression results in a Property object.
        //Property someProperty = config.get(Configuration.CATEGORY_GENERAL, "SomeConfigString", "nothing");
        
        // Here we add a comment to our new property.
        //someProperty.comment = "This value can be read as a string!";
        
        //String someConfigString = someProperty.getString();
		AlteredDrops.minimumDrop = config.getBoolean("minimumDrop", Configuration.CATEGORY_GENERAL, false, "If true, every drop that could spawn more than one item is guaranteed to spawn at least one.");
		
        config.setCategoryComment(CATEGORY_DROPS, "If false, disables the alteration of this mob's drops.");
        AlteredDrops.bat = config.get(CATEGORY_DROPS, "bat", true).getBoolean(true);
        AlteredDrops.blaze = config.get(CATEGORY_DROPS, "blaze", true).getBoolean(true);
        AlteredDrops.chicken = config.get(CATEGORY_DROPS, "chicken", true).getBoolean(true);
        AlteredDrops.cow = config.get(CATEGORY_DROPS, "cow", true).getBoolean(true);
        AlteredDrops.creeper = config.get(CATEGORY_DROPS, "creeper", true).getBoolean(true);
        //AlteredDrops.enderDragon = config.get(CATEGORY_DROPS, "enderDragon", true).getBoolean(true);
        AlteredDrops.enderman = config.get(CATEGORY_DROPS, "enderman", true).getBoolean(true);
        AlteredDrops.ghast = config.get(CATEGORY_DROPS, "ghast", true).getBoolean(true);
        AlteredDrops.horse = config.get(CATEGORY_DROPS, "horse", true).getBoolean(true);
        AlteredDrops.ironGolem = config.get(CATEGORY_DROPS, "ironGolem", true).getBoolean(true);
        //AlteredDrops.magmaCube = config.get(CATEGORY_DROPS, "magmaCube", true).getBoolean(true);
        AlteredDrops.mooshroom = config.get(CATEGORY_DROPS, "mooshroom", true).getBoolean(true);
        AlteredDrops.ocelot = config.get(CATEGORY_DROPS, "ocelot", true).getBoolean(true);
        AlteredDrops.tamedOcelot = config.get(CATEGORY_DROPS, "tamedOcelot", true).getBoolean(true);
        AlteredDrops.pig = config.get(CATEGORY_DROPS, "pig", true).getBoolean(true);
        AlteredDrops.pigZombie = config.get(CATEGORY_DROPS, "pigZombie", true).getBoolean(true);
        AlteredDrops.rabbit = config.get(CATEGORY_DROPS, "rabbit", true).getBoolean(true);
        AlteredDrops.sheep = config.get(CATEGORY_DROPS, "sheep", true).getBoolean(true);
        AlteredDrops.silverfish = config.get(CATEGORY_DROPS, "silverfish", true).getBoolean(true);
        AlteredDrops.skeleton = config.get(CATEGORY_DROPS, "skeleton", true).getBoolean(true);
        //AlteredDrops.slime = config.get(CATEGORY_DROPS, "slime", true).getBoolean(true);
        AlteredDrops.snowGolem = config.get(CATEGORY_DROPS, "snowGolem", true).getBoolean(true);
        AlteredDrops.spider = config.get(CATEGORY_DROPS, "spider", true).getBoolean(true);
        AlteredDrops.squid = config.get(CATEGORY_DROPS, "squid", true).getBoolean(true);
        AlteredDrops.villager = config.get(CATEGORY_DROPS, "villager", true).getBoolean(true);
        AlteredDrops.witch = config.get(CATEGORY_DROPS, "witch", true).getBoolean(true);
        //AlteredDrops.wither = config.get(CATEGORY_DROPS, "wither", true).getBoolean(true);
        AlteredDrops.witherSkeleton = config.get(CATEGORY_DROPS, "witherSkeleton", true).getBoolean(true);
        AlteredDrops.wolf = config.get(CATEGORY_DROPS, "wolf", true).getBoolean(true);
        AlteredDrops.zombie = config.get(CATEGORY_DROPS, "zombie", true).getBoolean(true);
        
        config.save();
	}
}
