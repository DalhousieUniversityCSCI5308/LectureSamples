import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;

public class DecomposeConditionalTest
{
	@Test
	public void testGetAmountToCharge()
	{
		System.out.println("getAmountToCharge");
		int quantity = 1;
		DecomposeConditional instance = new DecomposeConditional();
		float expResult;
		Calendar cal = Calendar.getInstance();
		if (cal.get(Calendar.MONTH) < 5 || cal.get(Calendar.MONTH) > 8)
		{
			expResult = 12.0f;
		}
		else
		{
			expResult = 1.0f;
		}
		float result = instance.getAmountToCharge(quantity);
		assertEquals(expResult, result, 0.0);
	}	
}
