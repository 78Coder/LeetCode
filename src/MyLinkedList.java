public class MyLinkedList {

    ListNode head;
    ListNode tail;
    int length;


    public MyLinkedList() {
        head = new ListNode();
        tail = head;
        length = 0;
    }

    public int get(int index) {
        index++;
        if (index > length) {
            return -1;
        }
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode();
        node.val = val;
        node.next = head.next;
        head.next = node;
        length++;

    }

    public void addAtTail(int val) {

        ListNode cur = head;
        for (int i = 0; i < length; i++) {
            cur = cur.next;
        }
        ListNode node = new ListNode();
        node.val = val;
        cur.next = node;
        length++;
    }

    public void addAtIndex(int index, int val) {
        index++;
        if (index > length + 1) {
            return;
        }
        ListNode cur = head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        ListNode node = new ListNode();
        node.val = val;
        node.next = cur.next;
        cur.next = node;
        length++;
    }

    public void deleteAtIndex(int index) {
        index++;
        if (index > length) {
            return;
        }
        ListNode cur = head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        length--;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1,2);
        list.get(1);
    }
}
