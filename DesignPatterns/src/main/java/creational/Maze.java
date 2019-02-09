package creational;

import java.util.ArrayList;

public class Maze
{
	protected ArrayList<Room> rooms;

	public Maze()
	{
		rooms = new ArrayList<Room>();
	}
	
	public void addRoom(Room room)
	{
		rooms.add(room);
	}
	
	public Room getRoom(int roomNumber)
	{
		for (int i = 0; i < rooms.size(); i++)
		{
			if (rooms.get(i).roomNumber == roomNumber)
			{
				return rooms.get(i);
			}
		}
		return null;
	}
}