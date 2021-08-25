class Solution {
    
    //record the result value
    Integer res = null;
    //record the kth value
    Integer count = null;
    
    //inorder Traversal
    public void helper(TreeNode root, int k){
        
        if(root == null) return;
            
        helper(root.left,k);
        if(count ==1) {
            res = root.val;            
        }
        count -= 1 ;
        helper(root.right,k);
    }
    
    
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root,k);
        return res;        
    }
}