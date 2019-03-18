import java.util.List;

public class ChipsProduct extends Product
{
	public ChipsProduct(String name, List<IMaterial> materialList, List<Integer> materialUnitCounts)
	{
		super(name, materialList, materialUnitCounts);
	}

	@Override
	public float getCookingFee()
	{
		return 1.50f;
	}
}
