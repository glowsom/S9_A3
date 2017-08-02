package com.acadgild;
/*
 * Session 9 Assignment 3
 * 
 * Write a program to create a class HDTV with the properties:
 * • brandName
 * • size
 * Create Another class having an ArrayList and add 3 objects of HDTV into it.
 * 
 * Display HDTV objects in sorted order of size (Use Comparator)
 */
import java.util.ArrayList;
import java.util.Collections;

public class HDTV_Store {

	public static void main(String[] args) {
		// TODO Create Another class having an ArrayList.
		ArrayList<HDTV> inventory = new ArrayList<HDTV>();
		
		//Adding 3 HDTV objects into inventory
		inventory.add(new HDTV("Hisense", 75));
		inventory.add(new HDTV("LG", 70));
		inventory.add(new HDTV("Sony", 65));
		
		//Sorting inventory according to size, by utilizing TvSorter 
		Collections.sort(inventory, new TvSorter());
		
		//Display content of inventory
		for(HDTV tv: inventory) {
			System.out.println(tv);
		}
	}

}

