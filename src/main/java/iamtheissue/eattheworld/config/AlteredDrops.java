package iamtheissue.eattheworld.config;

public class AlteredDrops
{
	// If true, every drop that could spawn more than one item is guaranteed to spawn at least one.
	public static boolean minimumDrop = true;
	
	// Use altered drops for:
	
	// Passive mobs
	public static boolean bat = true;
	public static boolean chicken = true;
	public static boolean cow = true;
	public static boolean mooshroom = true;
	public static boolean pig = true;
	public static boolean rabbit = true;
	public static boolean sheep = true;
	public static boolean squid = true;
	public static boolean villager = true;
	
	// Neutral mobs
	// Cave Spiders currently are treated as "normal" Spiders
	//public static boolean caveSpider = true;
	public static boolean enderman = true;
	public static boolean spider = true;
	public static boolean pigZombie = true;
	
	// Hostile mobs
	public static boolean blaze = true;
	public static boolean creeper = true;
	// Elder Guardian drops currently aren't altered by this mod
	//public static boolean elderGuardian = true;
	// Endermite drops currently aren't altered by this mod
	//public static boolean endermite = true;
	public static boolean ghast = true;
	// Guardian drops currently aren't altered by this mod
	//public static boolean guardian = true;
	// Magma Cube drops currently aren't altered by this mod
	public static boolean magmaCube = true;
	public static boolean silverfish = true;
	public static boolean skeleton = true;
	// Slime drops currently aren't altered by this mod
	public static boolean slime = true;
	public static boolean witch = true;
	public static boolean witherSkeleton = true;
	public static boolean zombie = true;
	
	// Tameable mobs
	// Donkeys currently are treated as horses
	//public static boolean donkey = true;
	public static boolean horse = true;
	// Mules currently are treated as horses
	//public static boolean mule = true;
	public static boolean ocelot = true;
	public static boolean wolf = true;
	
	// Utility mobs
	public static boolean ironGolem = true;
	public static boolean snowGolem = true;
	
	// Boss mobs
	// Ender Dragon drops currently aren't altered by this mod
	public static boolean enderDragon = true;
	// Wither drops currently aren't altered by this mod
	public static boolean wither = true;
}
