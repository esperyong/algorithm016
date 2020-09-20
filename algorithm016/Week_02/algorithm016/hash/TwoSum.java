package algorithm016.hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> finds = new HashMap<Integer,Integer>();

		for (int i = 0; i < nums.length; i++) {
			finds.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i++) {
			int com = target - nums[i];
			if(finds.containsKey(com) && finds.get(com) != i) {
				int j = finds.get(com);
				return new int[] {i,j};
			}
		}
		
		return null;

	}

	public int[] twoSum2(int[] nums, int target) {
        
	}
	
	public static void main(String[] args) {

		TwoSum ts = new TwoSum();

		int[] nums = new int[] {3,2,4};

		int[] result = ts.twoSum(nums, 6);
		
		System.out.println("====>>"+ result[0]+result[1]);
		
	}

}
