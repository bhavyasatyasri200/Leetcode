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
    public ListNode middleNode(ListNode head) {
         if (head == null) return null;
        int length=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            length++;
        }
        int mid=length/2;
        temp=head;
        for(int i=0;i<mid;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
}