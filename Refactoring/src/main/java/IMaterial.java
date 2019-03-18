public interface IMaterial
{
	public String getMaterialName();
	public float getCost(int units);
	public boolean isDiscountable();
}