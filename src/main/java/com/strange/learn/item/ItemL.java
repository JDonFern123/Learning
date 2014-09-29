package com.strange.learn.item;

import com.strange.learn.reference.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemL extends Item
{
	private String unloacalizedName;

	public ItemL()
	{
		super();
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName());
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName());
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unloacalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
}
