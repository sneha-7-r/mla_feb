package com.test;

public class Address {
	private String city;
	private String country;
	private String state;
	
	public Address() {
		
	}
	
	public Address(String city,String country,String state) {
		this.city=city;
		this.country=country;
		this.state=state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", state=" + state + "]";
	}
}
