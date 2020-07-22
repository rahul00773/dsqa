package tree;

import java.util.*;

public class ZigZagTraversalOfBinaryTree {


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
        HashMap<Integer, ArrayList<String>> hashMap = new HashMap<>();
        List<List<String>> map=traversalBinaryTree(binaryTree.root);
      printHashMap(map);

    }


    public static List<List<String>> traversalBinaryTree(TreeNode root) {
        List<List<String>> result = new ArrayList<>();
        if (root == null)
            return result;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean l2r = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<String> tempRes = new ArrayList();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                tempRes.add(node.data);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            if (!l2r) {
                Collections.reverse(tempRes);
            }

            l2r = !l2r;
            result.add(tempRes);
        }
        return result;
    }

    public static void printHashMap(List<List<String>> map){


       for(List<String> Inte: map){

           System.out.println(Inte);
       }
    }

}