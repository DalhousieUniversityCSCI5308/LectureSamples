public class ReplaceConditionalWithPolymorphism
{
	private enum EmployeeType
	{
		MANAGER,
		SALESPERSON,
		PROGRAMMER		
	}
	
	private class Employee
	{
		private final float monthlySalary;
		private float commission;
		private float bonus;
		private final EmployeeType employeeType;
		
		public Employee(EmployeeType employeeType, float monthlySalary)
		{
			this.employeeType = employeeType;
			this.monthlySalary = monthlySalary;
			commission = 0.0f;
			bonus = 0.0f;
		}
		
		public void setCommission(float commission)
		{
			this.commission = commission;
		}
		
		public void setBonus(float bonus)
		{
			this.bonus = bonus;
		}
		
		// REPLACE CONDITIONAL WITH POLYMORPHISM
		public float payAmount()
		{
			switch (employeeType)
			{
				case MANAGER:
				{
					return monthlySalary + bonus;
				}
				case SALESPERSON:
				{
					return monthlySalary + commission;
				}
				case PROGRAMMER:
				{
					return monthlySalary;
				}
			}
			return 0.0f;
		}
	}
	
	public float getProgrammerSalary()
	{
		Employee e = new Employee(EmployeeType.PROGRAMMER, 8000.0f);
		return e.payAmount();
	}
	
	public float getManagerSalary()
	{
		Employee e = new Employee(EmployeeType.MANAGER, 10000.0f);
		e.setBonus(100.0f);
		return e.payAmount();
	}
	
	public float getSalesPersonSalary()
	{
		Employee e = new Employee(EmployeeType.SALESPERSON, 7000.0f);
		e.setCommission(1000.0f);
		return e.payAmount();
	}
}
