import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeBottom {
    public static void main(String[] args) {
        /*
        *    1
        *  2   3
        * 4  5    6
        *  7
        *
        * */
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        node4.right=node7;


        List<Integer> list=getBottom(node1);
        for(Integer i:list){
            System.out.println(i);
        }
    }



    private static List<Integer> getBottom(TreeNode root) {
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        List<Integer> list=new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode pop = queue.pop();
            if(pop.left!=null || pop.right!=null){
                list.add(pop.value);
            }
            if(pop.left!=null){
                queue.offer(pop.left);
            }
            if(pop.right!=null){
                queue.offer(pop.right);
            }
        }

        return list;
    }
}
