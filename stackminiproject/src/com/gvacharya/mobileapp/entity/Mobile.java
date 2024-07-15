package com.gvacharya.mobileapp.entity;

public class Mobile {

	private int serialNumber;
	private String brand;
	private String os;

	public Mobile() {
	}

	public Mobile(int serialNumber, String brand, String os) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.os = os;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "Mobile [serialNumber=" + serialNumber + ", brand=" + brand + ", os=" + os + "]";
	}

}
