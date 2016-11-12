package maknahr.mistStalker.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class StartupItemsClient {

  public static void preInitClientOnly() {
    // required in order for the renderer to know how to render your item.
    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("miststalker:itemWayfarersStone", "inventory");
    final int DEFAULT_ITEM_SUBTYPE = 0;
    ModelLoader.setCustomModelResourceLocation(StartupItemsCommon.itemWayfarersStone, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
  }

  public static void initClientOnly() {
  }

  public static void postInitClientOnly() {
  }
}