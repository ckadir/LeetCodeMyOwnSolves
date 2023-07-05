package problems;

import java.util.ArrayList;
import java.util.HashMap;

public class two_sum {   

	public static void main(String[] args) {
		
		int[] data = {3,2,4 };
		int[] sum = twoSum(data, 6);
 		for (int i=0; i < sum.length; i++) {
			System.out.print(i + "," + sum[i]);
			if(i < sum.length-1)
				System.out.print(" | ");
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(tracker.containsKey(nums[i])){

                return new int[]{tracker.get(nums[i]), i};
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        return new int[2];
    }

}
