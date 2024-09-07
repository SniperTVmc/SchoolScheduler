package fr.snipertvmc.schedulerapi;

import fr.snipertvmc.schedulerapi.utilities.Logger;

public class Main {


	// -------------------------------------------------- //


	private static Main instance;


	public static void main(String[] args) {

		Logger.info("Hello world!");
	}


	// -------------------------------------------------- //


	public static Main getInstance() {
		return instance;
	}


	// -------------------------------------------------- //
}