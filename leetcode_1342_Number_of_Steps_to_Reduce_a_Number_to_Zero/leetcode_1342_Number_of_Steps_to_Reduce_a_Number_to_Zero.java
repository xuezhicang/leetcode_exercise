class Solution {
    
    int res = 0;
    public int numberOfSteps (int num) {
        
        if(num == 0)
            return res;
        else
            if(num%2 == 0)
            {
                res= res+1;
                numberOfSteps(num/2);
            }
            else
            {
                res= res+1;
                numberOfSteps(num-1);
            }

        return res;
        
    }
}