package fr.snipertvmc.schedulerapi.infrastructure.utilities;

import java.util.UUID;

public class Address {


	// -------------------------------------------------- //


	private final UUID uuid;

	private String street;
	private String city;
	private int zipCode;
	private String province;
	private String country;


	public Address(UUID uuid, String street, String city, int zipCode, String province, String country) {
		this.uuid = uuid;
		this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.province = province;
        this.country = country;
	}


	// -------------------------------------------------- //


	public UUID getUUID() {
		return uuid;
	}


	// -------------------------------------------------- //


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	// -------------------------------------------------- //


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	// -------------------------------------------------- //


	public int getZipCode() {
		return zipCode;
	}


	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	// -------------------------------------------------- //


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	// -------------------------------------------------- //


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	// -------------------------------------------------- //
}
