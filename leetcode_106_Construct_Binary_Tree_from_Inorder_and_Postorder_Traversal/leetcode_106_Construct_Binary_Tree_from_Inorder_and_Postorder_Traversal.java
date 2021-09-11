class Solution {
    
    int idx = 0;
    
    public int find_idx(int[] array, int num){
        
        int res = -1;
        
        int id = 0;
        
        while(res ==-1){
            if(array[id] == num)
                res = id;
            id++;
        }
        return res;
    }
    
    public TreeNode helper(int[] inorder, int[] postorder, int start, int end){
        
        if(start>end) return null;
        
        int num = postorder[idx--];
        TreeNode root = new TreeNode(num);
        
        int mid = find_idx(inorder,num);
        
        root.right = helper(inorder,postorder,mid+1,end);
        root.left = helper(inorder,postorder,start,mid -1);
        
        
        
        return root;
        
        
        
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length -1;
        return helper(inorder,postorder,0,inorder.length-1);
        
    }
}