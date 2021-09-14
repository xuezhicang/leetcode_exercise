class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        
        while(q.peek().left != null){
            int qsize = q.size();
            for(int i = 0; i<qsize;i++){
                
                Node temp = q.remove();
                temp.left.next = temp.right;
                q.add(temp.left);
                if(i < q.size()-1)
                    temp.right.next = q.peek().left;
                q.add(temp.right);
                
            }            
             
        }
        

        return root;

    }
}