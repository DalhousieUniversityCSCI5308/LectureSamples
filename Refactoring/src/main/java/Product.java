import java.util.List;
import java.util.ListIterator;

public class Product implements IProduct
{
	// REPLACE DATA VALUE WITH OBJECT (Materials + Unit Counts, replace with collection object)
	private final List<IMaterial> materials;
	private final List<Integer> unitCounts;
	private final String name;

	public Product(String name, List<IMaterial> materialList, List<Integer> materialUnitCounts)
	{
		this.name = name;
		this.materials = materialList;
		this.unitCounts = materialUnitCounts;
	}
	
	public float calculateMaterialCost()
	{
		float sum = 0.0f;
		for (int i = 0; i < materials.size(); i++)
		{
			IMaterial material = materials.get(i);
			int count = unitCounts.get(i);
			sum += material.getCost(count);
		}
		return sum;
	}

	public String getProductName()
	{
		return name;
	}

	public List<IMaterial> getMaterials()
	{
		return materials;
	}

	public IMaterial getMaterialWithName(String name)
	{
		ListIterator<IMaterial> iter = materials.listIterator();
		while (iter.hasNext())
		{
			IMaterial material = iter.next();
			if (material.getMaterialName().equalsIgnoreCase(name))
			{
				return material;
			}
		}
		return null;
	}

	public float getCookingFee()
	{
		return 0.0f;
	}
}