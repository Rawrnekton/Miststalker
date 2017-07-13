package maknahr.miststalker.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupItemsClient {

  public static void preInitClientOnly() {
    // required in order for the renderer to know how to render your item.
	final int DEFAULT_ITEM_SUBTYPE = 0;
	  
    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("miststalker:itemWayfarersStone", "inventory");
    ModelLoader.setCustomModelResourceLocation(StartupItemsCommon.itemWayfarersStone, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
    
    itemModelResourceLocation = new ModelResourceLocation("miststalker:itemHeartFinder", "inventory");
    ModelLoader.setCustomModelResourceLocation(StartupItemsCommon.itemHeartFinder, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
  }

  public static void initClientOnly() {
  }

  public static void postInitClientOnly() {
  }
}