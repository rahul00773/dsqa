
package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rahul.kumar
 * @version $Id: PrintBinaryTreeInVerticalOrder.java, v 0.1 2020-05-17 14:19 rahul.kumar Exp $$
 */
public class PrintBinaryTreeInVerticalOrder {

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
        HashMap<Integer, ArrayList<String>> map=printVerticalLevel(binaryTree.root,0,hashMap);
        printHashMap(map);


    }

    public static HashMap<Integer, ArrayList<String>> printVerticalLevel(TreeNode node, int index, HashMap<Integer, ArrayList<String>> hashMap){


        if(node == null)
            return null;

       /* ArrayList<String> get =  hashMap.get(index);

        // Store current node in map 'm'
        if(get == null)
        {
            get = new ArrayList<>();
            get.add(node.data);
        }
        else
            get.add(node.data);

        hashMap.put(index, get);*/



        if(!hashMap.containsKey(index)) {
            ArrayList<String> list = new ArrayList<>();

            list.add(node.data);
            hashMap.put(index, list);
        }
        else {
           ArrayList<String> list  = hashMap.get(index);
           list.add(node.data);
            hashMap.put(index, list);

        }

        printVerticalLevel(node.left,index-1,hashMap);
        printVerticalLevel(node.right,index+1,hashMap);


        return hashMap;
    }


    public static void printHashMap(HashMap<Integer,ArrayList<String>> map){
        for (Map.Entry<Integer, ArrayList<String>> map1 : map.entrySet())
        {
            System.out.println(map1.getKey());
            System.out.println(map1.getValue());
        }
    }

}