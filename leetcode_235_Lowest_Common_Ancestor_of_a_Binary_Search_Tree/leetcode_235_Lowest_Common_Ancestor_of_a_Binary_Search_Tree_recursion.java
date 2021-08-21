class Solution {

    // the key of this problem is to understand the structure of the Binary Search Tree
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root.val > p.val && root.val >q.val)
            return lowestCommonAncestor(root.left,p,q);
        
        if(root.val < p.val && root.val <q.val)
            return lowestCommonAncestor(root.right,p,q);
        
        else
            return root;
        
    }
}