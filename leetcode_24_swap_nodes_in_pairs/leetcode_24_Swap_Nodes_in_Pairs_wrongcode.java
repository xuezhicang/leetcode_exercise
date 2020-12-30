/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode curNode = head;
        
            
        System.out.println(head.next.val);
        
        System.out.println(curNode.next);
        System.out.println(head.next);
        System.out.println(head);
        System.out.println(curNode) ;
        System.out.println();
        
        curNode.next = head.next.next;
        
        System.out.println(curNode.next);
        System.out.println(head.next);
        
        
        
        System.out.println(curNode.next.val);
        System.out.println(head.next.val);
        
    

        
        
        return head;
        
    }
}