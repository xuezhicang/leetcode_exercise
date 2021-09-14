class Solution {
    public Node connect(Node root) {
        
        if(root == null) return null;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(q.isEmpty()!=true){
            
            int qsize =q.size();
            for(int i= 0;i<qsize;i++){
                
                Node temp = q.remove();
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                if(i<qsize-1) temp.next = q.peek();
                
                
            }
            
            
            
        }
        
    return root;
        
    }
}