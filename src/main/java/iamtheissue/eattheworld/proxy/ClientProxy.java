package iamtheissue.eattheworld.proxy;

import iamtheissue.eattheworld.main.Blocks;
import iamtheissue.eattheworld.main.Items;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		Items.registerRenders();
		Blocks.registerRenders();
	}
}
