
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: RemoveEveryKthNodeInLinkedList.java, v 0.1 2020-04-14 23:01 rahul.kumar Exp $$
 */
public class RemoveEveryKthNodeInLinkedList {

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

       // linkedList.printLinkList(removeKthNodeUsingIterator(linkedList.head,3));
      //  linkedList.printLinkList(removeKthNodeRecursively(linkedList.head,3));
    }


    public static LinkedList.Node removeKthNodeUsingIterator(LinkedList.Node head, int k){

        LinkedList.Node current = head;
        LinkedList.Node pre = null;
        if(head==null){
            return head;
        }

        int count=0;
       while (current!=null){

           count++; // Increment count to reach at removing pointer
           if(k==count){
               pre.next= current.next; // remove node
               count=0;
           }

           if(count!=0){ // Condition because we set counter to zero
               pre=current;
           }

           current=pre.next; // Move current ahead

       }

       return head;
    }


   /* public static LinkedList.Node removeKthNodeRecursively(LinkedList.Node head, int k){


        if(head==null){
            return null;
        }

        int count = 0;

        LinkedList.Node current = head;

            current=current.next;

        }

        if(current.next!=null)
            head=removeKthNodeRecursively(current.next.next,k);

        return head;
    }*/
}