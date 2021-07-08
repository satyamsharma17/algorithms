package algorithms.advancedQuestions;

public class largestSumContiguousSubarray {

	public static void main (String[] args) {
	     int [] a = {5, -4, -1, -2, 1, 5, -3};
	     System.out.println("Largest sum of contiguous subarray in given array is " + maxSubArraySum(a) + "!");
	 }

	 static int maxSubArraySum(int a[]) {
	     int size = a.length;
	     int maxSum = Integer.MIN_VALUE, curSum = 0;

	     for (int i = 0; i < size; i++) {
	         curSum = curSum + a[i];
	         if (maxSum < curSum) {
	             maxSum = curSum;
	             }
	         if (curSum < 0) {
	             curSum = 0;
	         	}
	     }
	     return maxSum;
	 }

}

//Largest sum of contiguous subarray in given array is 10!