class Solution {
    public int findKthLargest(int[] nums, int k) {
        return nums[quick_select(nums,0,nums.length-1,k)];
    }
    
    
    public int quick_select(int[] nums,int low,int high,int k)
    {       
        if(low == high)
            return low;  
        int pos = partion(nums,low,high);   
        if(pos == (nums.length-k))
        {
            return pos;
        }
        else if(pos > nums.length-k)
        {
             return quick_select(nums,low,pos-1,k);
        }
        else
        {
             return quick_select(nums,pos+1,high,k);
        }   
    }
    
    public int partion(int[] nums,int low,int high)
    {
        if(low==high)
            return low;
        int p = nums[high];
        int i = low;
        for(int j = low; j<high;j++)
        {
            if(nums[j]<p)
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                
            }
            
            
        }
        int tmp = nums[high];
        nums[high] = nums[i];
        nums[i] = tmp;
        return i;
   
    }
}