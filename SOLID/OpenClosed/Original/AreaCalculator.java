// Example from this website: http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/

public class AreaCalculator
{
	public static float Area(Rectangle[] shapes)
	{
		float area = 0.0f;
		for (int i = 0; i < shapes.length; i++)
		{
			area += shapes[i].getHeight() * shapes[i].getWidth();
		}
		return area;
	}
}
