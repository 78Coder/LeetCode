public class Leet206 {

    public ListNode reverseList(ListNode head) {

        ListNode cur = head;
        ListNode tmp;
        ListNode pre = null;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
