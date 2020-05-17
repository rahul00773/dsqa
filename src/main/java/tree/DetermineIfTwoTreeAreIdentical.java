
package tree;

/**
 * @author rahul.kumar
 * @version $Id: DetermineIfTwoTreeAreIdentical.java, v 0.1 2020-05-17 13:43 rahul.kumar Exp $$
 */
public class DetermineIfTwoTreeAreIdentical {

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


        BinaryTree binaryTree1 = new BinaryTree();

        binaryTree1.root = new TreeNode("a");
        binaryTree1.root.left = new TreeNode("b");
        binaryTree1.root.right = new TreeNode("c");
        binaryTree1.root.left.left = new TreeNode("d");
        binaryTree1.root.left.right = new TreeNode("e");
        binaryTree1.root.left.left.left = new TreeNode("h");
        binaryTree1.root.left.left.right = new TreeNode("i");
        binaryTree1.root.right.left = new TreeNode("f");
        binaryTree1.root.right.right = new TreeNode("g");
        binaryTree1.root.right.left.left = new TreeNode("j");
        binaryTree1.root.right.left.right = new TreeNode("k");
        binaryTree1.root.right.right.right = new TreeNode("l");
        binaryTree1.root.right.right.right.left = new TreeNode("m");
        binaryTree1.root.right.right.right.right = new TreeNode("n");


        System.out.println(identicalTrees(binaryTree.root,binaryTree1.root));

    }

    public static boolean identicalTrees(TreeNode root1, TreeNode root2){

        if(root1==null && root2==null)
            return true;


        if(root1!=null && root2!=null){

            if(root1.data== root2.data) {
               return identicalTrees(root1.left, root2.left) &&  identicalTrees(root1.right,root2.right);


            }
        }



        return false;
    }
}