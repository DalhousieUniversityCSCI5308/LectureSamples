import java.util.List;
import java.util.ListIterator;

public class Store
{
	private final List<IProduct> allProducts;
	private final List<IPromotion> allPromotions;
	private static final float PROFIT_MARGIN = 0.30f;
	private final Address address;
	
	// INTRODUCE PARAMETER OBJECT
	public Store(IProductDatabase db, IPromotionDatabase promoDB, Address address)
	{
		allProducts = db.getAllProducts();
		allPromotions = promoDB.getAllPromotions();
		this.address = address;
	}
	
	public float calculateValueAllStock()
	{
		float sum = 0.0f;
		ListIterator<IProduct> iter = allProducts.listIterator();
		while (iter.hasNext())
		{
			IProduct product = iter.next();
			sum += product.calculateMaterialCost();
		}
		return sum;
	}
	
	private float getProductDiscount(IProduct product)
	{
		float discount = 0.0f;
		ListIterator<IPromotion> promotionIter = allPromotions.listIterator();
		while (promotionIter.hasNext())
		{
			IPromotion promotion = promotionIter.next();
			if (promotion.appliesToProduct(product))
			{
				discount = Math.max(discount, promotion.getPercentageDiscount());
			}
		}
		return discount;
	}
	
	public float calculateMarketValueAllStock()
	{
		float sum = 0.0f;
		ListIterator<IProduct> iter = allProducts.listIterator();
		while (iter.hasNext())
		{
			IProduct product = iter.next();
			float discount = getProductDiscount(product);
			float baseCost = product.calculateMaterialCost();
			float baseCostPlusProfitMargin = baseCost + (baseCost * PROFIT_MARGIN);
			sum += baseCostPlusProfitMargin - (baseCostPlusProfitMargin * discount);

			// REPLACE CONDITIONAL WITH POLYMORPHISM
			// Add cooking fee!
			float cookingFee = 0.0f;
			switch (product.getProductName().toLowerCase())
			{
				case "bread":
				{
					cookingFee = 1.00f;
					break;
				}
				case "apple pie":
				{
					cookingFee = 2.00f;
					break;
				}
				case "potato chips":
				{
					cookingFee = 1.50f;
					break;
				}
			}
			sum += cookingFee - (cookingFee * discount);
		}
		return sum;
	}
	
	// EXTRACT CLASS
	public String getContactInfo()
	{
		return address.buildContactInfoString();
	}
}