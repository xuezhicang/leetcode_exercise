class Solution {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
            
        while(true){
            
            while(root!= null)
            {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if(k-- == 1) return root.val;
            root = root.right;   
            
        }
        
    }
}