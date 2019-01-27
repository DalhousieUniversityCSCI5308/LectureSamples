public class Printer implements ISmartDevice
{
	@Override
	public void print()
	{
		System.out.println("Printing!");
	}
	
	@Override
	public void fax()
	{
		// Not supported!
	}
	
	@Override
	public void scan()
	{
		// Not supported!
	}
}