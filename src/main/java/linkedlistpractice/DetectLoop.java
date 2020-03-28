
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: DetectLoop.java, v 0.1 2020-03-28 21:43 rahul.kumar Exp $$
 */
public class DetectLoop {

    public static void main(String[] args){

        LinkedList linkedList =new LinkedList();

        LinkedList.Node a = new LinkedList.Node(1);
        LinkedList.Node b = new LinkedList.Node(2);
        LinkedList.Node c = new LinkedList.Node(3);
        LinkedList.Node d = new LinkedList.Node(4);
        LinkedList.Node f = new LinkedList.Node(4);


        linkedList.head = a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=f;
        f.next=d;

        System.out.println(delectLoop(linkedList.head));

    }

    public static boolean delectLoop(LinkedList.Node head){


        LinkedList.Node slow = head;
        LinkedList.Node fast = head.next;

        while (slow!=fast){

            if(fast.next==null || fast==null){
                return false;
            }

            slow= slow.next;
            fast=fast.next.next;
        }

        return true;
    }
}