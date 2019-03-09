package example.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VeryImportantClass
{
	public void doSomething()
	{
		Logger logger = LogManager.getLogger(VeryImportantClass.class);
		logger.info("VeryImportantClass.DoSomething()");
	}
}