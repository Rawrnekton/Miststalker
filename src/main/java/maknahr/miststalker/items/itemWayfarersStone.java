package maknahr.miststalker.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

/**
 * User: The Grey Ghost
 * Date: 30/12/2014
 *
 * ItemSimple is an ordinary two-dimensional item
 * For background information on items see here http://greyminecraftcoder.blogspot.com/2013/12/items.html
 *   and here http://greyminecraftcoder.blogspot.com.au/2014/12/item-rendering-18.html
 */

public class itemWayfarersStone extends Item{

	  private int saturationBuildUp = 0;
	  
	  public itemWayfarersStone() {
		
		  this.setMaxDamage(0);
		  this.setHasSubtypes(false);
		  this.setMaxStackSize(1);
		  this.setCreativeTab(CreativeTabs.MISC);
	  }
	  
	  @Override
	  public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		  playerIn.getFoodStats().setFoodLevel(0);
		  playerIn.getFoodStats().setFoodSaturationLevel(0);
		  
		  playerIn.addChatComponentMessage(new TextComponentString("does is do this stuff 2 times"));
		  
		  return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
	  }
	  
	  @Override
	  public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		  if (!(entityIn instanceof EntityPlayer)) return;
		  EntityPlayer playerIn = (EntityPlayer) entityIn;
		  
		  if ((playerIn.onGround) && (worldIn.canBlockSeeSky(new BlockPos(playerIn.posX, playerIn.posY, playerIn.posZ)))) {
			  saturationBuildUp += 1;
			  if(worldIn.isRemote) playerIn.addChatComponentMessage(new TextComponentString("saturationBuildUp: " + saturationBuildUp));
			  if (saturationBuildUp >= 180) {
				  if (worldIn.isRemote) {
					  playerIn.addChatComponentMessage(new TextComponentString("Player is standing on " + playerIn.posY + "\nSaturation was " + playerIn.getFoodStats().getSaturationLevel()));
				  }
				  saturationBuildUp = 0;
				  playerIn.getFoodStats().addStats(1, 1);
				  if (worldIn.isRemote) {
					  playerIn.addChatComponentMessage(new TextComponentString("Saturation is now " + playerIn.getFoodStats().getSaturationLevel()));
				  }
			  }
		  }
	  }
}