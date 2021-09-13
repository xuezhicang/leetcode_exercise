class Solution {
    int preorder_s = 0;
    
    public int findIndex(int[] array, int num){
        int idx = -1;
        
        int i =0;
        while(idx == -1){
            if(array[i] == num){
                idx = i;
                
            }
            i++;
        }
        
        return idx;
    }
    
    public TreeNode helper(int[] preorder, int[] inorder,int inorder_s,int inorder_e){
        
        if(inorder_s > inorder_e) return null;
        
        int nnn = preorder[preorder_s++];
        TreeNode root = new TreeNode(nnn);
        int index = findIndex(inorder, nnn);  
        
        root.left = helper(preorder,inorder,inorder_s,index-1);
        root.right = helper(preorder,inorder,index+1,inorder_e);
        
        return root;      
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {    
        return helper(preorder,inorder,0,inorder.length-1);
    }
}