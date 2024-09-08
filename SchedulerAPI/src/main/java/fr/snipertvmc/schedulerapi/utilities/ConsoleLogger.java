package fr.snipertvmc.schedulerapi.utilities;

public class ConsoleLogger {


	// -------------------------------------------------- //


	public static void info(String message) {
		System.out.println("[INFO] " + message);
	}


	// -------------------------------------------------- //


	public static void warning(String message) {
		System.out.println("[WARN] " + message);
	}


	public static void warning(Exception exception) {
		System.out.println("[WARN] " + exception);
	}


	// -------------------------------------------------- //


	public static void error(String message) {
		System.out.println("[ERROR] " + message);
	}


	public static void error(Exception exception) {
		System.out.println("[ERROR] " + exception);
	}


	// -------------------------------------------------- //
}
