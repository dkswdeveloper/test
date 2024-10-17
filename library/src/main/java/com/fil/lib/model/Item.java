package com.fil.lib.model;

public abstract class Item
{
	private int itemId;
	private static int nextItemid = 101;
	// anonymous constructor
	{
		itemId = nextItemid++;
	}
	public int getItemId()
	{
		// return specific data
		return itemId;
	}
	public void setItemId(int itemid)
	{
		//validator code, hash the data and then save
		this.itemId = itemid;
	}
	
}
