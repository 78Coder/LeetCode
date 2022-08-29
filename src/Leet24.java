public class Leet24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head.next;
        ListNode pre = head;
        ListNode tmp = head.next.next;
        cur.next = pre;
        pre.next = tmp;
        head = cur;
        while (tmp != null && tmp.next != null) {
            cur.next = cur.next.next;
            pre = tmp;
            cur = tmp.next;
            tmp = tmp.next.next;
            cur.next = pre;
            pre.next = tmp;
        }
        return head;
    }
}
