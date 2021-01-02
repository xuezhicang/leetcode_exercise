class Solution {
    public int fib(int n) {     
        
    
        int[] res = new int[n+1];
        if(n>=0);
            res[0] = 0;
        if(n>=1)
            res[1] = 1;
        
        for(int i=2;i<=n;i++)
        {
           res[i] = res[i-1] +res[i-2]; 
        }
  
        return res[n];
        
        
    }
}