class Solution {
    TreeNode x = null;
    TreeNode y = null;
    TreeNode pred = null;
    
    
    public void swap(){
        int temp = x.val;
        x.val = y.val;
        y.val = temp;   
    }
    
    public void helper(TreeNode root){
        if(root == null){
            return;
        }
        
        helper(root.left); 
        if(pred != null && pred.val>root.val){
            y= root;
            if(x==null)x= pred;
            
        }
        pred = root;
        helper(root.right);

    }
    

    public void recoverTree(TreeNode root) {
        helper(root);
        swap();

    }
}