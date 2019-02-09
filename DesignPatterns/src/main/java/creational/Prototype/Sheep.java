package creational.Prototype;

public class Sheep extends Animal implements ICloneable
{
	public Sheep(String noise)
	{
		super("Baaaah");
	}

	@Override
	public Object clone()
	{
		return new Sheep(noiseIMake);
	}
}