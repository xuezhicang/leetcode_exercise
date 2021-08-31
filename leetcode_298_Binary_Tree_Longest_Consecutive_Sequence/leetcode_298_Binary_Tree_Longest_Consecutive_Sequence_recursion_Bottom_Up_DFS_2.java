class Solution {
    int res = 0;
    
    public int helper(TreeNode son,TreeNode par){
        
        if(son == null) return 1;
        
        
        int L = helper(son.left,son);
        int R = helper(son.right,son);

        int temp = Math.max(L,R);
        if(par!= null && son.val == par.val+1)
           temp += 1;
        else
            temp =1;              
        res = Math.max(res,temp);
        
        return temp;       
    }
    
  
    public int longestConsecutive(TreeNode root) {
        
        helper(root,null);
        return res;      
    }
}