//the algorithm is correct, but it exceeds the time limit

class Solution {
    public String getSmallestString(int n, int k) {
        
        String res = "";
        int[] help = new int[n];
     
        k = k-n+1;
        for(int i = n-1 ; i>=0 ; i--)
        {
            if(k / 26 >= 1)
            {
                help[i] = 26;
                k = k-26+1;
            }
            else
            {
                help[i] = k;
                k=1;
            }
        }
        
        for(int i =0;i<n;i++)
        {
            res= res +  Character.toString((char) help[i]+96);
        }
 
        return res; 
    }
}