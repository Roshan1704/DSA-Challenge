package dsa.day01;

import java.util.Arrays;
import java.util.HashSet;

public class distinctSecondLargestNumber {

	public static int getDistinctSecondLargest(int[] arr) {
	    if (arr.length < 2) return -1;

	    Integer Highest = null;
	    Integer SecondHighest = null;

	    for (int num : arr) {
	        if (Highest == null || num > Highest) {
	            SecondHighest = Highest;
	            Highest = num;
	        } else if ((SecondHighest == null || num > SecondHighest) && num < Highest) {
	            SecondHighest = num;
	        }
	    }

	    return (SecondHighest == null) ? -1 : SecondHighest;
	}

    public static void main(String[] args) {
        int[] arr = {5, Integer.MIN_VALUE};

        System.out.println(getDistinctSecondLargest(arr));  // Output: 6
    }
}
