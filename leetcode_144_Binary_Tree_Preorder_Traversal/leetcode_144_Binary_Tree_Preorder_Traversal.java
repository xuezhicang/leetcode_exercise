class Solution {
    public void preorder(TreeNode root,List lst){
        if (root ==null)
            return;       
        lst.add(root.val);
        preorder(root.left,lst);
        preorder(root.right,lst);
 
    } 
        
    public List<Integer> preorderTraversal(TreeNode root) {
        List ans = new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
    //Note: The function pass the address of the list,
    // so the function can change the value in the list.

}