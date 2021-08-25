class Solution {
    
    public ListNode helper(ListNode head){
        
        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next!= null){
            temp = slow;
            slow= slow.next;
            fast = fast.next.next;
            
        }
        if (temp!= null)
            temp.next = null;
        
        return slow;
        
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head == null) return null;
        
        ListNode mid = helper(head);
        
        TreeNode root = new TreeNode(mid.val);
        
        if(mid == head) return root;
        
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        
        
        return root;
        
        
    }
}