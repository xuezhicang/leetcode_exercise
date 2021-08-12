class Solution {
    int res = 0; //record the max length
    public void helper(TreeNode node,TreeNode p,Integer tempRes){
    
        if(node == null) return;
        tempRes = (p!= null && p.val+1 == node.val)? tempRes+1:1;
        
        res = Math.max(res, tempRes);
        if(node.left != null) helper(node.left,node,tempRes);
        if(node.right != null) helper(node.right,node,tempRes);           
    }
    public int longestConsecutive(TreeNode root) {
       
        helper(root,null,0);
        return res;        
    }
}