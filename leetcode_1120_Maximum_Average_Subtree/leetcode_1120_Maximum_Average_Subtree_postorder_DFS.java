class Solution {
    //record the max average value
    float res = 0;
    public float[] helper(TreeNode root){
        
        if(root == null) return new float[]{0,0};
        
        float[] L = helper(root.left);
        float[] R = helper(root.right);
        
        
        float current_average = (root.val + L[0]+R[0])/(1+L[1]+R[1]);
        
        if(current_average>res)
            res = current_average;
        
        return new float[]{root.val + L[0]+R[0],1+L[1]+R[1]};
    }
    
    public double maximumAverageSubtree(TreeNode root) {
        
        helper(root);
        return res;
        
    }
}