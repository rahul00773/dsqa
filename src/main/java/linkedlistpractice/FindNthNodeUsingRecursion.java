
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: FindNthNodeUsingRecursion.java, v 0.1 2020-04-18 13:12 rahul.kumar Exp $$
 */
public class FindNthNodeUsingRecursion {

    int global_variable=1;

    static int  count;
    static int data;

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

        getNthNodeUsingRecursion(linkedList.head, 2);

    }

    public static void getNthNodeUsingRecursion(LinkedList.Node head, int k){

        LinkedList.Node nth_last = new LinkedList.Node(0);
        count = 0;

        findNthFromLast(head, k, nth_last);

        if (nth_last != null)
            System.out.println("Nth node from last is: " +
                    data);
        else
            System.out.println("Node does not exists");


    }

    public static void findNthFromLast(LinkedList.Node head, int k,LinkedList.Node lastNode){

        if (head == null)
            return;

        findNthFromLast(head.next, k, lastNode);

        count = count + 1;
        if(count==k){

            data= head.data;
        }

    }
}