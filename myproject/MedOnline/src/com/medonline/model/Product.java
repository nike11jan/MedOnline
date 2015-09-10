package com.medonline.model;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Product {
private int id;
private int weight;
private String name;
private String description;
private float price;
private Date expiry;
private Date manufacturingDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Date getExpiry() {
	return expiry;
}
public void setExpiry(Date expiry) {
	this.expiry = expiry;
}
public Date getManufacturingDate() {
	return manufacturingDate;
}
public void setManufacturingDate(Date manufacturingDate) {
	this.manufacturingDate = manufacturingDate;
}
public Product(int id, String name, String description, float price,
		Date expiry, Date manufacturingDate) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.price = price;
	this.expiry = expiry;
	this.manufacturingDate = manufacturingDate;
}

}
