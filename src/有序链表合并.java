public class 有序链表合并 {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        ListNode root2 = new ListNode(4);
        root2.next = new ListNode(5);
        ListNode node = mergeNodeList(root, root2);
        System.out.println("1111111111");
    }


    private static ListNode mergeNodeList(ListNode root, ListNode root2) {
        if (root == null) {
            return root2;
        }
        if (root2 == null) {
            return root;
        }
        if (root.val <= root2.val) {
            root.next = mergeNodeList(root.next, root2);
            return root;
        } else {
            root2.next = mergeNodeList(root, root2.next);
            return root2;
        }
    }


}
