import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveMiddleManTest
{
	@Test
	public void testGetJoesManager()
	{
		System.out.println("getJoesManager");
		RemoveMiddleMan instance = new RemoveMiddleMan();
		RemoveMiddleMan.Person result = instance.getJoesManager();
		assertEquals("Fred", result.getName());
	}
}
