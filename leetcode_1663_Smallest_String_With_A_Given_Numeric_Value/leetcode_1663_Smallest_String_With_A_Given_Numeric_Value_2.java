//after the impormvement, the algorithm could be finished within the time limit.

class Solution {
    public String getSmallestString(int n, int k) {
        
        String res = "";
        char[] help = new char[n];
        Arrays.fill(help,'a');

        k = k-n+1;
        for(int i = n-1 ; i>=0 ; i--)
        {
            if(k / 26 >= 1)
            {
                help[i] = (char) (help[i] + 25);
                k = k-26+1;
            }
            else
            {
                help[i] = (char) (help[i] + k-1);
                k=1;
            }
        }
  
        return new String(help);
            
        
    }
}