package structural.Decorator;

import java.io.*;

public class PersonFromFile extends PersonDecoratorAbstract
{
	private String fileName;
	
	public PersonFromFile(Person objectToDecorate, String fileName)
	{
		super(objectToDecorate);
		this.fileName = fileName;
	}
	
	public void save()
	{
		try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(objectToDecorate.getFirstName() + "\n");
			writer.write(objectToDecorate.getLastName() + "\n");
			writer.close();
		}
		catch (Exception e)
		{
			System.out.println("Failed to save person to file!");
		}
	}
	
	public void load()
	{
		try
		{
			FileInputStream fstream = new FileInputStream(fileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String firstName = br.readLine();
			String lastName = br.readLine();
			fstream.close();
			objectToDecorate.setFirstName(firstName);
			objectToDecorate.setLastName(lastName);
		}
		catch (Exception e)
		{
			System.out.println("Failed to load person from file!");
		}		
	}
}
