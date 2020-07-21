
package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author rahul.kumar
 * @version $Id: DiagonalTraversal.java, v 0.1 2020-05-03 10:54 rahul.kumar Exp $$
 */
public class DiagonalTraversal {

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


        printBinaryTreeDiagonally(binaryTree.root);
    }


    public static void printBinaryTreeDiagonally(TreeNode rootNode) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(rootNode);
        queue.add(null);
        while (queue.size() > 0) {
            TreeNode temp = queue.peek();
            queue.remove();
            if (temp == null) {
                if (queue.isEmpty()) {
                    return;
                }
                System.out.println();
                queue.add(null);
            }
            while (temp != null) {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                temp = temp.right;
            }
        }

    }
}