package business.Conceretes;

import core.Logging;

public class Utils {

	public static void runLogging(Logging[] loggers, String data) {
		
		for (Logging logging : loggers) {
			logging.log(data);
		}
	}
}
