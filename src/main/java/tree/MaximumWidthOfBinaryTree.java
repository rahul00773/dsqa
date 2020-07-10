package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root = new TreeNode("a");

        binaryTree.root.left = new TreeNode("b");

        binaryTree.root.right = new TreeNode("c");

        binaryTree.root.left.left = new TreeNode("d");

        binaryTree.root.left.right = new TreeNode("e");

        binaryTree.root.left.left.left = new TreeNode("h");

        binaryTree.root.left.left.right = new TreeNode("i");

        binaryTree.root.right.left = new TreeNode("f");

        binaryTree.root.right.right = new TreeNode("g");

        binaryTree.root.right.left.left = new TreeNode("j");
        binaryTree.root.right.left.right = new TreeNode("k");
        binaryTree.root.right.right.right = new TreeNode("l");
        binaryTree.root.right.right.right.left = new TreeNode("m");
        binaryTree.root.right.right.right.right = new TreeNode("n");


        System.out.println(maximumWidth(binaryTree.root));
    }

    public static int maximumWidth(TreeNode node){

        if(node ==null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(node);
        queue.add(null);
        int width=0;

        while (!queue.isEmpty()) {

            TreeNode temp = queue.poll();

            if (temp == null) {
                width = width + 1;
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        return width;

    }
}
