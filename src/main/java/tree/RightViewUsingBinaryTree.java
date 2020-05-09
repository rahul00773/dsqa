
package tree;

/**
 * @author rahul.kumar
 * @version $Id: RightViewUsingBinaryTree.java, v 0.1 2020-05-09 16:35 rahul.kumar Exp $$
 */
public class RightViewUsingBinaryTree {

    static int max=0;
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

        printRightView(binaryTree.root);
    }

    public static void printRightView(TreeNode treeNode){


        printRightViewUsingPreOrder(treeNode,1);

    }


    public static void printRightViewUsingPreOrder(TreeNode treeNode, int level){

        if(treeNode==null){
            return;
        }

        if(max<level) {
            System.out.println(treeNode.data);
            max = level;
        }

        printRightViewUsingPreOrder(treeNode.right,level+1 );
        printRightViewUsingPreOrder(treeNode.left,level+1 );


    }
}