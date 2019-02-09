package creational.AbstractFactory;

import creational.*;
import java.util.Random;

public class ExplosiveRoom extends Room
{
	private final boolean isExplosive;
	
	public ExplosiveRoom(int roomNumber)
	{
		super(roomNumber);
		Random random = new Random();
		// 10% of ExplosiveRooms are explosive!
		isExplosive = (random.nextFloat() <= 0.1f);
	}
	
	@Override
	public void enter()
	{
		if (isExplosive)
		{
			System.out.println("Entered room: " + Integer.toString(roomNumber) +
									 " EXPLOSION!!!  KABOOM!!!");
		}
		else
		{
			super.enter();
		}
	}
}