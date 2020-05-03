
package tree;

/**
 * @author rahul.kumar
 * @version $Id: InsertElementToTree.java, v 0.1 2020-05-03 10:22 rahul.kumar Exp $$
 */
public class InsertElementToTree {


    public static void main(String[] args){


      BinaryTree tree = new BinaryTree();

      tree.root= new TreeNode(1);

     tree.root.left = new TreeNode(4);
     tree.root.right = new TreeNode(5);


     tree.root.left.left = new TreeNode(6);
     tree.root.right.right = new TreeNode(7);


     tree.printTree(tree.root);

    }




}