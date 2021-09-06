class Solution {
    
    
   public void helper(TreeNode root, double target, int k,Queue<Integer> heap){
       if(root == null) return;
       
        
       if(heap.size() >=k){
           heap.add(root.val);
           heap.remove();
           
       }
       else
           heap.add(root.val);
           
       
       helper(root.left,target,k,heap);
       helper(root.right,target,k,heap);
       
       
   }
    
    
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        
        
        
        Queue<Integer> heap = new PriorityQueue<>((o1, o2) -> Math.abs(o1 - target) > Math.abs(o2 - target) ? -1 : 1);
        
        helper(root,target,k,heap);
        return new ArrayList<>(heap);
        
        
    }
}