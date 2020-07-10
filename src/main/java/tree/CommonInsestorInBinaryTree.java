package tree;

public class CommonInsestorInBinaryTree {


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

        System.out.println(getCommonInsestor(binaryTree.root,"d","e").data);
    }

    public static TreeNode getCommonInsestor(TreeNode node, String a, String b){


        if(node==null){
            return node;
        }

        if(node.data==a || node.data==b)
         return node;

        TreeNode leftLca = getCommonInsestor(node.left,a,b);
        TreeNode rightRca = getCommonInsestor(node.right,a,b);

        if(leftLca!=null && rightRca!=null){
            return node;
        }
        return (leftLca!=null)?leftLca:rightRca;

    }
}
