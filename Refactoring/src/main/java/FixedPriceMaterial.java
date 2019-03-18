public class FixedPriceMaterial extends Material
{
	public FixedPriceMaterial(String name, float baseCost)
	{
		super(name, baseCost);
	}

	@Override
	public boolean isDiscountable()
	{
		return false;
	}
}
