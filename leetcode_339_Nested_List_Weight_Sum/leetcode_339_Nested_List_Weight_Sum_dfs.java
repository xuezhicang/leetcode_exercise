class Solution {
    public int depthSum(List<NestedInteger> nestedList) {       
        return dfs(nestedList,1);    
    }
    public int dfs(List<NestedInteger> nestedList,int depth)
    {
        int res= 0;
        for(NestedInteger temp: nestedList)
        {
            if(temp.isInteger())
            {
                res = res + temp.getInteger()*depth;   
            }
            else
            {
              res = res + dfs(temp.getList(),depth+1);  
            }
        }     
        return res;
        
        
    }
}