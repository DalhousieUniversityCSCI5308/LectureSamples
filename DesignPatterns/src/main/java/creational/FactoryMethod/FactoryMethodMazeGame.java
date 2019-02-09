package creational.FactoryMethod;

import creational.*;

/*
	In the Factory Method diagram this would be the Creator
*/
public class FactoryMethodMazeGame
{
	private final Maze maze;
	
	public FactoryMethodMazeGame()
	{
		maze = createMaze();
	}
	
	public Maze getMaze()
	{
		return maze;
	}

	// Default factory method for making Maze objects.
	protected Maze makeMaze()
	{
		return new Maze();
	}
	
	// Default factory method for making Room objects.
	protected Room makeRoom(int roomNumber)
	{
		return new Room(roomNumber);
	}
	
	// Default factory method for making Door objects.
	protected Door makeDoor(Room room1, Room room2)
	{
		return new Door(room1, room2);
	}
	
	// Default factory method for making Wall objects.
	protected Wall makeWall()
	{
		return new Wall();
	}
	
	private Maze createMaze()
	{
		// As it stands this doesn't look much different from the original
		// MazeGame class, just the new's have been moved into methods.
		// However the power of the pattern comes into play by extending this
		// class and overriding the factory methods. See the
		// FactoryMethodExplosiveMazeGame class.  This same method will create
		// a regular maze game or an explosive maze game depending on which
		// class the client instantiates.
		Maze m = makeMaze();
		Room r1 = makeRoom(1);
		Room r2 = makeRoom(2);
		Door door = makeDoor(r1, r2);

		m.addRoom(r1);
		m.addRoom(r2);

		r1.setSide(Direction.NORTH, makeWall());
		r1.setSide(Direction.EAST, door);
		r1.setSide(Direction.SOUTH, makeWall());
		r1.setSide(Direction.WEST, makeWall());
		
		r2.setSide(Direction.NORTH, makeWall());
		r2.setSide(Direction.EAST, makeWall());
		r2.setSide(Direction.SOUTH, makeWall());
		r2.setSide(Direction.WEST, door);
		
		return m;
	}
}