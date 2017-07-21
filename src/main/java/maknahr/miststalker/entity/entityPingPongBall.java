package maknahr.miststalker.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class entityPingPongBall extends EntityThrowable {
	private int remainingBounces = 5;
	//private Block lastBlockTraveledThrough = null;
	
	public entityPingPongBall(World worldIn) {
		super(worldIn);
	}

	public entityPingPongBall(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}

	public entityPingPongBall(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}

	public static void registerFixesPingPongBall(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "PingPongBall");
	}

	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	protected void onImpact(RayTraceResult result) {
		if (result.entityHit != null) {
			int damage = 0;
			result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float) damage);
		}
		
		if (!this.worldObj.isRemote && remainingBounces < 1) {
			this.setDead();
		} else {
			remainingBounces--;
			if(this.getEntityWorld().isRemote) {
				EntityPlayer player = this.getEntityWorld().playerEntities.get(0);
				player.addChatMessage(new TextComponentString("War hier: " + result.getBlockPos() + " " + this.isCollided));
			}
			if(this.isCollidedVertically) {
				this.setVelocity(this.motionX, this.motionY * (-1), this.motionZ); //ist so korrekt
			} 
			//if(this.isCollidedHorizontally) {
				this.setVelocity(this.motionX * (-1), this.motionY * (-1), this.motionZ * (-1)); //ist es nicht
			//}
		}
	}
}