// Example from this website: http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/

// This class adheres to the Open/Closed principle. It never needs to change, for the rest of time
// this class can calculate the total area of any objects passed to it, so long as those objects
// implement the area() method of the IShape interface contract.
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
