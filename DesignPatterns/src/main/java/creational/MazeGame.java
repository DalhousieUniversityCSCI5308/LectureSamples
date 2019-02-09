package creational;

public class MazeGame
{
	private final Maze maze;
	
	public MazeGame()
	{
		maze = createMaze();
	}
	
	public Maze getMaze()
	{
		return maze;
	}
	
	private Maze createMaze()
	{
		// You can tell just by looking at this code that it smells right?
		Maze m = new Maze();
		Room r1 = new Room(1);
		Room r2 = new Room(2);
		Door door = new Door(r1, r2);

		m.addRoom(r1);
		m.addRoom(r2);

		r1.setSide(Direction.NORTH, new Wall());
		r1.setSide(Direction.EAST, door);
		r1.setSide(Direction.SOUTH, new Wall());
		r1.setSide(Direction.WEST, new Wall());
		
		r2.setSide(Direction.NORTH, new Wall());
		r2.setSide(Direction.EAST, new Wall());
		r2.setSide(Direction.SOUTH, new Wall());
		r2.setSide(Direction.WEST, door);
		
		return m;
	}
}