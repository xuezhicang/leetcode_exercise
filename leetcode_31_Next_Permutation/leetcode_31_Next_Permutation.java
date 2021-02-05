class Solution {
    public void nextPermutation(int[] nums) {

        int flag = 0;
        int i = 0;
        for(i = nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                int local_min_idx = i;
                for(int j = i;j<nums.length;j++)
                {
                    if(nums[local_min_idx] > nums[j] && nums[j] > nums[i-1]  )
                        local_min_idx = j;
                    
                }
                int temp = nums[i-1];
                nums[i-1] = nums[local_min_idx];
                nums[local_min_idx] = temp;     
                break;
            }
        }

        Arrays.sort(nums,i,nums.length);

        

        
    }
}