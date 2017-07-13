package maknahr.miststalker.proxy;

import maknahr.miststalker.common.core.proxy.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;


public class ClientOnlyProxy extends CommonProxy {

  /**
   * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
   */
  public void preInit() {
	  super.preInit();
	  maknahr.miststalker.items.StartupItemsClient.preInitClientOnly();
  }

  /**
   * Do your mod setup. Build whatever data structures you care about. Register recipes,
   * send FMLInterModComms messages to other mods.
   */
  public void init() {
	  super.init();
  }

  /**
   * Handle interaction with other mods, complete your setup based on this.
   */
  public void postInit() {
	  super.postInit();
  }

  @Override
  public boolean playerIsInCreativeMode(EntityPlayer player) {
	  if (player instanceof EntityPlayerMP) {
		  EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
		  return entityPlayerMP.interactionManager.isCreative();
	  } else if (player instanceof EntityPlayerSP) {
		  return Minecraft.getMinecraft().playerController.isInCreativeMode();
	  }
	  return false;
  }

  @Override
  public boolean isDedicatedServer() {
	  return false;
  }

}
