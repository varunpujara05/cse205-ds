class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode prev = dum;

        while (head != null) {
            ListNode start = head;
            ListNode end = g_end(head, k);

            if (end == null)
                break;

            prev.next = reverseList(start, end.next);
            prev = start;
            head = prev.next;
        }

        ListNode n_head = dum.next;
        return n_head;
    }

    private ListNode g_end(ListNode head, int k) {
        while (head != null && --k > 0)
            head = head.next;
        return head;
    }

    private ListNode reverseList(ListNode head, ListNode stop) {
        ListNode prev = stop;
        while (head != stop) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}