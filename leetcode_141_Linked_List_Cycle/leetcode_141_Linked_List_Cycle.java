public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!= null || slow != null)
        {
            if(slow.next == null)
                return false;
            if(fast.next == null || fast.next.next ==null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
            if(slow.val == fast.val)
                return true;
            
            
        }
        return false;
        
    }
}