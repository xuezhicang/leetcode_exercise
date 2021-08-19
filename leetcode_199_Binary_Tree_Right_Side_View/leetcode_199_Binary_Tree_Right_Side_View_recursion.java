class Solution {
    public void helper(TreeNode root,List<Integer> res,int level ){
        if(root == null) return;
        
        // if the node is the first right node
        if(level == res.size())
            res.add(root.val);
        
        // get the right node first
        helper(root.right,res,level+1);
        helper(root.left,res,level+1);

    }
    
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> res = new ArrayList<Integer>();
        if(root ==  null) return res;
        helper(root,res,0);
        return res; 
  
    }
}