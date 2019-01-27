// Example from this website: http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/

public class AreaCalculator
{
	public static float Area(IShape[] shapes)
	{
		float area = 0.0f;
		for (int i = 0; i < shapes.length; i++)
		{
			area += shapes[i].area();
		}
		return area;
	}
}
