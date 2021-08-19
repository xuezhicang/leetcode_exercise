class Solution {
    

    public int find_min(TreeNode node){
        if(node.left == null && node.right == null) return node.val;
        
        int temp = node.val;
        
        if(node.left != null) temp = Math.min(node.val,find_min(node.left));
        if(node.right != null) temp = Math.min(temp,find_min(node.right));
            
        return temp;
        
    }
    
    
    public int find_max(TreeNode node){
        if(node.left == null && node.right == null) return node.val;
        
        int temp = node.val;
        
        if(node.left != null) temp = Math.max(node.val,find_max(node.left));
        if(node.right != null) temp = Math.max(temp,find_max(node.right));
            
        return temp;
        
    }
    
    public boolean helper(TreeNode node){
        if(node == null) return true;
                
        if(node.left != null && node.val <= find_max(node.left))  return false;
        if(node.right != null && node.val >= find_min(node.right)) return false;
                
        return helper(node.left) && helper(node.right);
        
    }
    public boolean isValidBST(TreeNode root) {
        
        return helper(root);
                
    }
}