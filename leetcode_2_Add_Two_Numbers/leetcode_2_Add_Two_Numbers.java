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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode res = new ListNode(0); 
        ListNode head = res;
        int temp;
        int dig_10 = 0;
        
        while(l1 != null || l2 !=null)
        {
               
            if(l1 != null && l2 !=null)
            {
                temp = l1.val + l2.val + dig_10;
 
                ListNode cur = new ListNode(temp%10);
                dig_10 = temp/10;
                
                res.next = cur;
                res = cur;
                
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1 == null)
            {
                temp =  l2.val + dig_10;
                ListNode cur = new ListNode(temp%10);
                dig_10 = temp/10;
                
                res.next = cur;
                res = cur;
                
                l2 = l2.next;                
            }
            else if(l2 == null)
            {
                temp =  l1.val + dig_10;
                ListNode cur = new ListNode(temp%10);
                dig_10 = temp/10;
                
                res.next = cur;
                res = cur;
                
                l1 = l1.next;                   
            }
        }

        if(dig_10==1)
        {
            ListNode cur = new ListNode(dig_10); 
            res.next = cur;
            res = cur;            
        }

        return head.next;
        
    }
}