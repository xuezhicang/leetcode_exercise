class Solution {
    Integer res = 0;
    Double diff = Double.MAX_VALUE;
    
    public void helper(TreeNode root, double target){
        
        if(root == null) return;
        
        if  (Math.abs(target- Double.valueOf(root.val))<diff ) {
            diff =  Math.abs(target- Double.valueOf(root.val));
            res = root.val;         
        }          
        helper(root.left,target);
        helper(root.right,target); 
    
    }
    
    public int closestValue(TreeNode root, double target) {
         
        helper(root,target);
        return res; 
    }
}