class Solution {
    public int[] sortArray(int[] nums) {
        
        int len = nums.length;
        qsort(nums,0,len-1);
        return nums;
    }
    
    public void qsort(int[] nums,int low,int high)
    {
        if(low<high)
        {
            int p = partion(nums,low,high);
            qsort(nums,low,p-1);
            qsort(nums,p+1,high);                        
            
        }
    }
    public int partion(int[] nums,int low,int high)
    {
        int p = nums[high];
        
        int i = low;        
        for(int j = low;j<high;j++)            
        {
            if (nums[j] < p)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }         
        }
        int tmp = nums[i];
        nums[i] = nums[high];
        nums[high] = tmp;         
        return i;
    }
}