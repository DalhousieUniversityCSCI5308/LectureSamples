package example.logging;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ErrorHandling
{
	private final Logger logger;
	
	public ErrorHandling()
	{
		logger = LogManager.getLogger(ErrorHandling.class);
	}
	
	public void doSomethingFatal()
	{
		int x = 0;
		@SuppressWarnings("unused")
		int y = 10 / x;
	}
	
	public void doSomethingLessFatal(int x)
	{
		// Check the input, make sure no divide by zero!
		if (x == 0)
		{
			throw new IllegalArgumentException();
		}
		@SuppressWarnings("unused")
		int y = 10 / x;
	}
	
	public void doSomethingYouCanRecoverFrom(String fileName)
	{
		try
		{
			try
			{
				// Try to write to the given file.
				writeToAFile(fileName);
			}
			catch (FileNotFoundException e)
			{
				/*
					Note: If you wrote this code this way knowing the file didn't exist
							beforehand, that would be bad, it would count as using exceptions
							for control flow. However, this way of programming is useful because
							you can't always plan for every scenario. It would let you catch a
							scenario you missed when you first wrote the code, without being fatal
							to the user.
				*/
				// The file doesn't exist, create it, then try again.
				logger.warn("DoSomethingYouCanRecoverFrom() expected file = " + 
								fileName + 
								" to exist, but it did not, creating it now.");
				createFile(fileName);
				writeToAFile(fileName);
			}
		}
		catch (IOException e)
		{
			// Some other error happened, I didn't plan for that exception, fatal!
			logger.log(Level.FATAL, "Unknown file IO error writing to file = " + fileName, e);
		}
	}
	
	public void createFile(String fileName) throws IOException
	{	
		Path path = Paths.get(fileName);
		Files.createDirectories(path.getParent());
		Files.createFile(path);
	}
	
	private void writeToAFile(String fileName) throws IOException
	{
		File f = new File(fileName);
		if (f.exists())
		{
			// This code might also fail, and return a different IOException
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append("Hello world!");
			bw.close();
			fw.close();
		}
		else
		{
			throw new FileNotFoundException(fileName + " does not exist!");
		}
	}
	
	public void catchAnErrorAtCompileTime()
	{
		int x = 0;
		switch (x)
		{
			case 0:
			{
				System.out.println("0!");
			}
			// Look at the warning to the left that NetBeans gives me.
			case 1:
			{
				System.out.println("1!");
				break;
			}
		}
		
		boolean y = false;
		if (y = true)
		{
			System.out.println("This one gets through...");
		}
		/*
		if (true = y)
		{
			System.out.println("The compiler catches this one, can't screw this up.");
		}
		*/
	}
	
	public void stepThroughYourCode()
	{
		List<String> list = new ArrayList<>();
		list.add("Joe");
		list.add("Fred");
		list.add("Steve");
		list.add("Mike");
		for (int i = 0; i < list.size(); i++)
		{
			doSomethingToList(list, i);
			System.out.println(list.get(i));
		}
	}
	
	private void doSomethingToList(List<String> list, int index)
	{
		if (index > 2)
		{
			list.remove(index);
		}
	}
}