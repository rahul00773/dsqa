package tree;

public class HeightOfBinaryTree {


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

        System.out.println(getBinaryTree(binaryTree.root));

    }


    public static int getBinaryTree(TreeNode node){

        if(node==null){
            return 0;
        }

        else{
            int left=getBinaryTree(node.left);
            int right= getBinaryTree(node.right);
            if(left>right){
                return left+1;
            }


            else {
                return  right+1;
            }

        }




    }
}
