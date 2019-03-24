import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceDataValueWithObjectTest
{
	@Test
	public void testNumberOfOrdersForCustomer()
	{
		System.out.println("numberOfOrdersForCustomer");
		String customerName = "Fred";
		ReplaceDataValueWithObject instance = new ReplaceDataValueWithObject();
		int expResult = 2;
		int result = instance.numberOfOrdersForCustomer(customerName);
		assertEquals(expResult, result);
	}
}
