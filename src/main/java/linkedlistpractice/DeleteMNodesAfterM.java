
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: DeleteMNodesAfterM.java, v 0.1 2020-04-26 12:25 rahul.kumar Exp $$
 */
public class DeleteMNodesAfterM {


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


        linkedList.printLinkList(deleteNode(linkedList.head,2,2));
    }


    public static LinkedList.Node deleteNode(LinkedList.Node head, int m , int n){

        LinkedList.Node current = head;

        LinkedList.Node next= head;

        while (current!=null ){


            for (int i=0; i<m && current!=null; i++){

                current= current.next;
            }

           if(current==null)
               return head;

            next=current.next;


            for(int i =0; i<n && next!=null;i++){

                next= next.next;
            }

            current.next=next;

           current=next;
        }

return head;
    }
}