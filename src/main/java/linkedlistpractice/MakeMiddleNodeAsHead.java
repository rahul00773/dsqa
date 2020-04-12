
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: MakeMiddleNodeAsHead.java, v 0.1 2020-04-11 20:16 rahul.kumar Exp $$
 */
public class MakeMiddleNodeAsHead {

    public static void main(String[] args){
        LinkedList linkedList =new LinkedList();

        LinkedList.Node a = new LinkedList.Node(1);
        LinkedList.Node b = new LinkedList.Node(2);
        LinkedList.Node c = new LinkedList.Node(3);
        LinkedList.Node d = new LinkedList.Node(4);
        LinkedList.Node e = new LinkedList.Node(5);


        linkedList.head = a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        linkedList.printLinkList(makeMiddleHead(linkedList.head));

    }


    public static LinkedList.Node makeMiddleHead(LinkedList.Node head){

        LinkedList.Node current = head;

        LinkedList.Node p = head;
        LinkedList.Node pre=null;

        while (p!=null &&p.next!=null){
            p=p.next.next;
            pre=current;
            current= current.next;

        }

        pre.next =current.next;


        current.next=head;

        return current;




    }



}