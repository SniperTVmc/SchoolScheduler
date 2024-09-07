package fr.snipertvmc.schedulerapi;

import fr.snipertvmc.schedulerapi.utilities.Logger;

public class Main {


	// -------------------------------------------------- //


	private static Main instance;


	public static void main(String[] args) {

		Logger.info("\n" +
				"\n" +
				"\n" +
				"\tHello world!\n" +
				"\n" +
				"\n"
		);
	}


	// -------------------------------------------------- //


	public static Main getInstance() {
		return instance;
	}


	// -------------------------------------------------- //
}