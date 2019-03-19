// Borrowed this example from https://lostechies.com/seanchambers/2009/08/02/refactoring-day-2-move-method/

public class MoveMethod
{
	private class AccountInterest
	{
		private final BankAccount account;
		
		public AccountInterest(BankAccount account)
		{
			this.account = account;
		}
		
		public double interestRate()
		{
			// Note how this method is envious of account
			return account.calculateInterestRate();
		}
		
		public boolean isIntroductoryRate()
		{
			// Note how this method is envious of account
			return account.calculateInterestRate() < 0.05;
		}
	}
	private class BankAccount
	{
		private final int age;
		private final int creditScore;
		
		public BankAccount(int accountAge, int creditScore)
		{
			this.age = accountAge;
			this.creditScore = creditScore;
		}
		
		public int getAccountAge()
		{
			return age;
		}
		
		public int getCreditScore()
		{
			return creditScore;
		}
		
		// MOVE METHOD
		// 2 options: remove entirely or delegate
		public double calculateInterestRate()
		{
			if (creditScore > 800)
			{
				return 0.02;
			}
			if (age > 10)
			{
				return 0.03;
			}
			return 0.05f;
		}
	}
	
	public double calculateInterestRate(int accountAge, int creditScore)
	{
		BankAccount account = new BankAccount(accountAge, creditScore);
		return account.calculateInterestRate();
	}
}
