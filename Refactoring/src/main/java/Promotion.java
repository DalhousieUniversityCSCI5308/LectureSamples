import java.util.List;
import java.util.ListIterator;

public class Promotion implements IPromotion
{
	@SuppressWarnings("unused")
	private final String name;
	private final List<String> productNames;
	private final float discount;	

	public Promotion(String name, List<String> applicableProductNames, float discount)
	{
		this.name = name;
		this.productNames = applicableProductNames;
		this.discount = discount;
	}

	public boolean appliesToProduct(IProduct product)
	{
		ListIterator<String> iter = productNames.listIterator();
		while (iter.hasNext())
		{
			String productName = iter.next();
			if (productName.equalsIgnoreCase(product.getProductName()))
			{
				return true;
			}
		}
		return false;
	}

	public float getPercentageDiscount()
	{
		return discount;
	}	
}