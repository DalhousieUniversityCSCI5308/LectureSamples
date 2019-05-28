// The Printer class now only needs to implement the one contract
// it is able to fulfill.
public class Printer implements IPrinter
{
	@Override
	public void print()
	{
		System.out.println("Printing!");
	}
}