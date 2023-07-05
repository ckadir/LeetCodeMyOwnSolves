package problems;

import java.util.Iterator;

public class MaximumSumCircularSubarray {

	public static void main(String[] args) {
		
		
		int[] val = {1,2,3};
		maxSubarraySumCircular(val);

	}
	 public static int maxSubarraySumCircular(int[] nums) {
		 
		 int sum = 0; int max = 0;
		 for (int val : nums) {
			sum += val;
			max = Math.max(sum + val, max);
			
		}
	     return -1;
	}

}
