package com.gvacharya.joinfunction;

public class JoinFunction {

	public static void main(String[] args) {
		
	 String address = "shelu GVAIET";
	
	 String[] addComponent = address.split(" ");
	
	 String newAddress = String.join("->", addComponent);
	
	System.out.println(newAddress);
	}
}

//matches(), 
//toCharArray(), 
//split(), 
//join(), 
//charAt(), 
//length()