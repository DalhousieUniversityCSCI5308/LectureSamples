import org.junit.Test;
import static org.junit.Assert.*;

public class IntroduceParameterObjectTest
{
	@Test
	public void testGetSampleOrderTotal()
	{
		System.out.println("getSampleOrderTotal");
		IntroduceParameterObject instance = new IntroduceParameterObject();
		float expResult = 10.0F;
		float result = instance.getSampleOrderTotal();
		assertEquals(expResult, result, 0.0);
	}
}
