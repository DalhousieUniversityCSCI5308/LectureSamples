import org.junit.Test;
import static org.junit.Assert.*;

public class EncapsulateCollectionTest
{
	@Test
	public void testIsStudentTakingCalculus()
	{
		System.out.println("isStudentTakingCalculus");
		EncapsulateCollection instance = new EncapsulateCollection();
		boolean expResult = true;
		boolean result = instance.isStudentTakingCalculus();
		assertEquals(expResult, result);
	}
	
}
