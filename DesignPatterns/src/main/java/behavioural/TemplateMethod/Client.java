package behavioural.TemplateMethod;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Client
{
	public Client()
	{
		// Here the client will use my Template Method (sortMovies())
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("Fight Club"));
		movieList.add(new Movie("Star Wars"));
		movieList.add(new Movie("Air Force One"));
		movieList.add(new Movie("Back To The Future"));
		Movie.sortMovies(movieList);
		for (int i = 0; i < movieList.size(); i++)
		{
			System.out.println(movieList.get(i).title);
		}
		
		// Here the client will use Java's built in sorting algorithms.
		movieList = new ArrayList<Movie>();
		movieList.add(new Movie("Frozen"));
		movieList.add(new Movie("Spider Man"));
		movieList.add(new Movie("La La Land"));
		movieList.add(new Movie("The Big Easy"));
		Collections.sort(movieList);
		for (int i = 0; i < movieList.size(); i++)
		{
			System.out.println(movieList.get(i).title);
		}
	}
}