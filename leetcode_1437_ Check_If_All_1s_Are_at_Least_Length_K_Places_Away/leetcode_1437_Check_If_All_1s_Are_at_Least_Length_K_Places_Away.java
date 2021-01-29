class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        
        int inner_count = 0;
        int flag= 0;
        for(int i= 0; i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                if(flag==0)
                    flag = 1;
                else if(inner_count>=k )
                    inner_count = 0;
                else if(inner_count<k)
                    return false;
            }                
            else // nums[i]==0
            {
                if(flag == 1)
                    inner_count++;
            }           
            
        }
        return true;
        
    }
}