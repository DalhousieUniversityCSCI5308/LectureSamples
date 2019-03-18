public abstract class Material implements IMaterial
{	
	private final float baseCost;
	private final String name;
	
	public Material(String name, float baseCost)
	{
		this.name = name;
		this.baseCost = baseCost;
	}

	public String getMaterialName()
	{
		return name;
	}

	public float getCost(int units)
	{
		return baseCost * units;
	}

	public abstract boolean isDiscountable();
}