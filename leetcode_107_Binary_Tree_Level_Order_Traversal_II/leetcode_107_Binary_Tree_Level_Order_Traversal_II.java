class Solution {
    public void helper(TreeNode root,List<List<Integer>> res,int level){
        
        if(root == null) return; // base case
        
        if(res.size()<=level) // add a new layer
            res.add(new ArrayList<Integer>());
        res.get(level).add(root.val);
        
        helper(root.left,res,level+1); 
        helper(root.right,res,level+1);
        
        
    }
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) return res;
        helper(root,res,0);

        Collections.reverse(res);

        return res;
    }
}