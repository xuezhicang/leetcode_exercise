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
        
        //if the l1 is empty
        //  we return the current l2 to l1.next
        if(l1 == null)
            return l2;
        //if the l2 is empty
        //  we return the current l1 to l2.next 
        if(l2 == null)
            return l1;
        //if l1 is smaller, so we should return the l1 node to the father level
        if(l1.val<=l2.val)
        {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
        //if l2 is smaller, so we should return the l2 node to the father level
        else 
        {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }            
        
    }
}