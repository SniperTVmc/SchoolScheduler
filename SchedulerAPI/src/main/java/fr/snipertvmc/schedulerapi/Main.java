package fr.snipertvmc.schedulerapi;

import fr.snipertvmc.schedulerapi.managers.data.DataManager;
import fr.snipertvmc.schedulerapi.utilities.ConsoleLogger;

public class Main {


	// -------------------------------------------------- //


	private static Main instance;


	public static void main(String[] args) {

		ConsoleLogger.info("");
		ConsoleLogger.info("");
		ConsoleLogger.info("Data loading...");

		long now = System.currentTimeMillis();

		DataManager.getInstance().loadAddresses();
		DataManager.getInstance().loadSchools();

		long elapsedTime = System.currentTimeMillis() - now;

		ConsoleLogger.info("Done! (" + elapsedTime + "ms)");
		ConsoleLogger.info("");
		ConsoleLogger.info("");
	}


	// -------------------------------------------------- //


	public static Main getInstance() {
		return instance;
	}


	// -------------------------------------------------- //
}