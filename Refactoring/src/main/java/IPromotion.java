public interface IPromotion
{
	public boolean appliesToProduct(IProduct product);
	public float getPercentageDiscount();
}