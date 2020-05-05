
package tree;

/**
 * @author rahul.kumar
 * @version $Id: InorderTraversal.java, v 0.1 2020-05-03 10:53 rahul.kumar Exp $$
 */
public class InorderTraversal {

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

        inOrderTraversal(binaryTree.root);

    }

    public static void inOrderTraversal(TreeNode treeNode){

        if(treeNode==null){
            return;
        }

        System.out.println(treeNode.data);

        inOrderTraversal(treeNode.left);
        inOrderTraversal(treeNode.right);

    }
}