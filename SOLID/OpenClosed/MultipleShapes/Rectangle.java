// Example from this website: http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/

public class Rectangle
{
	private float height;
	private float width;

	public RectangleOpen(float height, float width)
	{
		this.height = height;
		this.width = width;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public float getWidth()
	{
		return width;
	}
}