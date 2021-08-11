class Solution {
    
    public void helper(LinkedList<String> res, String str, TreeNode node){
        
        str = str + Integer.toString(node.val);
        if(node.left == null && node .right ==null) {
            res.add(str);
            return;
        }
        else{
            if(node.left != null){
                helper(res,str+"->",node.left);
            }
            if(node.right != null){
                helper(res,str+"->",node.right);
            }            
        }
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        
        LinkedList<String> res = new LinkedList<String>();
        helper(res,"",root);
        return res;
        
    }
}