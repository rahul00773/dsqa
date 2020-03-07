
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: RotateList.java, v 0.1 2020-03-07 23:30 rahul.kumar Exp $$
 */
public class RotateList {


    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        LinkedList.Node n1 = new LinkedList.Node(1);

        LinkedList.Node n2 = new LinkedList.Node(2);

        LinkedList.Node n3 = new LinkedList.Node(3);

        LinkedList.Node n4 = new LinkedList.Node(4);

        LinkedList.Node n5 = new LinkedList.Node(5);

        linkedList.head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


        rotateRight(linkedList.head , 2);


    }


    public static LinkedList.Node rotateRight(LinkedList.Node head, int k) {

        LinkedList.Node currentNode = head;


        int length = 0;


        while(currentNode!=null){

            length++;
            currentNode = currentNode.next;
        }


        int firstHalf = length-k;
        int x = 0;

        LinkedList.Node pre = null;
        LinkedList.Node next = null;
        LinkedList.Node curr = head;
        while(x<firstHalf){

            next = curr.next;
            curr.next = pre;
            pre = curr ;
            curr = next;
            x++;

        }
        LinkedList.Node pre1= null;
        LinkedList.Node next1 = next;
        LinkedList.Node curr1 = curr;
        while(firstHalf<length){
            next1 = curr.next;
            curr1.next = pre;
            pre = curr1 ;
            curr1 = next1;
            firstHalf++;

        }


        return head;

    }
}