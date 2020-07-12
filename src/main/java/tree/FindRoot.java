package tree;

public class FindRoot {

    public static void main(String[] args){


        BinaryTree binaryTree  = new BinaryTree();
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

        System.out.println(findNode(binaryTree.root,"n").data);
    }

    static TreeNode node=null;
    public static TreeNode findNode(TreeNode root, String val) {



        if(root==null){
            return null;
        }


        if(root.data ==val){
            node= root;
        }

        if(root.right==null && root.left ==null){
            return null;
        }


        findNode(root.left,val);
        findNode(root.right,val);



return node;



    }
}
