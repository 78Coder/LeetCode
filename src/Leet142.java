import java.util.*;

public class Leet142 {

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                pre = slow;
                break;
            }
        }
        while (pre != slow) {
            pre = pre.next;
            slow = slow.next;
        }
        HashMap<Integer, Object> objectObjectHashMap = new HashMap<>();
        Iterator<Integer> iterator = objectObjectHashMap.keySet().iterator();
        objectObjectHashMap.entrySet();
        Collection<Object> values = objectObjectHashMap.values();
        for (Object value : values) {

        }
        return slow;
    }
}
