package com.acadgild;
/*
 * Displaying HDTV objects in sorted order of size will utilize a Comparator
 * for simplicity.
 */
import java.util.Comparator;

public class TvSorter implements Comparator<HDTV> {

	@Override
	public int compare(HDTV o1, HDTV o2) {
		// TODO Auto-generated method stub
		return o1.getSize() - o2.getSize();
	}
	
	
}