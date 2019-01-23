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
		test.deposit(10);
		if (test.getBalance() == 20)
		{
			System.out.println("PASS - Deposit test");
		}
		else
		{
			System.out.println("FAIL - Deposit test");
		}		
	}
	
	public static void withdrawTest()
	{
		Account test = new Account();
		try
		{
			test.withdraw(5);
		}
		catch (Exception e)
		{
			System.out.println("PASS - Failed due to insufficient funds.");
		}
		try
		{
			test.withdraw(5);
		}
		catch (Exception e)
		{
			test.deposit(5);
			try
			{
				test.withdraw(5);
			}
			catch (Exception ex)
			{
				System.out.println("FAIL - Something is wrong with withdrawal logic");
			}
		}
		if (test.getBalance() == 0)
		{
			System.out.println("PASS - Withdraw test");
		}
		else
		{
			System.out.println("FAIL - Withdraw test");
		}
	}
}







