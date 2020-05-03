
package tree;

/**
 * @author rahul.kumar
 * @version $Id: BinaryTree.java, v 0.1 2020-05-03 10:34 rahul.kumar Exp $$
 */
public class BinaryTree {

    TreeNode root;

    BinaryTree(int x){
        root=new TreeNode(x);
    }

    BinaryTree(){
        root=null;
    }




    public static void printTree(TreeNode root){


        if(root==null){
            return;
        }
        else {
            System.out.println(root.key);
        }

        TreeNode p = root;
        TreeNode q = root;
        while (p.right!=null){

            System.out.println(p.right.key);
            p = p.right;

        }

        while (q.left!=null){
            System.out.println(q.left.key);
            q=q.left;
        }

    }


    public static void printStrignTree(TreeNode root){


        if(root==null){
            return;
        }
        else {
            System.out.println(root.data);
        }

        TreeNode p = root;
        TreeNode q = root;
        while (p.right!=null){

            if(p.left!=null) {
                System.out.println(p.left.data);
            }
            System.out.println(p.right.data);
            p = p.right;

        }

        while (q.left!=null){
            System.out.println(q.left.data);
            if(q.right!=null){
            System.out.println(q.right.data);}
            q=q.left;
        }

    }

}