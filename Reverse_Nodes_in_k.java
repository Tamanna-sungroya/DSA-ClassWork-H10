class Solution {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (true) {
            ListNode end = prev;

            for (int i = 0; i < k; i++) {
                end = end.next;
                if (end == null) return dummy.next;
            }

            ListNode curr = prev.next;
            ListNode next = end.next;
            ListNode p = next;
            
            while (curr != next) {
                ListNode temp = curr.next;
                curr.next = p;
                p = curr;
                curr = temp;
            }

            ListNode temp = prev.next;
            prev.next = end;
            prev = temp;
        }
    }
}