package com.acadgild;
/*
 * Write a program to create a class HDTV with the properties:
 * • brandName
 * • size
 */
public class HDTV {
	
	//Setting default values for HDTV properties
	private String brandName = "NA";
	private int size = 0;
	
	//Overload constructor to assign values to properties
	public HDTV(String brandName, int size) {
		this.brandName = brandName;
		this.size = size;
	}
	
	//Getter methods for retrieving property values
	
	public String getBrandName() {
		return brandName;
	}

	public int getSize() {
		return size;
	}
	
	//Providing a String display schema for HDTV objects
	public String toString() {
		return size + "\" "+brandName;
	}

}