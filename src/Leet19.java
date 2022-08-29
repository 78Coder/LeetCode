public class Leet19 {

    //46
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode yummyHead = new ListNode();
        yummyHead.next = head;
        ListNode slow = yummyHead;
        ListNode fast = yummyHead;
        ListNode pre = null;
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        if (pre != null) {
            pre.next = pre.next.next;
        }
        return yummyHead.next;
    }
}
