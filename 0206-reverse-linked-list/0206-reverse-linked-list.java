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
 import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode  curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        Collections.reverse(list);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int i = 0; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }

        return dummy.next;
    }
}