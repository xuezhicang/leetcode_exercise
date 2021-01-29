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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        if(lists.length == 1)
            return lists[0]; 
        
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(
            new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        }); 
        
        for(int i=0;i<lists.length;i++)
        {
            if(lists[i] != null)
                pq.add(lists[i]);
        }
         ListNode dummy = new ListNode(-1), cur = dummy;
        while(pq.isEmpty() != true)
        {
            ListNode temp = pq.poll();
            cur.next = temp;
            cur = cur.next;
            if(temp.next!=null)
                pq.add(temp.next);
            
        }
        return dummy.next;
        
    }
}