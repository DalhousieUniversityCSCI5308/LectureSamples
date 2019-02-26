package structural.Decorator;

public abstract class PersonDecoratorAbstract implements IPersonPersistence
{
	protected Person objectToDecorate;
	
	public PersonDecoratorAbstract(Person objectToDecorate)
	{
		this.objectToDecorate = objectToDecorate;
	}
	
	public abstract void save();
	public abstract void load();
}
