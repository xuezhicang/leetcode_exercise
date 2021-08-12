class Solution {
    

    //in the solution, they use a variable outside of the class. 
    //I think it is ugly, so I use the 
    //int res = 0

    
    public void helper(TreeNode node,Integer temp,ArrayList<Integer> res){
        
        temp = temp*10 + node.val;
        
        if(node.left ==null && node.right == null)
        {
            res.set(0,res.get(0)+ temp);
            
        }
            
        
        if(node.left!= null) helper(node.left, temp,res);
        if(node.right!= null) helper(node.right,temp,res);
        
        
    }
    public int sumNumbers(TreeNode root) {
        

        Integer temp = 0;
        
        //since I do not link the global variable I used a List for hadling the changing result value
        ArrayList<Integer> res = new ArrayList<Integer>(){{add(0);}}; 
        
        helper(root,temp,res) ;      
        return res.get(0);
        
    }
}