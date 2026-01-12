package dsa.day02;

public class SubArraySum {
	
	public static boolean subarrayWithGivenSum(long[] arr, long target)
	{
		if (arr == null || arr.length == 0) return false;

        int start = 0;
        long sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end]; // include current element

            // shrink window until sum <= target
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                return true; // found a continuous subarray
            }
        }

        return false; // no subarray found
    }

	public static void main(String[] args) {
		
		long [] arr = {1_500_000_000, 1_500_000_000};
		long target = 3_000_000_000L;
		
		System.out.println(subarrayWithGivenSum(arr, target));;

	}

}
