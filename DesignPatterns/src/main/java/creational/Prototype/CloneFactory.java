package creational.Prototype;

/*
	This Factory pattern uses a Prototype (Animal) to create new objects
	by cloning them in the MakeAnimal() method.
*/
public class CloneFactory implements IAnimalFactory
{
	private Animal originalExemplar;
	
	public CloneFactory(Animal exemplar)
	{
		originalExemplar = exemplar;
	}

	public Animal makeAnimal()
	{
		return (Animal)originalExemplar.clone();
	}
}