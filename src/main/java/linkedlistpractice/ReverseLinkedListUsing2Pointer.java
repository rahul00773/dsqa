
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: ReverseLinkedListUsing2Pointer.java, v 0.1 2020-04-05 12:58 rahul.kumar Exp $$
 */
public class ReverseLinkedListUsing2Pointer {

    public static void main(String[] args){

        LinkedList  linkedList = new LinkedList();

        LinkedList.Node a = new LinkedList.Node(1);
        LinkedList.Node b = new LinkedList.Node(2);
        LinkedList.Node c = new LinkedList.Node(3);
        LinkedList.Node d = new LinkedList.Node(4);


        linkedList.head = a;
        a.next=b;
        b.next=c;
        c.next=d;

        linkedList.printLinkList(revevseLinkedList(linkedList.head));
    }


    public static LinkedList.Node revevseLinkedList(LinkedList.Node node){


        LinkedList.Node current = node;

        LinkedList.Node next = null;


        while (current.next!=null){

          next= current.next;

          current.next = next.next;

          next.next = node;
          node= next;


        }



        return node;
    }
}