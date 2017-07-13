package maknahr.miststalker.common.lib;

public final class ModMisc {

	//Mod Constants
	public static final String MODNAME = "Miststalker";
	public static final String MODID = "miststalker";
	public static final String BUILD = "GRADLE:BUILD";
	public static final String VERSION = "GRADLE:VERSION-" + BUILD;
	public static final String MCVERSION = "[1.10.2]";
	public static final String DEPENDENCIES = "required-after:Forge@[1.10.2-12.18.2.2125]";

	//current Proxy Locations
	//public static final String COMMONPROXY = "maknahr.mistStalker.proxy.Commonproxy";
	public static final String CLIENTPROXY = "maknahr.miststalker.proxy.ClientOnlyProxy";
	//public static final String SERVERPROXY = "maknahr.mistStalker.proxy.DedicatedServerProxy";
	//Proxy Locations
	//package maknahr.miststalker.common.core.proxy;

	public static final String SERVERPROXY = "maknahr.miststalker.common.core.proxy.DedicatedServerProxy";
	public static final String COMMONPROXY = "maknahr.miststalker.common.core.proxy.CommonProxy";
	
}