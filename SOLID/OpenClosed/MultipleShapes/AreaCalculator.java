// Example from this website: http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/

public class AreaCalculator
{
	public static float Area(Object[] shapes)
	{
		float area = 0.0f;
		for (int i = 0; i < shapes.length; i++)
		{
			if (shapes[i] instanceof Rectangle)
			{
				area += shapes[i].getHeight() * shapes[i].getWidth();
			}
			else if (shapes[i] instanceof Circle)
			{
				area += shapes[i].getRadius() * shapes[i].getRadius() * Math.PI;
			}
		}
		return area;
	}
}
