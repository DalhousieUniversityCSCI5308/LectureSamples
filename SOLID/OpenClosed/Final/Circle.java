// Example from this website: http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/
public class Circle implements IShape
{
	private float radius;
	
	public Circle(float radius)
	{
		this.radius = radius;
	}
	
	public float getRadius()
	{
		return radius;
	}
	
	public float area()
	{
		return radius * radius * Math.PI;
	}
}
