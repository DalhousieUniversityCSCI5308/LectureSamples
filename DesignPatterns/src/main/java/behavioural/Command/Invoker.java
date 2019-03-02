package behavioural.Command;

import java.util.*;

public class Invoker
{
	private List<Command> commands;
	
	public Invoker()
	{
		commands = new ArrayList<Command>();
	}
	
	public void storeCommand(Command command)
	{
		commands.add(command);
	}
	
	public void processCommands()
	{
		for (int i = 0; i < commands.size(); i++)
		{
			Command command = commands.get(i);
			command.execute();
		}
	}
	
	public void undoCommands()
	{
		for (int i = commands.size() - 1; i > -1; i--)
		{
			Command command = commands.get(i);
			command.undo();
		}
		commands.clear();
	}
}
