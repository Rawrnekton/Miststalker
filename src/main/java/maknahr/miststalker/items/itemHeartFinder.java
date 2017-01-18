package maknahr.miststalker.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class itemHeartFinder extends Item {
	//private int animationState = 0;
	
	public itemHeartFinder() {	
		this.setMaxDamage(0);
		this.setHasSubtypes(false);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {		

		if(playerIn.canEntityBeSeen(worldIn.getNearestAttackablePlayer(playerIn, 8, 4))) {
			playerIn.addChatComponentMessage(new TextComponentString(worldIn.getNearestAttackablePlayer(playerIn, 8, 4).toString()));
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
		}
		else
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemStackIn);

	}

}
