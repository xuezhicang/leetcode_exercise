class Solution {
    public int getMaximumGenerated(int n) {
        
        if(n == 0)
            return 0;
        else if(n==1)
            return 1;
        
        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        int max= 1;
        for(int i =2;i<n+1;i++)
        {
            
            if(i%2 ==0 )
            {
                res[i] = res[i/2];  
            }
            else
            {
                res[i] = res[i/2] + res[1 + i/2];
            }
            if(max<=res[i])
                max = res[i];
            //System.out.println("i  "+i+"   "+res[i]);
        }
        return max;
    }
}