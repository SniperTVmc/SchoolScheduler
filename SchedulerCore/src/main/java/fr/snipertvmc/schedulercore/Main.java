package fr.snipertvmc.schedulercore;

public class Main {


	// -------------------------------------------------- //


	private static Main instance;


	public static void main(String[] args) {

		System.out.println("Hello world!");

		//instance = this;
	}


	// -------------------------------------------------- //


	public static Main getInstance() {
		return instance;
	}


	// -------------------------------------------------- //
}