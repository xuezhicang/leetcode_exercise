class Solution {
    
    public TreeNode helper(TreeNode root){
        
        if(root== null) return null;
        if(root.left == null && root.right == null) return root;
        
        TreeNode left_tail = helper(root.left);
        TreeNode right_tail = helper(root.right);
        
        
        if(left_tail != null)
        {
            left_tail.right = root.right;
            root.right = root.left;
            root.left = null;
            
        }
        
        return right_tail == null?left_tail:right_tail;
        
    }
    
    public void flatten(TreeNode root) {
        
        helper(root);
        
    }
}