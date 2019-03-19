
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class IntroduceForeignMethod
{
	private final String startDate;
	
	public IntroduceForeignMethod(String startDate)
	{
		this.startDate = startDate;
	}
	
	public String buildMessage()
	{
		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			c.setTime(sdf.parse(startDate));
			nextDay(c);
			return "Today is: " + startDate +
					 "\nTomorrow is: " + sdf.format(c.getTime());
		}
		catch (Exception e)
		{
			System.out.println("Error parsing start date.");
		}
		return null;
	}
	
	// INTRODUCE FOREIGN METHOD
	// This is a foreign method.  The Calendar class does not have a "nextDay()"
	// method, this class needs that method, so it writes its own.
	private void nextDay(Calendar c)
	{
		c.add(Calendar.DATE, 1);
	}
}
