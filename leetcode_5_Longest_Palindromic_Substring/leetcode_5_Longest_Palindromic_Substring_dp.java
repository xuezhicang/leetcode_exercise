class Solution {
    public String longestPalindrome(String s) {
        
        int s_length = s.length();
        int[][] rec = new int[s_length][s_length];
        int max_length = 1;
        int j=0;
        int start_i=0;
        
        for(int i = 0;i<s_length;i++)
        {
            rec[i][i] = 1;           
        }
 
        for(int len=2;len<=s_length;len++)
            for(int i= 0;i< s_length - len + 1;i++)
            {
                j = i + len -1;
                if ((s.charAt(i) == s.charAt(j)) && (len == 2) )
                {
                    rec[i][j] = 1;

                }
                else if ((s.charAt(i) == s.charAt(j)) && (rec[i+1][j-1] == 1))
                {
                    rec[i][j] = 1;
                }
                    if (len>max_length)
                    {
                        max_length = len;
                        start_i = i;
                    }                    
            }
        return s.substring(start_i,start_i+max_length);
    }
}