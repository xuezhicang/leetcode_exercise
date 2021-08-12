// this is solution is similar with the first solution;
// But this one is a little slower than the first one,
//      becasue it has more comparsions(Math.max)
class Solution {

    public int helper(TreeNode node,TreeNode p,Integer tempRes){
          
        if(node == null) return tempRes;
        tempRes = (p!= null && p.val+1 == node.val)? tempRes+1:1;
    
        return Math.max(tempRes,Math.max(helper(node.left,node,tempRes),helper(node.right,node,tempRes)));

    }
    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
        return helper(root,null,0);
     
    }
}