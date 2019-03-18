import java.util.List;
import java.util.ArrayList;

public class PromotionDatabaseMock implements IPromotionDatabase
{
	public List<IPromotion> getAllPromotions()
	{
		List<IPromotion> promotions = new ArrayList<IPromotion>();
		List<String> productNames = new ArrayList<String>();
		productNames.add("bread");
		promotions.add(new Promotion("bread sale", productNames, 0.10f));
		promotions.add(new MaterialPromotion("milk"));
		return promotions;
	}	
}