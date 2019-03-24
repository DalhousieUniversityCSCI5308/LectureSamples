// Note:  I've only got these classes as part of the FormTemplateMethod class to
//        make it easier to find this refactoring in the samples.  In practice
//        do not nest classes unless you have a very good reason to do so, it
//        complicates reuse, and reuse is our ultimate objective at all times.
public class FormTemplateMethod
{
	private class Base
	{
		
	}
	
	private class LowerCaseHeader extends Base
	{
		// FORM TEMPLATE METHOD
		// This class and UpperCaseHeader have *almost* identical methods!
		public String formatHeader(String header)
		{
			String result = "<H1>";
			result += header.toLowerCase();
			result += "</H1>";
			return result;
		}
	}
	
	private class UpperCaseHeader extends Base
	{
		// FORM TEMPLATE METHOD
		// This class and LowerCaseHeader have *almost* identical methods!
		public String formatHeader(String header)
		{
			String result = "<H1>";
			result += header.toUpperCase();
			result += "</H1>";
			return result;
		}
	}
	
	public String getLowerCaseHeader(String header)
	{
		LowerCaseHeader h = new LowerCaseHeader();
		return h.formatHeader(header);
	}
	
	public String getUpperCaseHeader(String header)
	{
		UpperCaseHeader h = new UpperCaseHeader();
		return h.formatHeader(header);
	}
}
