class Solution {
    public int helper(TreeNode root,List<List<Integer>> res){
        if(root ==  null )
            return -1;
        
        int L_level=0;
        int R_level=0;
        int this_level=0;
        L_level = helper(root.left,res) +1;
        R_level = helper(root.right,res) +1;
        
        this_level = Math.max(L_level,R_level);
        

        if(this_level >= res.size())
            res.add(new ArrayList<Integer>());
        res.get(this_level).add(root.val);
        
        return this_level;
        
        

    }
    
    
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(root,res);
        
        return res;
    }
}