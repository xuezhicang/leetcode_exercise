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
    public ListNode deleteDuplicates(ListNode head) {
        //Create Sentinel Node
        ListNode trueHead = new ListNode(-200);
        trueHead.next = head;
        
        //creat a node as the pre-processor
        ListNode node = trueHead;
        
        //if the pre-processor node has two nodes after it,
        //  we go into the loop
        while(node.next!= null && node.next.next!=null)
        {
            // if the next node != the next node of the next node
            if(node.next.val!=node.next.next.val)
            {
                //move the node forward one step
                node = node.next;
            }
            else
            {
                //create a temp node
                ListNode temp = node.next;
                //move the node to the tail of the repeated nodes
                while(temp.next!=null && temp.val == temp.next.val)
                {
                    temp = temp.next;
                }
                //move the node one step to point a node with new value
                temp = temp.next;
                
                node.next = temp;   
            }
        }
        return trueHead.next;    
    }
}