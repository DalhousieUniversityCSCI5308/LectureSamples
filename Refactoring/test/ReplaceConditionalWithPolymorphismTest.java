import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceConditionalWithPolymorphismTest
{
	@Test
	public void testGetProgrammerSalary()
	{
		System.out.println("getProgrammerSalary");
		ReplaceConditionalWithPolymorphism instance = new ReplaceConditionalWithPolymorphism();
		float expResult = 8000.0F;
		float result = instance.getProgrammerSalary();
		assertEquals(expResult, result, 0.0);
	}

	@Test
	public void testGetManagerSalary()
	{
		System.out.println("getManagerSalary");
		ReplaceConditionalWithPolymorphism instance = new ReplaceConditionalWithPolymorphism();
		float expResult = 10100.0F;
		float result = instance.getManagerSalary();
		assertEquals(expResult, result, 0.0);
	}

	@Test
	public void testGetSalesPersonSalary() {
		System.out.println("getSalesPersonSalary");
		ReplaceConditionalWithPolymorphism instance = new ReplaceConditionalWithPolymorphism();
		float expResult = 8000.0F;
		float result = instance.getSalesPersonSalary();
		assertEquals(expResult, result, 0.0);
	}
	
}
