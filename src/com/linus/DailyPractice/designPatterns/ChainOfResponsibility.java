package com.linus.DailyPractice.designPatterns;

public class ChainOfResponsibility 
{
	abstract class AbstractLogger
	{
		private static final int INFO = 1;
		private static final int DEBUG = 2;
		private static final int ERROR = 3;
		
		private int LEVEL;
		
		// next element in the Chain of Responsibility.
		private AbstractLogger nextLogger;

		public int getLEVEL() {
			return LEVEL;
		}

		public void setLEVEL(int lEVEL) {
			LEVEL = lEVEL;
		}

		public AbstractLogger getNextLogger() {
			return nextLogger;
		}

		public void setNextLogger(AbstractLogger nextLogger) {
			this.nextLogger = nextLogger;
		}
		
		public void logMessage(int level, String message)
		{
			if(this.LEVEL <= level)
			{
				write(message);
			}
			else
			{
				if(nextLogger != null) 
				{
					nextLogger.logMessage(level, message);
				}
			}

		}
		public abstract void write(String message);
	}
	
	class InfoLogger extends AbstractLogger
	{
		public InfoLogger(int level) 
		{
			this.setLEVEL(level);
		}

		@Override
		public void write(String message) {
			System.out.println("Info logger : " + message);
		}
		
	}
	
	class DebugLogger extends AbstractLogger
	{
		public DebugLogger(int level)
		{
			this.setLEVEL(level);
		}
		
		@Override
		public void write(String message) 
		{
			System.out.println("Debug logger : " + message);
		}
	}
	
	class ErrorLogger extends AbstractLogger
	{
		public ErrorLogger(int level)
		{
			this.setLEVEL(level);
		}
		
		@Override
		public void write(String message) 
		{
			System.out.println("Error logger : " +  message);
		}
	}
	
	private static AbstractLogger getChainOfLoggers(ChainOfResponsibility chainOfResponsibility)
	{
		AbstractLogger infoLogger = chainOfResponsibility.new  InfoLogger(AbstractLogger.INFO);
		AbstractLogger debugLogger = chainOfResponsibility.new DebugLogger(AbstractLogger.DEBUG);
		AbstractLogger errorLogger = chainOfResponsibility.new ErrorLogger(AbstractLogger.ERROR);
		
		errorLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(infoLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) 
	{
		ChainOfResponsibility chainOfResponsibility = new ChainOfResponsibility();
		AbstractLogger errorLogger = chainOfResponsibility.getChainOfLoggers(chainOfResponsibility);
		
		errorLogger.logMessage(AbstractLogger.INFO, "Info infromation");
		errorLogger.logMessage(AbstractLogger.DEBUG, "Debug information");
		errorLogger.logMessage(AbstractLogger.ERROR, "Error information");
	}
}
