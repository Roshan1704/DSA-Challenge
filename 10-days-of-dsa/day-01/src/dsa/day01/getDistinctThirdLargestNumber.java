package dsa.day01;

public class getDistinctThirdLargestNumber 
{
	public static int getDistinctThirdLargest(int[] arr) {
	    if (arr.length < 3) return -1;

	    Integer first = null;
	    Integer second = null;
	    Integer third = null;

	    for (int num : arr) {
	        // Skip duplicates
	        if ((first != null && num == first) ||
	            (second != null && num == second) ||
	            (third != null && num == third)) {
	            continue;
	        }

	        if (first == null || num > first) {
	            third = second;
	            second = first;
	            first = num;
	        } else if (second == null || num > second) {
	            third = second;
	            second = num;
	        } else if (third == null || num > third) {
	            third = num;
	        }
	    }

	    return (third == null) ? -1 : third;
	}


    public static void main(String[] args) {
        int[] arr = {5,4,3};

        System.out.println(getDistinctThirdLargest(arr));  // Output: 6
    }
	

}
