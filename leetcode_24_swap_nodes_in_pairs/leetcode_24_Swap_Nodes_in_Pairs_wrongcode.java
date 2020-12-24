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
        
        if(head == null || head.next ==null)
            return head;
        
        System.out.println("打印 head地址  " + head); //打印 head的地址
        ListNode temp_1 = curNode;
        ListNode temp_2 = curNode.next;
        
        System.out.println("打印 链表中第二个节点的地址 curNode 的 next  " + curNode.next); //打印 链表中第二个节点的地址
        System.out.println("打印 temp_2 的地址: " + temp_2);// 打印 temp_2 的地址
        System.out.println("打印 链表中 temp_2 的next的地址" + temp_2.next);// 打印 链表中第三个节点的地址
        System.out.println("打印 temp_2 的数值: " + temp_2.val); // 打印 链表中第三个节点的数值
        System.out.println("打印 链表中temp_2 的next的的数值  " + temp_2.next.val);// 打印 链表中第三个节点的数值
        System.out.println();
        
        curNode.next.next = curNode; //罪魁祸首
        
        
        System.out.println("打印 temp_2 的下一个节点 的数值: " + temp_2.next.val); // 打印 链表中第三个节点的数值
        System.out.println("打印 temp_2 的数值: " + temp_2.val); // 打印 链表中第三个节点的数值
        System.out.println("打印 temp_2 的地址: " + temp_2);// 打印 temp_2 的地址
        System.out.println("打印 链表中temp 的next的地址" + temp_2.next);// 打印 链表中第三个节点的地址
        
        
        
    

        
        
        return head;
        
    }
}