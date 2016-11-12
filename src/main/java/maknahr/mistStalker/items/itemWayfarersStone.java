package maknahr.mistStalker.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
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

	  public itemWayfarersStone() {
		
		  this.setMaxDamage(0);
		  this.setHasSubtypes(false);
		  this.setMaxStackSize(1);
		  this.setCreativeTab(CreativeTabs.MISC);   // the item will appear on the Miscellaneous tab in creative
	  }
	  
	  @Override
	  public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		/*
	    NBTTagCompound nbtTagCompound = itemStackIn.getTagCompound();

	    if (playerIn.isSneaking()) { // shift pressed; save (or overwrite) current location
	      if (nbtTagCompound == null) {
	        nbtTagCompound = new NBTTagCompound();
	        itemStackIn.setTagCompound(nbtTagCompound);
	      }
	      nbtTagCompound.setBoolean("Bound", true);
	      nbtTagCompound.setDouble("X", (int) playerIn.posX);
	      nbtTagCompound.setDouble("Y", (int)playerIn.posY);
	      nbtTagCompound.setDouble("Z", (int)playerIn.posZ);
	      return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
	    }

	    boolean bound = false;
	    if (nbtTagCompound != null && nbtTagCompound.hasKey("Bound")  ) {
	      bound = nbtTagCompound.getBoolean("Bound");
	    }
	    if (bound) {
	      playerIn.setActiveHand(hand); // start the charge up sequence
	      return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
	    } else {
	      if (worldIn.isRemote) {  // only on the client side, else you will get two messages..
	        playerIn.addChatComponentMessage(new TextComponentString("Gem doesn't have a stored location! Shift right click to store your current location"));
	      }
	      return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemStackIn);
	    } */
		  if (playerIn.isSneaking()) {
			  if (worldIn.isRemote) {
				  playerIn.addChatComponentMessage(new TextComponentString("u is sneaky"));
			  }
		  }
		  else if (worldIn.isRemote) {
			  playerIn.addVelocity(0, 5, 0);
			  playerIn.addChatComponentMessage(new TextComponentString("u is not sneaky"));
			  return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
		  }		  
		  
		  return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
	  }
	  
}