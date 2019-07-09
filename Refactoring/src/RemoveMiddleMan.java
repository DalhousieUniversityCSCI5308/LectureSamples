public class RemoveMiddleMan
{
	public class Department
	{
		private final Person manager;
		
		public Department(Person manager)
		{
			this.manager = manager;
		}
		
		public Person getManager()
		{
			return manager;
		}
	}
	
	public class Person
	{
		private final String name;
		private Department department;
		
		public Person(String name)
		{
			this.name = name;
		}
		
		public void setDepartment(Department department)
		{
			this.department = department;
		}
		
		public Department getDepartment()
		{
			return department;
		}
		
		// REMOVE MIDDLE MAN
		// Person is a middle man to the Department class getManager() method.
		// NOTE:  You only want to use this refactoring when the class that is the
		//        middle man is doing way too much delegation and that has become
		//        problematic to your code's design.
		public Person getManager()
		{
			return department.getManager();
		}
		
		public String getName()
		{
			return name;
		}
	}
		
	public Person getJoesManager()
	{
		Person joe = new Person("Joe");
		Person fred = new Person("Fred");
		Department d = new Department(fred);
		joe.setDepartment(d);
		// Here the middle man is helping avoid violation of the law of demeter,
		// observe what happens when we remove the middle man.
		return joe.getManager();
	}
}
