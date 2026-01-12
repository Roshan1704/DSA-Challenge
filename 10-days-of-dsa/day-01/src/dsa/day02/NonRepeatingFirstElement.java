package dsa.day02;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingFirstElement {
	
	public static int NoneRepeatingElement(int[] arr)
	{
		if (arr.length == 0) return -1;

	    Map<Integer, Integer> freq = new HashMap<>();

	    for (int num : arr) {
	        freq.put(num, freq.getOrDefault(num, 0) + 1);
	    }

	    for (int num : arr) {
	        if (freq.get(num) == 1) {
	            return num;
	        }
	    }

	    return -1;
		
	}

	public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 5, 7};

        System.out.println(NoneRepeatingElement(arr));  // Output: 6
    }

}
