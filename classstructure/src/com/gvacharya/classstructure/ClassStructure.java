package com.gvacharya.classstructure;

public class ClassStructure {

			// instance variable or fields
			int price;
			int barcode;
			String brandName;
			
			
			// default constructor
			public ClassStructure() {
				
			}
			
			// Parameterized Constructor
			public ClassStructure(int newPrice, int newBarcode, String newBrandName) {
				price= newPrice;
				barcode= newBarcode;
				brandName= newBrandName;
				
			}
			
			// behaviors or methods (setter concept)
			//set Price
			public void setPrice(int newPrice) {
				price = newPrice;	
			}
			
			//set Bar code
			public void setBarcode(int newBarcode) {
				barcode = newBarcode;
			}
			
			// set Brand Name
			public void setBrandName(String newBrandName) {
				brandName = newBrandName;
			}
			
			// get Price
			public int getPrice() {
				return price;
			}
			
			// get Bar Code
			public int getBarcode() {
				return barcode;
			}
			
			// get Brand Name
			public String getBrandName() {
				return brandName;
			}
}
