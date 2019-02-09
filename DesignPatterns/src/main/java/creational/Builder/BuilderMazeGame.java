package creational.Builder;

import creational.*;

/*
	In this package the BuilderMazeGame class is the "Director",
	we use dependency injection to inject the builder we want this
	class to use.
*/
public class BuilderMazeGame
{
	private final MazeBuilder builder;

	public BuilderMazeGame(MazeBuilder builder)
	{
		this.builder = builder;
	}
	
	public Maze createMaze()
	{
		// Compare and contrast this method with AbstractFactoryMazeGame.createMaze()
		// Notice how all the complexity involved in the internal construction of the
		// Maze object has been moved to the StandardMazeBuilder object.  We have
		// hidden the internal representation of the Maze object from this class.
		// This class has no idea that the Maze object has an addRoom() method, or
		// that Rooms have a setSide() method.  That is all the business of the builder.
		builder.buildMaze();
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
		return builder.getMaze();
	}
	
	public Maze createLargeMaze(int numberOfRooms)
	{
		// Here the director is using its knowledge of the Builder interface
		// to construct a very large maze.  It can do this with the same builder
		// createMaze() uses because the interface is common and the rules have
		// not changed.
		builder.buildMaze();
		int numIterations = numberOfRooms / 2;
		for (int i = 0; i < numIterations; i++)
		{
			int nextRoom = i + 1;
			builder.buildRoom(i);
			builder.buildRoom(nextRoom);
			builder.buildDoor(i, nextRoom);
		}
		return builder.getMaze();
	}
}