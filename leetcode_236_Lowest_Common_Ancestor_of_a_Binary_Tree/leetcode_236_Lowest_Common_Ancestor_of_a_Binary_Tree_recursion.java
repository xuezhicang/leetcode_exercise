class Solution {
    
    TreeNode res = null;
    
    public boolean helper(TreeNode root, TreeNode p, TreeNode q){
        
        if(root == null) return false;
        
        int left = helper(root.left, p, q)?1:0;
        int right = helper(root.right, p, q)?1:0;       
        int mid= (root.val ==p.val ||root.val==q.val)?1:0;      
        
        if(left+right+mid>=2)
            res = root;
    
        return (left+right+mid>0);
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        helper(root, p, q);
        
        return res;
        
    }
}