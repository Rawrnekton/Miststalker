package maknahr.mistStalker.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

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
		
	    final int MAXIMUM_NUMBER_OF_FROGS = 8;
	    this.setMaxStackSize(MAXIMUM_NUMBER_OF_FROGS);
	    this.setCreativeTab(CreativeTabs.MISC);   // the item will appear on the Miscellaneous tab in creative
	  }
}
/*
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemSimple extends Item
{


}*/