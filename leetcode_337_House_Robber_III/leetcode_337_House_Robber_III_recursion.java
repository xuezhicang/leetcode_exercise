class Solution {
    
    public int[] helper(TreeNode root){
        
        // base case
        if(root == null) 
            return new int[]{0,0};

        // do the recursion part    
        int[] left = helper(root.left); //do the left son thing
        int[] right =  helper(root.right);  //do the right son thing
        

        // combine the two sons together
        int yes = root.val + left[0] +right[0];
        int no = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        return new int[]{no,yes};
    }
    
    public int rob(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0],res[1]);
        
    }
}