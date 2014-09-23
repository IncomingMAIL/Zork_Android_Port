package zork_android_port;

import java.lang.*;
import java.util.*;

public class zObject
{
    protected String name = "default_name";
    protected String status = "normal";
    protected String description = "default_description";

    public void setStatus(String newStatus)
    {
	status = newStatus;
    }

    public String toString()
    {
	return (name + " - " + status);
    }
}
