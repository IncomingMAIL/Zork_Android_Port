package zork_android_port;

import java.lang.*;
import java.util.*;

public class Item extends zObject
{
    protected String writing = "default_writing";

    public Item(String newName, String newStatus, String newDescription)
    {
	name = newName;
	status = newStatus;
	description = newDescription;
    }
}
