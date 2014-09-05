package zork_android_port;

public class CommandList
{
    private static final String validCommands[] =
	{ "go", "quit", "help" };

    public CommandList()
    {

    }

    public boolean isCommand(String string)
    {
	for (int i = 0; i < validCommands.length; i++)
	{
	    if (validCommands[i].equals(string))
		return true;
	}
	return false;
    }

    public void listAll()
    {
	for (int i = 0; i < validCommands.length; i++)
	{
	    System.out.println(validCommands[i]);
	}
    }

}
