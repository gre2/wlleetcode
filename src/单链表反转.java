import java.util.Stack;

public class 单链表反转 {


    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        ListNode node = reverse(root);
        System.out.println("1111111111111");
        //stacknode和上面两行代码不能共存，会破坏链表结构
        ListNode stacknode = reverseByStack(root);
        System.out.println("1111111111111");
    }


    private static ListNode reverse(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }


    private static ListNode reverseByStack(ListNode root) {
        Stack<ListNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.next;
        }
        while (!stack.isEmpty()) {
            ListNode temp = stack.pop();
            System.out.println("temp value=" + temp.val);
        }
        //输出顺序54321，可以使用链表把这些值连起来，也是反转
        return null;
    }


}
