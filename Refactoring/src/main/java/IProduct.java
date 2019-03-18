import java.util.List;

public interface IProduct
{
	public float calculateMaterialCost();
	public String getProductName();
	public List<IMaterial> getMaterials();
	public IMaterial getMaterialWithName(String name);
	public float getCookingFee();
}