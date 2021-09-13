class Solution {
    
    public int findDepth(TreeNode root){
        if (root ==  null) return 0;
        return findDepth(root.left) +1;    
    }
    
    public boolean findNode(TreeNode node,int depth, int idx){
        int left = 0;
        int right = (int)Math.pow(2,depth-1)-1;
        int mid;
        
        for(int i =1; i<= depth-1;i++){
            mid = left + (right-left)/2;
            if(idx>mid)
            {
                node = node.right;
                left = mid+1;
            }
            else{
                node = node.left;
                right = mid-1;          
            }

        }
        
        return (node != null)  ;  
        
    }
    
    public int countNodes(TreeNode root) {
        int depth = findDepth(root);
        if(depth == 0 || depth==1) return (int)Math.pow(2,depth)-1;
        
        int left = 0;
        int right =  (int)Math.pow(2,depth-1)-1;
        int mid;
        while(left<=right){
            mid = left + (right - left)/2;
            if(findNode(root,depth,mid))
                left = mid+1;
            else
                right = mid -1;

        }
        return (int)Math.pow(2,depth-1)-1 + left;
        
    }
}