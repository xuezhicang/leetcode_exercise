class Solution {
       
    public void helper(TreeNode node,List<List<Integer>> res, List<Integer> tempRes, int targetSum){
        
        //if(node == null) return;
        
        tempRes.add(node.val);
        targetSum = targetSum - node.val;
        
        if(node.left == null && node.right == null ) //if the current node is a leaf
        {
            if(targetSum == 0){
                res.add(new ArrayList<>(tempRes)); //Note: we need to create a new ArraList here
            }
        }
        
        if(node.left != null) helper(node.left,res,tempRes,targetSum);
        if(node.right != null) helper(node.right,res,tempRes,targetSum);
        
        tempRes.remove(tempRes.size() - 1); // this is very important line
        
    }
    
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        

        List<List<Integer>> res = new ArrayList<List<Integer>>(); //store the final result
        
        if(root == null) return res;
        
        List<Integer> tempRes = new ArrayList<Integer>(); //store the path
            
        helper(root,res,tempRes, targetSum); //call the function
        
        return res;       
    }
}