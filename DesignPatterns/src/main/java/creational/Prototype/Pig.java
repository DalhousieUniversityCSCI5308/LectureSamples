package creational.Prototype;

public class Pig extends Animal implements ICloneable
{
	public Pig(String noise)
	{
		super("Oink");
	}

	@Override
	public Object clone()
	{
		return new Pig(noiseIMake);
	}
}