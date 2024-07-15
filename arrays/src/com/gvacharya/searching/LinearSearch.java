package com.gvacharya.searching;

public class LinearSearch {

	public static void main(String[] args) {
		short[] shortArray = {4,3,2,5,6,7,8,91,9,23,45,76,98};
		int index=-1;
		int element=91;
		for(int i=0;i<shortArray.length;i++)
			if(element==shortArray[i]) {
				index=i;
				break;
			}
		
		if(index>=0)
			System.out.println("Element Found at Index:" + index);
		else
			System.out.println("Element not found in given Array");
	}
}
