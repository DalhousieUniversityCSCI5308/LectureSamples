public class Main
{
	public static void main(String[] args)
	{
		TransportationDevice device = new Car();
		device.move();
		
		device = new Bicycle();
		device.move();
	}
}
