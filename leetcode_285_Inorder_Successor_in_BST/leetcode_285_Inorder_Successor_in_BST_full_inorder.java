
// this method is a little slow, although the time complexity is O(n)
//

class Solution {
    //record the last node
    TreeNode temp = null;
    //record the results
    TreeNode res = null;
    public TreeNode helper(TreeNode root, TreeNode p){
        
        if(root == null) return null;                
        helper(root.left,p);
        //if the last node is the p
        if(temp!= null && temp.val == p.val){
            res = root;
        }      
        temp = root;      
        helper(root.right,p);       
        return root;      
    }
    
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        
        // inorder traversal
        helper(root,p);
        //return the results
        return res;
        
    }
}