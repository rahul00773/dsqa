
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: DeleteNNodesAfterMUsingRecursion.java, v 0.1 2020-04-26 22:30 rahul.kumar Exp $$
 */
public class DeleteNNodesAfterMUsingRecursion {


    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        LinkedList.Node a = new LinkedList.Node(0);
        LinkedList.Node b  = new LinkedList.Node(1);
        LinkedList.Node c = new LinkedList.Node(1);
        LinkedList.Node d = new LinkedList.Node(2);
        LinkedList.Node e = new LinkedList.Node(2);
        LinkedList.Node f = new LinkedList.Node(3);
        LinkedList.Node g = new LinkedList.Node(3);
        LinkedList.Node h = new LinkedList.Node(4);
        LinkedList.Node i = new LinkedList.Node(5);


        linkedList.head =a;
        a.next = b;
        b.next=c;
        c.next =d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next =i;

    }


    public static void deleteMNodes(LinkedList.Node head, int m , int n){


        LinkedList.Node current = head;


        LinkedList.Node node= null;

        while (current!=null){

            for(int i =0; i<m && current!=null; i++){
                current = current.next;
            }

            rec(current, n);
        }

    }

    public static void rec(LinkedList.Node head, int n){



    }
}