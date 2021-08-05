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


// This solution used the BFS method (iteration)

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if(root == null)
            return ans;
       
        queue.add(root);
        int levels = 0;
        while(queue.isEmpty() == false){
           
            ans.add(new ArrayList<Integer>());
            int level_length = queue.size();
            
            for(int i=0;i<level_length;i++){
               
                TreeNode node = queue.remove();
                ans.get(levels).add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                
               
            }
            levels++;
            
            
        }
            
        return ans; 
        
    }
}