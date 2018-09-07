public class 链表删除重复元素 {

    //todo 没搞懂
    public static void main(String[] args) {

        链表删除重复元素 root = new 链表删除重复元素();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(2);
        node.next.next.next.next = new ListNode(3);
        node.next.next.next.next.next = new ListNode(5);
        ListNode newNode = root.deleteNode(node);
    }

    private ListNode deleteNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode cur;
        if (head.val == head.next.val) {
            cur = head.next.next;
            while (cur != null && cur.val == head.val) {
                cur = cur.next;
            }
            return deleteNode(cur);
        }
        head.next = deleteNode(head.next);

        return head;
    }


}
