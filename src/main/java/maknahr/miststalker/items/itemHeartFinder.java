package maknahr.miststalker.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class itemHeartFinder extends Item {
	//private int animationState = 0;
	List<EntityCreeper> creeperList;
	
	public itemHeartFinder() {	
		this.setMaxDamage(10);
		this.setHasSubtypes(false);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.creeperList = null;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {		
		List<Entity> test = worldIn.getLoadedEntityList();
		for(int i = 0; i < creeperList.size(); i++) {
			creeperList.get(i).setGlowing(false);
		}
		for( int i = 0; i < test.size(); i++) {
			if(test.get(i).dimension == 0 && test.get(i) instanceof EntityCreeper && test.get(i).getDistanceSqToEntity(playerIn) < 100) {
				creeperList.add((EntityCreeper) test.get(i));
				test.get(i).setGlowing(true);	
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
	}
}