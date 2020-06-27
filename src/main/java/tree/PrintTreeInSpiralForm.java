package tree;

import java.util.Stack;

public class PrintTreeInSpiralForm {

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

        printTreeInSpiralForm(binaryTree.root);
    }

    public static void printTreeInSpiralForm(TreeNode node) {
        if (node == null)
            return;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(node);
        while (!s1.isEmpty() || !s2.empty()) {
            while (!s1.isEmpty()) {
                TreeNode Node = s1.peek();
                s1.pop();
                System.out.println(Node.data + " ");
                if (Node.right != null) {
                    s2.push(Node.right);
                }

                if (Node.left != null) {
                    s2.push(Node.left);
                }
            }
            while (!s2.empty()) {
                TreeNode node1 = s2.peek();
                s2.pop();
                System.out.println(node1.data + " ");
                if (node1.left != null) {
                    s1.push(node1.left);
                }
                if (node1.right != null) {
                    s1.push(node1.right);
                }
            }
        }

    }
}
