class Solution {
    public boolean helper(TreeNode root,Integer high,Integer low){
        if(root == null) return true;       
        if((high != null && high<=root.val ) || (low != null && low>=root.val))
            return false;       
        return helper(root.left,root.val,low) && helper(root.right,high,root.val); 
    }
 

    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);        
    }
}