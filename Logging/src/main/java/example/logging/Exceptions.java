package example.logging;

public class Exceptions
{
	public void doSomething()
	{
		/*
			Don't divide your exceptions unless you are wrapping code that could trigger
			specific exceptions you want to handle in different ways.  Do this:
		*/
		try
		{
			doA();
			doB();
			doC();
			doD();
			doE();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
		
		// Not this:
		try
		{
			doA();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
		try
		{
			doB();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
		try
		{
			doC();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
		try
		{
			doD();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
		try
		{
			doE();
		}
		catch (Exception ex)
		{
			System.out.println("Exception thrown:" + ex.getMessage());
		}
	}
	
	public void doSomething2() throws Exception
	{
		// Do not throw out the original exception when you are considering
		// throwing a new exception or adding to the exception.  For example
		// do not do this:
		try
		{
			doA();
		}
		catch (Exception ex)
		{
			throw new Exception("An exception happened in DoSomething2(): " + ex.getMessage());
		}
		
		// If you want to add to an exception make sure you preserve the original
		// exception as an inner exception so that all the error information is
		// preserved:
		try
		{
			doA();
		}
		catch (Exception ex)
		{
			// Notice how I'm passing the exception to the constructor, this sets it
			// as the inner exception and makes it visible if we're debugging or if
			// we decide to log it later on.
			throw new Exception("An exception happened in doSomething2(): " + ex.getMessage(), ex);
		}
	}
	
	public void doA() throws Exception { throw new Exception("doA() error"); }
	public void doB() {}
	public void doC() {}
	public void doD() {}
	public void doE() {}
}