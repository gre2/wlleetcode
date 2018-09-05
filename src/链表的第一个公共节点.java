public class 链表的第一个公共节点 {

    //1-2-3-4-5-3-4
    //1-3-5-4-3-5-4
    //找到4，4-5-3；1-2-3；找到3
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        ListNode root3 = new ListNode(3);
        root.next.next = root3;
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        root.next.next.next.next.next = root3;
        ListNode node = getSampleNode(root);
        System.out.println("1111111111111");
    }

    private static ListNode getSampleNode(ListNode root) {
        if (root == null) {
            return null;
        }
        ListNode slow = root;
        ListNode fast = root;
        while (true) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.val == fast.val) {
                break;
            }
        }
        slow = root;
        while (true) {
            slow = slow.next;
            fast = fast.next;
            if (slow.val == fast.val) {
                break;
            }
        }
        return fast;
    }
}
