class Solution {
    public int minDepth(TreeNode root) {
        
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int res = Integer.MAX_VALUE;
        
        if(root.left != null)
            res = Math.min(res,minDepth(root.left)+1);
        if(root.right != null)
            res = Math.min(res,minDepth(root.right)+1);
          
        return res;
        
    }
}