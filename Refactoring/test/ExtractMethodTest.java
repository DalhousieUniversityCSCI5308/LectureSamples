import org.junit.Test;
import static org.junit.Assert.*;

public class ExtractMethodTest {
	
	public ExtractMethodTest() {
	}

	@Test
	public void encryptTest()
	{
		ExtractMethod em = new ExtractMethod();
		String result = em.encrypt("encrypt this text", "secret");
		assertEquals("yI6PIqxboGueWeIuVO2JpZ7UPQ43xuiTGjY4TU5vC/c=", result);
	}
	
	@Test
	public void decryptTest()
	{
		ExtractMethod em = new ExtractMethod();
		String result = em.decrypt("yI6PIqxboGueWeIuVO2JpZ7UPQ43xuiTGjY4TU5vC/c=", "secret");
		assertEquals("encrypt this text", result);
	}
}
