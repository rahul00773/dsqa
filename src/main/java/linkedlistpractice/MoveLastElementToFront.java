
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: MoveLastElementToFront.java, v 0.1 2020-03-31 23:08 rahul.kumar Exp $$
 */
public class MoveLastElementToFront {

    public static void main(String[] args){
        LinkedList linkedList =new LinkedList();

        LinkedList.Node a = new LinkedList.Node(1);
        LinkedList.Node b = new LinkedList.Node(2);
        LinkedList.Node c = new LinkedList.Node(3);
        LinkedList.Node d = new LinkedList.Node(4);


        linkedList.head = a;
        a.next=b;
        b.next=c;
        c.next=d;

       linkedList.printLinkList(moveLastElementToFirst(linkedList.head));

    }

    public static LinkedList.Node moveLastElementToFirst(LinkedList.Node head){

        LinkedList.Node current = head;

        while (current.next.next!=null){

            current = current.next;

        }

        LinkedList.Node temp = current.next;
        current.next=null;

        temp.next=head;
        return temp;
    }
}