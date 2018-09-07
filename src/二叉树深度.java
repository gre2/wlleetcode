public class 二叉树深度 {

    public static void main(String[] args) {
        二叉树深度 tree = new 二叉树深度();
        TreeNode node = new TreeNode();
        int depth = tree.treeDepth(node);
    }

    private int treeDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        int left = treeDepth(node.left);
        int right = treeDepth(node.right);
        return left > right ? left + 1 : right + 1;
    }
}
