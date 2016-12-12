package maknahr.mistStalker;

import maknahr.mistStalker.common.core.CommonProxy;
import maknahr.mistStalker.common.lib.ModMisc;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModMisc.MODID, name = ModMisc.MODNAME, version = ModMisc.VERSION, acceptedMinecraftVersions = ModMisc.MCVERSION)
public class MistStalker {
	@Mod.Instance(ModMisc.MODID)
	public static MistStalker instance;

    @SidedProxy(clientSide=ModMisc.CLIENTPROXY, serverSide=ModMisc.SERVERPROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit();
    }
}
