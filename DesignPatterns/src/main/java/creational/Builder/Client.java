package creational.Builder;

import creational.*;

/*
	The Client class instantiates the Director class with the specific
	builder it wants the Director to use, then asks the Director
	to use the builder to build the kind of maze it wants.

	Pay attention to the fact that the Client has no idea how anything
	is done, all it knows is that it wants a certain kind of maze, and
	the Director and Builder will take care of the details.
*/
public class Client
{
	private Maze maze;
	private MazeBuilder builder;
	private BuilderMazeGame game;

	public Client()
	{
		builder = new StandardMazeBuilder();
		game = new BuilderMazeGame(builder);
	}
	
	public Maze getMaze()
	{
		return maze;
	}
	
	public void playSimpleGame()
	{
		// Build a simple maze
		maze = game.createMaze();
	}
	
	public void playDifficultGame()
	{
		// Now build a big maze!
		maze = game.createLargeMaze(10000);
	}
}