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
        ListNode newNode = root.deleteDuplication1(node);
    }

    //1,2,2,2,3,5---->  1,3,5
    public static ListNode deleteDuplication1(ListNode head) {
        ListNode bak=new ListNode(0);
        ListNode bakMove=bak;
        while(head!=null){
            if(head.next !=null && head.val==head.next.val){
                int val = head.val;
                while(head !=null && head.val==val){
                    head=head.next;
                }
            }else{
                bakMove.next=head;//1,3,5
                head=head.next;//null
                bakMove=bakMove.next;//5
            }
        }

        return bak.next;
    }
    //1,2,2,2,3,5---->  1,2,3,5
    public static ListNode deleteDuplication2(ListNode head) {
        ListNode bak=new ListNode(0);
        ListNode bakMove=bak;
        while(head!=null){
            if(head.next !=null && head.val==head.next.val){
                head=head.next;
            }else{
                bakMove.next=head;//1,3,5
                head=head.next;//null
                bakMove=bakMove.next;//5
            }
        }

        return bak.next;
    }

}
