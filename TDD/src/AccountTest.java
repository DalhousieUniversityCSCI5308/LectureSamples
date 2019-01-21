public class AccountTest
{
	public static void constructorTest()
	{
		Account test = new Account();
		if (test.getBalance() == 0)
		{
			System.out.println("PASS - Constructor test");
		}
		else
		{
			System.out.println("FAIL - Constructor test");
		}
	}
	
	public static void depositTest()
	{
		Account test = new Account();
		test.deposit(10);
		if (test.getBalance() == 10)
		{
			System.out.println("PASS - Deposit test");
		}
		else
		{
			System.out.println("FAIL - Deposit test");
		}
	}
}
