class Solution {
    public int closestValue(TreeNode root, double target) {
        int closest = root.val;    
        while(root != null){          
            if(Math.abs(target -closest ) > Math.abs(target -root.val ))
                closest = root.val;
            
            if(target>root.val) 
                root =  root.right;
            else
                root =  root.left;
        }       
        return closest;        
    }
}