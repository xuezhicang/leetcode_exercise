/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode truehead = new ListNode(1);
        //use this node to point every node until the end.
        ListNode head = truehead; 
        while(l1!=null || l2!=null )
        {
            if(l1!=null && l2!=null && l1.val<l2.val)
            {
                head.next = l1;
                head = l1;
                l1 = l1.next;
            }
            else if(l1!=null && l2!=null && l1.val>=l2.val)
            {
                head.next = l2;
                head = l2;
                l2 = l2.next;
            }    
            else if(l1==null && l2!=null )
            {
                head.next = l2;
                head = l2;
                l2 = l2.next;
            }            
            else if(l1!=null && l2==null )
            {
                head.next = l1;
                head = l1;
                l1 = l1.next;
            }

    
        }
        return truehead.next;
        
    }
}