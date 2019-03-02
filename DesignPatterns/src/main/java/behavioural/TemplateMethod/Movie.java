package behavioural.TemplateMethod;

import java.lang.Comparable;
import java.util.List;

public class Movie implements Comparable<Movie>
{
	public String title;
	
	public Movie(String title)
	{
		this.title = title;
	}
	
	// The Comparable interface built into Java provides us a primitive operation
	// any class can introduce to then make use of existing Java sort algorithms.
	// Those algorithms are fixed and never change, they are template methods,
	// no matter what object is passed to them they simply call the compareTo() 
	// method on that object knowing it must implement the Comparable interface.
	public int compareTo(Movie o)
	{
		return title.compareToIgnoreCase(o.title);
	}
	
	// Here is a template method showing that the Java sort algorithm might look like.
	// The method defines an algorithm with a primitive operation that can be overridden
	// by subclasses to change the behaviour.
	public static final void sortMovies(List<Movie> movieList)
	{
		// Crappy bubble sort.
		for (int i = 0; i < movieList.size(); i++)
		{
			for (int j = 1; j < movieList.size() - i; j++)
			{
				int indexBeforeJ = j - 1;
				Movie o1 = movieList.get(indexBeforeJ);
				Movie o2 = movieList.get(j);
				// Here's the primitive operation that can be overridden.
				if (o1.compareTo(o2) > 0)
				{
					movieList.remove(indexBeforeJ);
					movieList.add(j, o1);
				}
			}
		}
	}
}