class Solution {
    int max;
   
   public int helper(TreeNode node){
       
       if(node == null ) return 0;
       int L = helper(node.left) +  1;
       int R = helper(node.right) +  1;
       
       if(node.left != null && node.left.val != node.val+1) L = 1;
       if(node.right != null && node.right.val != node.val+1) R = 1;
       
       int length = Math.max(L,R);

       max = Math.max(max,length);
       return length;
       
   }
   public int longestConsecutive(TreeNode root) {
       
       helper(root);
       return max;
       
   }
}