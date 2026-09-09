class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Find node before left
        ListNode before = dummy;

        for (int i = 1; i < left; i++) {
            before = before.next;
        }

        // Save the original first node
        ListNode leftNode = before.next;

        // Find node after right
        ListNode after = leftNode;

        for (int i = left; i <= right; i++) {
            after = after.next;
        }

        // Normal reversal
        ListNode prev = null;
        ListNode curr = leftNode;

        for (int i = left; i <= right; i++) {
            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        before.next = prev;
        leftNode.next = after;

        return dummy.next;
    }
}