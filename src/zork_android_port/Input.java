package zork_android_port;

public class Input 
{
	private String firstWord;
	private String secondWord;
	
	public Input(String first, String second)
	{
		firstWord = first;
		this.secondWord = second;
	}
	
	public String getFirstWord()
	{
		return firstWord;
	}
	
	public String getSecondWord()
	{
		return secondWord;
	}
	
	public boolean isUnknown()
	{
		return (firstWord == null);
	}
	
	public boolean hasSecondWord()
	{
		return (secondWord != null);
	}
	
}
