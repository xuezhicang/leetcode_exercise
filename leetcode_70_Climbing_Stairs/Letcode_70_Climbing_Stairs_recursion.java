class Solution {
    
    int count =0;
    public int climbStairs(int n) {
        
        // if the person reaches the top, 
        //add 1 to the count
        if(n==0)        
            count++;

        if(n-1>=0)
        {
            climbStairs(n-1);
        }                    
        if(n-2>=0)
        {

            climbStairs(n-2);  
        }    
        return count;
        
    }
}