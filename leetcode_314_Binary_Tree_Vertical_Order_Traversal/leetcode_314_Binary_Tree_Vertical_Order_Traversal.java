
// The question is not diffcult, but it includes a lot of functions 
// to remember
// so, I will review it later.
class Solution {
    
    //define a treemap to hold the data of each level
    Map<Integer,ArrayList<Integer>> temp = new TreeMap<Integer,ArrayList<Integer>>();
    
    public List<List<Integer>> verticalOrder(TreeNode root) {
        
        if(root == null) return new ArrayList<List<Integer>>();
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.add(new Pair(root,0));
        int col = 0;
        while(q.isEmpty() != true){
            Pair<TreeNode, Integer> p = q.poll();
            root  = p.getKey();
            col = p.getValue();
            
            if(root != null){

                if (!temp.containsKey(col)) {
                    temp.put(col, new ArrayList<Integer>());
                }
                temp.get(col).add(root.val);
                
                q.offer(new Pair(root.left, col - 1));
                q.offer(new Pair(root.right, col + 1));                
                
            }
            
            
        }
        
    List<Integer> sortedKeys = new ArrayList<Integer>(temp.keySet());
    Collections.sort(sortedKeys);
    for(int k : sortedKeys) {
      output.add(temp.get(k));
    }

    return output;        
        
        
    }
}