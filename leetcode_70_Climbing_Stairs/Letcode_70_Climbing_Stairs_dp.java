class Solution {
    public int climbStairs(int n) {
        int[] res = new int[n+1];
        
        if(n>=1)
            res[0]=1;
        if(n>=2)
            res[1]=2;
        
        for(int i = 2;i<=n;i++)
        {
            res[i] = res[i-2]+res[i-1];
        }
        
        
        return res[n-1];
        
        
    }
}