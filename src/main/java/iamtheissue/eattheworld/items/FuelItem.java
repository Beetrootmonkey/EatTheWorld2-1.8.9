package iamtheissue.eattheworld.items;

import net.minecraft.item.Item;

public class FuelItem extends Item
{
	int burnTime;
	
	public int getBurnTime()
	{
		return burnTime;
	}
	
	public FuelItem(int burnTime)
	{
		super();
		this.burnTime = burnTime;
	}
}
