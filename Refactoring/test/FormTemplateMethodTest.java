import org.junit.Test;
import static org.junit.Assert.*;

public class FormTemplateMethodTest {
	
	@Test
	public void getLowerCaseHeaderTest()
	{
		FormTemplateMethod t = new FormTemplateMethod();
		String result = t.getLowerCaseHeader("Hello World!");
		assertEquals("<H1>hello world!</H1>", result);
	}
	
	@Test
	public void getUpperCaseHeaderTest()
	{
		FormTemplateMethod t = new FormTemplateMethod();
		String result = t.getUpperCaseHeader("Hello World!");
		assertEquals("<H1>HELLO WORLD!</H1>", result);
	}
}
