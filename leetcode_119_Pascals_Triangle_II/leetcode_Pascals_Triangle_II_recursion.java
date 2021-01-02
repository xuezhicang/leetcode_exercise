class Solution {
    public List<Integer> getRow(int rowIndex) {
        
    List<Integer> res = new ArrayList<Integer>();

    for(int i = 0; i<= rowIndex;i++)
    {
        res.add(helper(rowIndex,i));
    }

    return res;
    }
    
    public int helper(int rowIndex,int i)
    {
        if(rowIndex == 0 || i==0 || rowIndex == i)
            return 1;
        
        //recursion
        return helper(rowIndex-1,i) + helper(rowIndex-1,i-1);
        
        
    }
}