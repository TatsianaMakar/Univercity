package project;

public class Adress {
	private String city;
	private String street;
	private int homeNumber;
	private int flatNumber;

	Adress(String city, String street, int homeNumber, int flatNumber) {
		this.city = city;
		this.street = street;
		this.homeNumber = homeNumber;
		this.flatNumber = flatNumber;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet() {
		return this.street;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public int getFlatNumber() {
		return this.flatNumber;
	}

	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}

	public int getHomeNumber() {
		return this.homeNumber;
	}

}

