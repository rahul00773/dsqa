package tree;

public class isBSTUtil {

    public static void main(String[] args){



    }

    public static boolean validateBST(TreeNode root) {


        return isBSTUtil(root,Integer.MIN_VALUE,
                Integer.MAX_VALUE);


    }

    public static boolean isBSTUtil(TreeNode node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.key < min || node.key > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.key-1) &&
                isBSTUtil(node.right, node.key+1, max));
    }

}
