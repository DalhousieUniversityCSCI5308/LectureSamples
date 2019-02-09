package creational.AbstractFactory;

import creational.*;

public class AbstractFactoryMazeGame
{
	private final Maze maze;
	
	public AbstractFactoryMazeGame()
	{
		maze = createMaze();
	}
	
	public Maze getMaze()
	{
		return maze;
	}
	
	/*
		Here we are seeing the implementation of the client.  The client is using
		all interfaces, except in this example the client is making a choice
		to use the ExplosiveMazeFactory, it doesn't have to make that choice though
		I could use dependency injection here and get passed the factory I should use
		and have the choice be made somewhere else if that's better.
	*/
	private Maze createMaze()
	{
		// Instantiate the factory from the singleton.
		IMazeFactory factory = ExplosiveMazeFactory.FactorySingleton();
		
		// Notice the lack of "new" calls here, now the factory instantiates everything
		// making all the choices.  Also notice that from here on we're using the base
		// "abstract" Maze, Room, Door and Wall classes.  They will be Explosive versions
		// but we don't know that, we don't need to know it, and by not knowing it we're
		// very loosely coupled to the explosive set of classes.
		Maze m = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door door = factory.makeDoor(r1, r2);

		m.addRoom(r1);
		m.addRoom(r2);

		r1.setSide(Direction.NORTH, factory.makeWall());
		r1.setSide(Direction.EAST, door);
		r1.setSide(Direction.SOUTH, factory.makeWall());
		r1.setSide(Direction.WEST, factory.makeWall());
		
		r2.setSide(Direction.NORTH, factory.makeWall());
		r2.setSide(Direction.EAST, factory.makeWall());
		r2.setSide(Direction.SOUTH, factory.makeWall());
		r2.setSide(Direction.WEST, door);
		
		return m;
	}
}