package fr.snipertvmc.schedulerapi.utilities;

public class Logger {


	// -------------------------------------------------- //


	public static void info(String message) {
		java.util.logging.Logger.getLogger("SchedulerAPI_Logger").info(message);
	}


	public static void info(Exception exception) {
		java.util.logging.Logger.getLogger("SchedulerAPI_Logger").info(String.valueOf(exception));
	}


	// -------------------------------------------------- //


	public static void warning(String message) {
		java.util.logging.Logger.getLogger("SchedulerAPI_Logger").warning(message);
	}


	public static void warning(Exception exception) {
		java.util.logging.Logger.getLogger("SchedulerAPI_Logger").warning(String.valueOf(exception));
	}


	// -------------------------------------------------- //


	public static void error(String message) {
		java.util.logging.Logger.getLogger("SchedulerAPI_Logger").severe(message);
	}


	public static void error(Exception exception) {
		java.util.logging.Logger.getLogger("SchedulerAPI_Logger").severe(String.valueOf(exception));
	}


	// -------------------------------------------------- //
}
