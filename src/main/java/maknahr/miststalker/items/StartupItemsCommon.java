package maknahr.miststalker.items;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupItemsCommon {
  public static itemWayfarersStone itemWayfarersStone;
  public static itemHeartFinder itemHeartFinder;
  
  
  public static void preInitCommon() {
    itemWayfarersStone = (itemWayfarersStone)(new itemWayfarersStone().setUnlocalizedName("wayfarers_stone"));
    itemWayfarersStone.setRegistryName("itemWayfarersStone");
    GameRegistry.register(itemWayfarersStone);

    itemHeartFinder = (itemHeartFinder)(new itemHeartFinder().setUnlocalizedName("heart_finder"));
    itemHeartFinder.setRegistryName("itemHeartFinder");
    GameRegistry.register(itemHeartFinder);    
  }

  public static void initCommon() {
  }

  public static void postInitCommon() {
  }
}