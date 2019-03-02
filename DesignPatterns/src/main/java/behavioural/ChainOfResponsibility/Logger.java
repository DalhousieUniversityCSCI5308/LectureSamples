package behavioural.ChainOfResponsibility;

public abstract class Logger
{
	public static final int INFO = 0;	// General informational messages, mostly noise
	public static final int WARN = 1;	// Sometimes important
	public static final int ERROR = 2;	// A very important message, something is wrong
	
	// My personal level of logging.
	protected int logLevel;
	
	// Next object in the chain of responsibility
	protected Logger nextLogger;
	
	public Logger(int level)
	{
		nextLogger = null;
		logLevel = level;
	}

   public void setNextLogger(Logger nextLogger)
	{
      this.nextLogger = nextLogger;
   }

	// This is the "HandleRequest()" of the loggers, it determines whether
	// the concrete class should handle the message by logging it in whatever
	// its concrete way is
   public void log(int level, String message)
	{
		// Note that the Chain of Responsibility STOPS once an object decides
		// to handle the request.
      if (logLevel == level)
		{
         logMessage(message);
      }
		else if (null != nextLogger)
		{
         nextLogger.log(level, message);
      }
   }
	
	// Actually do the logging work.
	protected abstract void logMessage(String message);
}