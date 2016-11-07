package maknahr.mistStalker;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MistStalker.MODID, name = MistStalker.NAME, version = MistStalker.VERSION, acceptedMinecraftVersions = "[1.10.2]")
public class MistStalker
{
    public static final String MODID = "MistStalker";
    public static final String VERSION = "0.1";
	public static final String NAME = "Miststalker";
    
    static{
        //For some reason, this has to be done here
        FluidRegistry.enableUniversalBucket();
    }
    
	@Mod.Instance(MODID)
	public static MistStalker instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="maknahr.mistStalker.ClientOnlyProxy", serverSide="maknahr.mistStalker.DedicatedServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
      proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
      proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
      proxy.postInit();
    }
}
