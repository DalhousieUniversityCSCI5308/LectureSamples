import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceTypeCodeWithSubclassesTest
{
	@Test
	public void testGetRedButtonColour()
	{
		System.out.println("getRedButtonColour");
		ReplaceTypeCodeWithSubclasses instance = new ReplaceTypeCodeWithSubclasses();
		String expResult = "#FF0000";
		String result = instance.getRedButtonColour();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetBlueButtonColour()
	{
		System.out.println("getBlueButtonColour");
		ReplaceTypeCodeWithSubclasses instance = new ReplaceTypeCodeWithSubclasses();
		String expResult = "#0000FF";
		String result = instance.getBlueButtonColour();
		assertEquals(expResult, result);
	}
}
