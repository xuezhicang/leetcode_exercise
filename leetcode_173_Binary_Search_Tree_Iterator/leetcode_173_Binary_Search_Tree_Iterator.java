class BSTIterator {
    
    // the question ask us to create a in-order traversal of a binary search tree (BST)
    List<Integer> arr = new ArrayList<Integer>();
    int i = 0;
    public void helper(TreeNode root){
        if(root == null) return;
        //inorder traversal
        helper(root.left);
        arr.add(root.val);
        helper(root.right);
        
    }
    
    
    public BSTIterator(TreeNode root) {
        
        
        helper(root); 
    }
    
    public int next() {   
        //use i's value,
        // then add i to i     
        return arr.get(i++);  
    }
    
    public boolean hasNext() { 
        //check whether i is the last index
        return (i<arr.size());
    }
}