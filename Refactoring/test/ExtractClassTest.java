import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class ExtractClassTest {
	private ExtractClass user = null;
		
	@Before
	public void setUp()
	{
		user = new ExtractClass(1,
				  "rhawkey@dal.ca", 
				  "bleh",
				  "123 street",
				  "Halifax",
				  "Nova Scotia",
				  "Canada", 
				  "H0H0H0");
	}

	@Test
	public void testIsPasswordCorrect()
	{
		System.out.println("isPasswordCorrect");
		assertEquals(true, user.isPasswordCorrect("bleh"));
	}

	@Test
	public void testIsCanadian()
	{
		System.out.println("isCanadian");
		assertEquals(true, user.isCanadian());
	}
}
