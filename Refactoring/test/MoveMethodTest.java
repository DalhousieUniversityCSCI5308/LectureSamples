import org.junit.Test;
import static org.junit.Assert.*;

public class MoveMethodTest
{
	@Test
	public void testCalculateInterestRate()
	{
		System.out.println("calculateInterestRate");
		int accountAge = 1;
		int creditScore = 900;
		MoveMethod instance = new MoveMethod();
		double expResult = 0.02;
		double result = instance.calculateInterestRate(accountAge, creditScore);
		assertEquals(expResult, result, 0.0);
	}
}
