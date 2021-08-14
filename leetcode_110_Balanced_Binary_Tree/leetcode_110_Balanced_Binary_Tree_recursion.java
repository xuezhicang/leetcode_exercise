class Solution {
    
    public int height(TreeNode node) // caluculate the height of each node
    {
        if(node == null) return 0;
             
        return Math.max(height(node.left)+1,height(node.right)+1);
        
        
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root ==  null) return true;
        
        return Math.abs(height(root.left)- height(root.right)) <2 && isBalanced(root.left) && isBalanced(root.right);
    }
}