package NummberArray;

import java.util.ArrayList;
import java.util.Arrays;


public class ReverseStringWithoutLength {
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; 
		

		ArrayList<int[]> ls = new ArrayList<>(Arrays.asList(ar));

		for(int[] j:ls) { 
			System.out.print(Arrays.toString(j) + " "); 
		} 
	} }
