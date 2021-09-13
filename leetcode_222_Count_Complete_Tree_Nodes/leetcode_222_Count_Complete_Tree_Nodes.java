class Solution {
    
    public int helper(TreeNode root){
        if(root == null) return 0;
        
        return helper(root.left)+ helper(root.right)+1;
  
    }
    
    
    public int countNodes(TreeNode root) {
           
        return helper(root);
    }
}