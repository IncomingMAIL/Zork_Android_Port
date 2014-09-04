package zork_android_port;

import java.lang.*;
import java.util.*;

public class Player 
{
	private ArrayList<Item> Inventory = new ArrayList<Item>();
	
	public void getItem(Item newItem)
	{
		Inventory.add(newItem);
	}
	
	public void printInventory()
	{
		for(Item item: Inventory)
		{
			System.out.println(item);
		}
	}
	
}
