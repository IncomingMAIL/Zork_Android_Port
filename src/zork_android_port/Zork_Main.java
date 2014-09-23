package zork_android_port;

import java.lang.*;
import java.util.*;

public class Zork_Main
{

    public static void main(String[] args)
    {
	System.out.println("Hello World!");
	Cell room1 = new Cell("Room1", "dark", "This is a room");
	Item item1 = new Item("Item1", "Regular", "This is an item");
	Container chest1 = new Container("Chest1", "closed", "This is a chest");

	room1.add(item1);
	room1.add(chest1);
	room1.printObjects();
	chest1.add(new Item("Sword", "sharp", "A really sharp sword!"));
	chest1.open();

    }
}
