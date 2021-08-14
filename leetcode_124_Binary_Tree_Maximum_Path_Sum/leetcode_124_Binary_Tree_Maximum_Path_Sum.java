class Solution {
    int max_value = Integer.MIN_VALUE;
    
    public int helper(TreeNode root){
        if(root == null) return 0;
        int L = Math.max(helper(root.left),0);
        int R = Math.max(helper(root.right),0);
        
        max_value = Math.max(max_value,L+R+root.val);
        
        return root.val + Math.max(L,R);
        
    }
    
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max_value;
        
    }
}