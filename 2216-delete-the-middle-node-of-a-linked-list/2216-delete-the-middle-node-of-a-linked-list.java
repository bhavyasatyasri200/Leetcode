class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int count = length / 2;
        temp = head;
        for (int i = 1; i < count; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}
