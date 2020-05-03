
package tree;

/**
 * @author rahul.kumar
 * @version $Id: TreeNode.java, v 0.1 2020-05-03 10:19 rahul.kumar Exp $$
 */
public class TreeNode {

    int key;

    String data;
    TreeNode left,right;

     TreeNode(int x){

       key = x;

      left=right=null;


    }


    TreeNode(String x){

        data = x;

        left=right=null;


    }





}