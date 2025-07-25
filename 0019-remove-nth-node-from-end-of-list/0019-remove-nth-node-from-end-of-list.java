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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode point=head;
        int length=0;
        while(point!=null){
            length++;
            point=point.next;
        }
        if(length==n)
        return head.next;
        point=head;
        for(int i=1;i<length-n;i++)
        {
            point=point.next;
        }
        point.next=point.next.next;
        return head;
    }
}