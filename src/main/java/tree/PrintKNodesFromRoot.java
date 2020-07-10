
package tree;

/**
 * @author rahul.kumar
 * @version $Id: PrintKNodesFromRoot.java, v 0.1 2020-05-30 15:51 rahul.kumar Exp $$
 */
public class PrintKNodesFromRoot {

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

        printKNodesFromRoot(binaryTree.root,2);


    }

    public static void printKNodesFromRoot(TreeNode root, int k){

        if(root==null){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }

        printKNodesFromRoot(root.left,k-1);
        printKNodesFromRoot(root.right,k-1);


    }
}