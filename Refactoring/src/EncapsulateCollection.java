import java.util.*;

public class EncapsulateCollection 
{
	private class Student
	{
		private final List<String> courses;
		
		public Student()
		{
			courses = new ArrayList<String>();
		}
		
		// ENCAPSULATE COLLECTION
		// This class just gives away its secrets, exposing the list of courses to
		// users of the class.  This allows other objects to potentially add/remove
		// courses unbeknownst to the Student class.  Not usually something you want.
		public List<String> getCourses()
		{
			return courses;
		}
	}
	
	private final Student student;
	
	public EncapsulateCollection()
	{
		student = new Student();
		student.getCourses().add("English");
		student.getCourses().add("French");
		student.getCourses().add("Calculus");
		student.getCourses().add("Music");
	}
	
	public boolean isStudentTakingCalculus()
	{
		ListIterator<String> iter = student.getCourses().listIterator();
		while (iter.hasNext())
		{
			String course = iter.next();
			if (course.equalsIgnoreCase("calculus"))
			{
				return true;
			}
		}
		return false;
	}
}
