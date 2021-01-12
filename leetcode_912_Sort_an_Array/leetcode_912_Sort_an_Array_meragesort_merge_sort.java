class Solution {
    public int[] sortArray(int[] nums) {
        
        if(nums.length<=1)
            return nums;
        
        int piv = nums.length/2;
        
        int[] left_part = sortArray(Arrays.copyOfRange(nums, 0, piv));
        int[] right_part = sortArray(Arrays.copyOfRange(nums, piv, nums.length)) ;
        
        
        int[] meraged_array = merage(left_part,right_part);
        return meraged_array;
        
    }
    
    public int[] merage(int[] left, int[] right)
    {
        int[] res = new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i!=left.length  || j!= right.length)
        {
            if(i!=left.length  && j!= right.length)
            {
                if(left[i]<=right[j])
                {
                    res[k] = left[i];
                    i++;
                }
                else
                {
                    res[k] = right[j];
                    j++;
                }
                
            }
            else if(i!=left.length  && j== right.length)
            {
                res[k] = left[i];
                i++;
            }
            else
            {
                res[k] = right[j];
                j++;               
            }
            k++;
        }
        return res;
        
    }
}