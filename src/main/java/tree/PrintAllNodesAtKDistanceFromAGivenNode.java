
package tree;

/**
 * @author rahul.kumar
 * @version $Id: PrintAllNodesAtKDistanceFromAGivenNode.java, v 0.1 2020-05-31 06:18 rahul.kumar Exp $$
 */
public class PrintAllNodesAtKDistanceFromAGivenNode {

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

        PrintAllNodesAtKDistanceFromAGivenNode printAllNodesAtKDistanceFromAGivenNode = new PrintAllNodesAtKDistanceFromAGivenNode();

       TreeNode target =binaryTree.root.left;
        printAllNodesAtKDistanceFromAGivenNode.printkdistanceNode(binaryTree.root,target,2);
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

    int printkdistanceNode(TreeNode node, TreeNode target, int k){

        if(node==null)
            return -1;


        if(node == target){
            printKNodesFromRoot(node,k);
            return 0;
        }


        int dl = printkdistanceNode(node.left,target,k);

        if(dl!=-1){
            if (dl + 1 == k)
            {
                System.out.print(node.data);
                System.out.println("");
            }

            else
                printKNodesFromRoot(node.right, k - dl - 2);

            // Add 1 to the distance and return value for parent calls
            return 1 + dl;
        }

        int dr = printkdistanceNode(node.right,target,k);

        if(dr!=-1){
            if(dr+1==k){
                System.out.println(node.data);
                System.out.println("");
            }

            else
                printKNodesFromRoot(node.left,k-dr-2);

            return 1+dr;
        }

        return -1;
    }
}