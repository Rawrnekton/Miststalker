package maknahr.miststalker.items;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupItemsCommon {
  public static itemWayfarersStone itemWayfarersStone;  // this holds the unique instance of your item
  public static itemHeartFinder itemHeartFinder;
  
  
  public static void preInitCommon() {
    // each instance of your item should have two names:
    // 1) a registry name that is used to uniquely identify this item.  Should be unique within your mod.  use lower case.
    // 2) an 'unlocalised name' that is used to retrieve the text name of your item in the player's language.  For example-
    //    the unlocalised name might be "water", which is printed on the user's screen as "Wasser" in German or
    //    "aqua" in Italian.
    //
    //    Multiple items can have the same unlocalised name - for example
    //  +----RegistryName-------+----UnlocalisedName----+
    //  |  burning_candle       +       candle          |
    //  |  extinguished_candle  +       candle          |
    //  +-----------------------+-----------------------+
    //
    itemWayfarersStone = (itemWayfarersStone)(new itemWayfarersStone().setUnlocalizedName("wayfarers_stone"));
    itemWayfarersStone.setRegistryName("itemWayfarersStone");
    GameRegistry.register(itemWayfarersStone);
    /*
    itemHeartFinder = (itemHeartFinder)(new itemHeartFinder().setUnlocalizedName("heart_finder"));
    itemHeartFinder.setRegistryName("itemHeartFinder");
    GameRegistry.register(itemHeartFinder);*/
    
  }

  public static void initCommon() {
  }

  public static void postInitCommon() {
  }
}