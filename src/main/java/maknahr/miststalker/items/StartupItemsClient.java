package maknahr.miststalker.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupItemsClient {

<<<<<<< HEAD
  public static void preInitClientOnly() {
    // required in order for the renderer to know how to render your item.
	final int DEFAULT_ITEM_SUBTYPE = 0;
	  
    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("miststalker:itemWayfarersStone", "inventory");
    ModelLoader.setCustomModelResourceLocation(StartupItemsCommon.itemWayfarersStone, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
    
    itemModelResourceLocation = new ModelResourceLocation("miststalker:itemHeartFinder", "inventory");
    ModelLoader.setCustomModelResourceLocation(StartupItemsCommon.itemHeartFinder, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
  }
=======
	public static void preInitClientOnly() {
		// required in order for the renderer to know how to render your item.
>>>>>>> branch 'master' of https://github.com/Rawrnekton/Miststalker

		final int DEFAULT_ITEM_SUBTYPE = 0;
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("miststalker:itemWayfarersStone", "inventory");
		ModelLoader.setCustomModelResourceLocation(StartupItemsCommon.itemWayfarersStone, DEFAULT_ITEM_SUBTYPE,	itemModelResourceLocation);

		ModelResourceLocation itemModelResourceLocation2 = new ModelResourceLocation("miststalker:itemPingPongRacket", "inventory");
		ModelLoader.setCustomModelResourceLocation(StartupItemsCommon.itemPingPongRacket, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation2);

		ModelResourceLocation itemModelResourceLocation3 = new ModelResourceLocation("miststalker:itemPingPongBall", "inventory");
		ModelLoader.setCustomModelResourceLocation(StartupItemsCommon.itemPingPongBall, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation3);
	}

	public static void initClientOnly() {
	}

	public static void postInitClientOnly() {
	}
}