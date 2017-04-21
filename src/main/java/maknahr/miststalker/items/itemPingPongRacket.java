package maknahr.miststalker.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * User: maknahr
 * Date: 14.4.2017
 * 
 * A ping Pong racket that can deflect projectiles 
 * and has some special properties on special ping pong balls.
 *
 */

public class itemPingPongRacket extends Item{

	  public itemPingPongRacket() {
		
		  this.setMaxDamage(0);
		  this.setHasSubtypes(false);
		  this.setMaxStackSize(1);
		  this.setCreativeTab(CreativeTabs.MISC);
	  }
	  
	  @Override
	  public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {

		  return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
	  }
	  
	  @Override
	  public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {

	  }
}