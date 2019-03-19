import org.junit.Test;
import static org.junit.Assert.*;

public class IntroduceForeignMethodTest
{
	@Test
	public void testBuildMessage() {
		System.out.println("buildMessage");
		IntroduceForeignMethod instance = new IntroduceForeignMethod("2019-01-01");
		String expResult = "Today is: 2019-01-01\nTomorrow is: 2019-01-02";
		String result = instance.buildMessage();
		assertEquals(expResult, result);
	}
}
