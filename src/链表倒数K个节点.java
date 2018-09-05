public class 链表倒数K个节点 {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        ListNode node = findK(root, 3);
        System.out.println("1111111111111");
    }

    private static ListNode findK(ListNode root, int step) {
        if (root == null) {
            return null;
        }
        ListNode slow = root;
        ListNode fast = root;
        for (int i = 1; i < step; i++) {
            if (slow.next != null) {
                slow = slow.next;
            }
        }
        while (slow.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
