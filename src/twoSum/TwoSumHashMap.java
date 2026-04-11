package twoSum;

import java.util.HashMap;

public class TwoSumHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] nums = {8,7,1,3};
	        int target = 10;

	        HashMap<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];

	            if (map.containsKey(complement)) {
	                System.out.println("Indices: " + map.get(complement) + ", " + i);
	                return;
	            }

	            map.put(nums[i], i);
	        }

	        System.out.println("No solution found");

	}

}
