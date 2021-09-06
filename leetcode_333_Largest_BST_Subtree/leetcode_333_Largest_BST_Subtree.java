class Solution {

    public Integer[] helper(TreeNode root){
        if(root == null) return new Integer[]{0,1,null,null};
        
        
        Integer[] L = helper(root.left);
        Integer[] R = helper(root.right);
        
        boolean temp = true;
        if(L[3] != null && root.val <= L[3])
            temp = false;
        if(R[2] !=null && root.val >= R[2])
            temp = false;
        
        
        
        if(temp == true && L[1]==1 && R[1]==1) 
        {
            
            return new Integer[]{L[0]+R[0]+1,1,L[2]== null?root.val:L[2],R[3]== null?root.val:R[3]};
        }
           
        else
        {
            return new Integer[]{Math.max(L[0],R[0]),0,null,null};
        }
            
        
        
        
    }
    
    public int largestBSTSubtree(TreeNode root) {
        
        return helper(root)[0];
        
    }
}