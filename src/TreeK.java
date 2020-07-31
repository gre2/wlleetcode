import java.util.*;

public class TreeK {

    //二叉树第k层节点个数
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        root.left = node1;
        root.right = node2;
        node2.left = node3;

        TreeK test = new TreeK();
        int numbers = 0;
        numbers = test.getNodesNumberKLevel(root, 1);
        System.out.println("The numbers of nodes of level 3 is : " + numbers);

    }

    public int getNodesNumberKLevel(TreeNode root, int k) {

        int count = 0;
        if(root == null || k <= 0 || k > getDepthOfTree(root)) {
            return count;
        }
        if(k == 1) {
            return 1;
        }
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            if(count == k - 1) {
                return size;
            }
            ArrayList<Integer> level = new ArrayList<Integer>();
            for(int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.value);
                if(head.left != null) {
                    queue.offer(head.left);
                }
                if(head.right != null) {
                    queue.offer(head.right);
                }
            }
            count++;
        }
        return count;
    }
    public int getDepthOfTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = getDepthOfTree(root.left);
        int right = getDepthOfTree(root.right);
        return Math.max(left,right) + 1;
    }

}
