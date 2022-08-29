public class Sum {

    public static void main(String[] args) {
        System.out.println(32 / 8 * (2 + 2));
        ListNode a = new ListNode();
        a.next = new ListNode();
        System.out.println(a);
        Object obj = (Object)a;
        boolean is = obj instanceof ListNode;
        System.out.println();
    }
}
