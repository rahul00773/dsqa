
package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author rahul.kumar
 * @version $Id: RightViewOfBinaryTree.java, v 0.1 2020-05-07 22:54 rahul.kumar Exp $$
 */
public class RightViewOfBinaryTree {

    public static void main(String[] args){
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

        printRightViewOfBinaryTree(binaryTree.root);
    }

    public static void printRightViewOfBinaryTree(TreeNode treeNode){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        queue.add(null);
        System.out.println(treeNode.data);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp == null) {

                if (!queue.isEmpty()) {
                    System.out.println(((LinkedList<TreeNode>) queue).peekLast().data);
                    queue.add(null);
                }

            } else {
                if (temp.left != null) {
                    //System.out.print(temp.data + " ");
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
    }
}