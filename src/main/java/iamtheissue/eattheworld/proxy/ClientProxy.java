package iamtheissue.eattheworld.proxy;

import iamtheissue.eattheworld.init.Blocks;
import iamtheissue.eattheworld.init.Items;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		Items.registerRenders();
		Blocks.registerRenders();
	}
}
