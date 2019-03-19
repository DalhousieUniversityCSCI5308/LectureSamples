import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntroduceExplainingVariableTest {
	
	@Test
	public void testCalculateInsurancePremium() {
		System.out.println("calculateInsurancePremium");
		List<String> habits = new ArrayList<String>();
		habits.add("smoking");
		IntroduceExplainingVariable instance = new IntroduceExplainingVariable();
		float expResult = 2.0f;
		float result = instance.calculateInsurancePremium(habits);
		assertEquals(expResult, result, 0.0);
	}
}
