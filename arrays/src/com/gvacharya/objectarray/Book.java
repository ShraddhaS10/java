package com.gvacharya.objectarray;

public class Book {
	
	private float price;
	private String name;
	private short pages;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(float price, String name, short pages) {
		super();
		this.price = price;
		this.name = name;
		this.pages = pages;
	}


	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public short getPages() {
		return pages;
	}
	public void setPages(short pages) {
		this.pages = pages;
	}


	@Override
	public String toString() {
		return "Book [price=" + price + ", name=" + name + ", pages=" + pages + "]";
	}
	
	
	
	
	
	
}

// toString method
// belong to object class
// object is parent of all classes
// object.toString();