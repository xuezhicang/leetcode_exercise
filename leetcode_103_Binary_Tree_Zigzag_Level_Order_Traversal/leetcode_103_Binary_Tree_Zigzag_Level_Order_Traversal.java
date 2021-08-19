class Solution {
    public void helper(TreeNode root,List<List<Integer>> res,int level){
        
        if(root == null) return;
        
        if(res.size() <= level)
            res.add(new ArrayList<Integer>());
        res.get(level).add(root.val);        
        helper(root.left,res,level+1);
        helper(root.right,res,level+1);
        return;
 
    }
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        helper(root,res,0);

        for(int i =1;i<res.size();i = i+2)
           Collections.reverse(res.get(i));
        
        return res;
            
    }
}