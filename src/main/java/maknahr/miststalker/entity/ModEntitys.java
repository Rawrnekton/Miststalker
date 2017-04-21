package maknahr.miststalker.entity;

import maknahr.miststalker.MistStalker;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntitys {

	public static void init() {
		int id = 0;
		
		EntityRegistry.registerModEntity(entityPingPongBall.class, "PingPong Ball", id, MistStalker.instance, 64, 10, true);
	}
}
