package com.medonline.model;

public class Address {
private String id;
private String line1;
private String line2;
private String line3;
private int postalCode;
private String state;
private String country;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getLine1() {
	return line1;
}
public void setLine1(String line1) {
	this.line1 = line1;
}
public String getLine2() {
	return line2;
}
public Address(String id, String line1, String line2, String line3,
		int postalCode, String state, String country) {
	super();
	this.id = id;
	this.line1 = line1;
	this.line2 = line2;
	this.line3 = line3;
	this.postalCode = postalCode;
	this.state = state;
	this.country = country;
}
public void setLine2(String line2) {
	this.line2 = line2;
}
public String getLine3() {
	return line3;
}
public void setLine3(String line3) {
	this.line3 = line3;
}
public int getPostalCode() {
	return postalCode;
}
public void setPostalCode(int postalCode) {
	this.postalCode = postalCode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
