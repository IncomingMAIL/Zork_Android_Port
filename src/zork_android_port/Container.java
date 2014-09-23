package zork_android_port;

import java.lang.*;
import java.util.*;

public class Container extends zObject
{
    private ArrayList<Item> contObjects = new ArrayList<Item>();

    public Container(String newName, String newStatus, String newDescription)
    {
	name = newName;
	status = newStatus;
	description = newDescription;
    }

    public void add(Item newItem)
    {
	contObjects.add(newItem);
    }

    public void open()
    {
	int i = contObjects.size();
	if (i > 0)
	{
	    System.out.println(this.name + " contains " + contObjects);
	} else
	{
	    System.out.println(this.name + " is empty.");
	}
    }
}
