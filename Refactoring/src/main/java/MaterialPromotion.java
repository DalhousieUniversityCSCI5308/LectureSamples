public class MaterialPromotion implements IPromotion
{
	private final String materialName;
	
	public MaterialPromotion(String materialName)
	{
		this.materialName = materialName;
	}
	
	public boolean appliesToProduct(IProduct product)
	{
		IMaterial material = product.getMaterialWithName(materialName);
		if (null != material)
		{
			if (material.isDiscountable())
			{
				return true;
			}
		}
		return false;
	}

	public float getPercentageDiscount()
	{
		return 0.20f;
	}
}