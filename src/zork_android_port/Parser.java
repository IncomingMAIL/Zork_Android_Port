package zork_android_port;

import java.io.*;
import java.util.*;

public class Parser 
{
	private CommandList commands;
	
	public Parser()
	{
		commands = new CommandList();
	}
	
	public Input getCommand()
	{
		String input_line = "";
		String word1;
		String word2;
		
		System.out.print(">");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			input_line = reader.readLine();
		}
		catch(java.io.IOException exc)
		{
			System.out.println("There was an error during reading: " + exc.getMessage());
		}
		
		StringTokenizer tokenizer = new StringTokenizer(input_line);
		
		if(tokenizer.hasMoreTokens())
		{
			word1 = tokenizer.nextToken();
		}
		else {word1 = null;}
		
		if(tokenizer.hasMoreTokens())
		{
			word2 = tokenizer.nextToken();
		}
		else {word2 = null;}
		
		if(commands.isCommand(word1))
		{
			return new Input(word1, word2);
		}
		else {return new Input(null, word2);}		
	}
	
	public void listCommands()
	{
		commands.listAll();
	}
}
