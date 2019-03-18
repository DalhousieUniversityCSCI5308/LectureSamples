import java.util.List;

public class BreadProduct extends Product
{
	public BreadProduct(String name, List<IMaterial> materialList, List<Integer> materialUnitCounts)
	{
		super(name, materialList, materialUnitCounts);
	}

	@Override
	public float getCookingFee()
	{
		return 1.00f;
	}
}
