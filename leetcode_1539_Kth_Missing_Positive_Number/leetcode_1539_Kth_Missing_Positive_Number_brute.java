class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int[] diff = new int[arr.length];
        int j =0;
        int res = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(i==0) 
            {               
                diff[i] = arr[i]-1;
            }
            else
            {
                diff[i] = arr[i] - arr[i-1] -1;
            }
        }       
        while(j<diff.length && k-diff[j]>0)
        {           
            k = k-diff[j];
            j++;
        }
        if(j==0)
        {
           res =  k;
        }
        else
        {
            res = arr[j-1]+ k;
        }  
        return res;
        
    }
}