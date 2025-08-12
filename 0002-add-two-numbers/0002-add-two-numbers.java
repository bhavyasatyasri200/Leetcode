class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to simplify result list creation
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        // Traverse while there are digits left or a carry remains
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0; // value from l1
            int val2 = (l2 != null) ? l2.val : 0; // value from l2

            int sum = val1 + val2 + carry; // add both digits + carry
            carry = sum / 10;              // update carry
            current.next = new ListNode(sum % 10); // create new node
            current = current.next;        // move forward

            // Move l1 and l2 pointers if possible
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next; // skip dummy and return result head
    }
}
