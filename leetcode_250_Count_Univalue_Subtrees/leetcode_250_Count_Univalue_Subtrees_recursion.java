class Solution {
    int res = 0;
    public boolean helper(TreeNode node){

        if(node.left == null && node.right == null){
 
            res++;
            return true;
        }
              
        boolean temp = true;
        if(node.left!= null){
            temp = helper(node.left) && node.left.val == node.val;
        }
        if(node.right!= null){
            temp =  helper(node.right) &&temp&& node.right.val == node.val;
        }        
        
        if(temp == false) return false;
        res++;
        return true;          
    }
    
    public int countUnivalSubtrees(TreeNode root) {       
        if (root == null) return 0;
        helper(root);
        return res;      
    }
}