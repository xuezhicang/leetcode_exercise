import java.util.HashMap; 


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map 
            = new HashMap<Integer, Integer>();   //define a hashmap
        int complement; //record the differente between the target and the current value
        
		//loop to check every element in the nums array
        for (int i = 0; i<nums.length; i++) {
            complement = target - nums[i]; //he differente between the target and the current value
            
			//if we already have the complement in HashMap,
            //return an array that contains indices of them.  
            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
            //if its complement is not in HashMap but in the array,
            //they will be matched when the complement is 
            //regarded as current element.
            //add current element into HashMap.
            map.put(nums[i], i);
        }
        //Exception which says it is unavailable to find solution
        //with these arguments.
        throw new IllegalArgumentException("No solution");
    }
}