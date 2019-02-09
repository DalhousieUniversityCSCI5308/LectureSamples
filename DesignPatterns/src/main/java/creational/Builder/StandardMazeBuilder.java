package creational.Builder;

import creational.*;
import java.util.Random;

/*
	Take note that this StandardMazeBuilder has the freedom
	to choose what kind of Maze it builds, and how it builds it.
	It could build a maze with some regular rooms and some explosive
	rooms for example, it has complete power over the construction.
*/
public class StandardMazeBuilder extends MazeBuilder
{
	private Maze maze;
	
	public StandardMazeBuilder()
	{
		maze = null;
	}
	
	public void buildMaze()
	{		
		maze = new Maze();
	}
	
	public void buildRoom(int roomNumber)
	{
		// Make sure the maze has been built, and this room
		// hasn't already been added.
		assert(maze != null);
		assert(null == maze.getRoom(roomNumber));
		Room room = new Room(roomNumber);
		maze.addRoom(room);
		// The room is walled off until the director builds doors.
		room.setSide(Direction.NORTH, new Wall());
		room.setSide(Direction.SOUTH, new Wall());
		room.setSide(Direction.EAST, new Wall());
		room.setSide(Direction.WEST, new Wall());
	}
	
	public void buildDoor(int roomFrom, int roomTo)
	{
		assert(maze != null);
		Room room1 = maze.getRoom(roomFrom);
		Room room2 = maze.getRoom(roomTo);
		if (room1 != null && room2 != null)
		{
			Door door = new Door(room1, room2);
			// Pick a random side for the door.
			Random random = new Random();
			float rand = random.nextFloat();
			if (rand < 0.25f)
			{
				room1.setSide(Direction.NORTH, door);
				room2.setSide(Direction.SOUTH, door);		
			}
			else if (rand < 0.5f)
			{
				room1.setSide(Direction.SOUTH, door);
				room2.setSide(Direction.NORTH, door);		
			}
			else if (rand < 0.75f)
			{
				room1.setSide(Direction.EAST, door);
				room2.setSide(Direction.WEST, door);		
			}
			else
			{
				room1.setSide(Direction.WEST, door);
				room2.setSide(Direction.EAST, door);		
			}
		}
	}

	@Override
	public Maze getMaze()
	{
		return maze;
	}
}