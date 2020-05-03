
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: PartitionList.java, v 0.1 2020-04-26 22:57 rahul.kumar Exp $$
 */
public class PartitionList {


    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        LinkedList.Node a = new LinkedList.Node(1);
        LinkedList.Node b = new LinkedList.Node(4);
        LinkedList.Node c = new LinkedList.Node(3);
        LinkedList.Node d = new LinkedList.Node(2);
        LinkedList.Node f = new LinkedList.Node(5);
        LinkedList.Node g = new LinkedList.Node(2);


        linkedList.head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = f;
        f.next = g;

        linkedList.printLinkList(partition(linkedList.head,3));

    }


        public static LinkedList.Node partition(LinkedList.Node head, int x) {


         LinkedList.Node current = head;


            LinkedList.Node node = new LinkedList.Node(-1);
            LinkedList.Node temp = node;
            LinkedList.Node node1 = new LinkedList.Node(-1);
            LinkedList.Node temp1= node1;


         while (current!=null){



             if(current.data>=x){

                node1.next = new LinkedList.Node(current.data);
                node1 = node1.next;
             }

             else {
                node.next = new LinkedList.Node(current.data);
                 node= node.next;
             }


             current = current.next;
         }

         node.next = temp1.next;

         return temp.next;


    }
}