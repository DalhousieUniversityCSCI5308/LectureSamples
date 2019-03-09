package example.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NormalClass
{
	public void doSomething()
	{
		Logger logger = LogManager.getLogger(NormalClass.class);
		logger.info("NormalClass.DoSomething()");
	}
}