import java.util.*;

public class IntroduceExplainingVariable
{
	static final float CANCER_RISK = 2.0f;
	static final float BASE_RISK = 1.0f;
	
	public float calculateInsurancePremium(List<String> habits)
	{
		// INTRODUCE EXPLANATORY VARIABLE
		// While this algorithm is simple now, it may grow in complexity. When it
		// grows this loop may be duplicated when trying to figure out if the user
		// is a smoker.  isSmoker is already an explanatory variable, but we can do
		// more here.
		boolean isSmoker = false;
		ListIterator<String> iter = habits.listIterator();
		while (iter.hasNext())
		{
			String h = iter.next();
			if (h.equalsIgnoreCase("smoking"))
			{
				isSmoker = true;
				break;
			}
		}
		if (isSmoker)
		{
			return BASE_RISK * CANCER_RISK;
		}
		return BASE_RISK;
	}
}
