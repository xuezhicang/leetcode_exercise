/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// This solution used the DFS(preorder) recursion method
// It is doesnot matter for using preorder,postorder or inorder in this question


class Solution {
    public void helper(List<List<Integer>> levels,TreeNode root,Integer level){
        if(level == levels.size())
            levels.add(new ArrayList<Integer>());

        
        levels.get(level).add(root.val);
        if(root.left != null) helper(levels,root.left,level+1);
        if(root.right != null) helper(levels,root.right,level+1);
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        
        if(root ==null) return levels;
        helper(levels,root,0);
        return levels;
        
    }
}