package zork_android_port;

import java.lang.*;
import java.util.*;

public class Cell extends zObject
{
	private ArrayList<zObject> cellObjects = new ArrayList<zObject>();
	private HashMap exits;
	
	public Cell(String newName, String newStatus, String newDescription)
	{
		name = newName;
		status = newStatus;
		description = newDescription;
		exits = new HashMap();
		
	}
	
	 public void setExits(Cell North, Cell East, Cell South, Cell West,
		Cell NorthEast, Cell NorthWest, Cell SouthEast, Cell SouthWest,
		Cell Up, Cell Down) 
	    {
	        if(North != null)
	            exits.put("north", North);
	        if(East != null)
	            exits.put("east", East);
	        if(South != null)
	            exits.put("south", South);
	        if(West != null)
	            exits.put("west", West);
	        if( NorthEast!= null)
	        	exits.put("northeast", NorthEast);
	        if(NorthWest != null)
	        	exits.put("northwest", NorthWest);
	        if(SouthEast != null)
	        	exits.put("southeast", SouthEast);
	        if(SouthWest != null)
	        	exits.put("southwest", SouthWest);
	        if(Up != null)
	        	exits.put("up", Up);
	        if(Down != null)
	        	exits.put("down", Down);
	    }
	
	public void add(Item newItem)
	{
		cellObjects.add((zObject) newItem);
		
	}
	
	public void add(Container newContainer)
	{
		cellObjects.add((zObject) newContainer);
		
	}
	
	public void printObjects()
	{
		for(zObject obj: cellObjects)
		{
			System.out.println(obj);
		}
		
	}
	
	public void print()
	{
		System.out.println("Name: " + name);
		System.out.println("Status: " + status);
		System.out.println("Description: " + description);
		
	}
	
}
