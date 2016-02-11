package iamtheissue.eattheworld.items;

import java.util.Collection;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EffectFood extends ItemFood
{
	private int effectId;
	private int effectDuration;
	private int effectAmplifier;
	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		super.onFoodEaten(stack, world, player);
		PotionEffect effect = new PotionEffect(effectId, effectDuration, effectAmplifier);
		if (!world.isRemote)
		{
			player.addPotionEffect(new PotionEffect(effect));
			
		}
            
	}

	public EffectFood(int amount, float saturation, int effectId, int effectDuration, int effectAmplifier)
	{
		this(amount, saturation, effectId, effectDuration, effectAmplifier, false);
	}
	public EffectFood(int amount, float saturation, int effectId, int effectDuration, int effectAmplifier, boolean alwaysEdible)
	{
		super(amount, saturation, false);
		this.effectId = effectId;
		this.effectDuration = effectDuration;
		this.effectAmplifier = effectAmplifier;
		if(alwaysEdible)
		{
			this.setAlwaysEdible();
		}
	}
	
	

	
}
