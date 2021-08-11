class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root ==null) return root;
        
        Queue<TreeNode> Q = new LinkedList<TreeNode>();
        
        Q.add(root);
        while(Q.isEmpty() != true){
            TreeNode cur = Q.remove();
            
            //reverse the two sons of every parrent node
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;
            
            if(cur.left != null) Q.add(cur.left);
            if(cur.right != null) Q.add(cur.right);  
        }
        
        return root;
            
 
    }
}