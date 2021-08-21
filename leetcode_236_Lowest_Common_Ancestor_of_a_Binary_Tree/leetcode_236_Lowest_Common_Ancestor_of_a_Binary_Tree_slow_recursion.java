class Solution {
    
    
    public int having(TreeNode root, TreeNode p, TreeNode q,ArrayList<Integer> temp){

        if(root == null) return 0;
        if(root.val == p.val || root.val == q.val)
        {
            temp.set(0, temp.get(0)+1);
        }       
        having(root.left,p,q,temp);
        having(root.right,p,q,temp);      
        return temp.get(0);
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        //if the two nodes are in the left sub tree
        if(root.left != null && having(root.left,p,q,new ArrayList<>(){{add(0);}}) == 2 )
            return lowestCommonAncestor(root.left,p,q);
        //if the two nodes are in the right sub tree
        if(root.right != null && having(root.right,p,q,new ArrayList<>(){{add(0);}}) == 2 )
            return lowestCommonAncestor(root.right,p,q);
        
        //the two nodes are inthe left and right subtree
        return root;
        
    }
}