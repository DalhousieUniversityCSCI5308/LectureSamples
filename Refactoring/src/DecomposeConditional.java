import java.util.Calendar;

public class DecomposeConditional
{
	private final float WINTER_RATE = 2.0f;
	private final float SUMMER_RATE = 1.0f;
	private final float WINTER_SERVICE_CHARGE = 10.0f;
	
	// DECOMPOSE CONDITIONAL
	// As methods grow longer complex conditionals become harder to read and maintain
	// when code is hard to read it leaves the possibility of introducing bugs at a
	// higher level than when code is simple and easy to read.
	public float getAmountToCharge(int quantity)
	{
		Calendar calendar = Calendar.getInstance();
		if (calendar.get(Calendar.MONTH) < 5 || calendar.get(Calendar.MONTH) > 8)
		{
			return quantity * WINTER_RATE + WINTER_SERVICE_CHARGE;
		}
		else
		{
			return quantity * SUMMER_RATE;
		}
	}
}
