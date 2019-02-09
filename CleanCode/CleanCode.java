import java.util.*;

public class CleanCode
{

	// Example of lack of boundary condition encapsulation
	public void strangeCalculationFunction(int values[])
	{
		for (int i = 0; i < values.length; i++)
		{
			if (i > 0)
			{
				values[i] += values[i - 1];
			}
			if (i + 1 < values.length && i > 0)
			{
				values[i] -= values[i + 1] - values[i - 1];
			}
		}
	}

	// Example of encapsulation of boundary conditions
	public void strangeCalculationFunction2(int values[])
	{
		for (int i = 0; i < values.length; i++)
		{
			if (i > 0)
			{
				int indexBefore = i - 1;
				int indexAfter = i + 1;
				values[i] += values[indexBefore];
				if (indexAfter < values.length)
				{
					values[i] -= values[indexAfter] - values[indexBefore];
				}
			}
		}
	}

	// Example of lack of explanatory variables
	public void lackOfExplanatoryVariable(HashMap<String, String> dictionary, String firstName, String lastName)
	{
		// A user's key is their first name and last name separated by an underscore.
		if (dictionary.containsKey(firstName + "_" + lastName))
		{
			System.out.println(firstName + " " + lastName + "'s value is: ");
			System.out.println(dictionary.get(firstName + "_" + lastName));
		}
	}

	// Example of proper use of explanatory variable
	public void goodExplanatoryVariable(HashMap<String, String> dictionary, String firstName, String lastName)
	{
		String userKey = firstName + "_" + lastName;
		if (dictionary.containsKey(userKey))
		{
			System.out.println(firstName + " " + lastName + "'s value is:");
			System.out.println(dictionary.get(userKey));
		}
	}

}