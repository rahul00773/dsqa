
package linkedlist;

import java.math.BigInteger;

/**
 * @author rahul.kumar
 * @version $Id: AddTwoNumbers.java, v 0.1 2020-03-26 22:55 rahul.kumar Exp $$
 */
public class AddTwoNumbers {

    public static void main(String[] args){


        LinkedList linkedList = new LinkedList();
        LinkedList.Node first = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);
        LinkedList.Node fourth = new LinkedList.Node(4);
        LinkedList.Node fifth = new LinkedList.Node(5);
        LinkedList.Node sixth = new LinkedList.Node(6);



        linkedList.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;


        LinkedList linkedList1 = new LinkedList();

        LinkedList.Node first1 = new LinkedList.Node(1);
        LinkedList.Node second2 = new LinkedList.Node(2);
        LinkedList.Node third2 = new LinkedList.Node(4);
        LinkedList.Node fourth3 = new LinkedList.Node(8);
        LinkedList.Node fifth4 = new LinkedList.Node(10);
        LinkedList.Node sixth5 = new LinkedList.Node(12);


        linkedList1.head = first1;
        sixth.next = second2;
        second2.next = third2;
        third2.next = fourth3;
        fourth3.next = fifth4;
       // fifth4.next = sixth5;

        linkedList.printLinkedList(addTwoNumbers(linkedList.head,linkedList1.head));

    }

    public static LinkedList.Node addTwoNumbers(LinkedList.Node l1, LinkedList.Node l2){

        String s ="";
        String s1 = "";

        LinkedList.Node  first = l1;
        LinkedList.Node  second = l2;

        while(first!=null){

          s=   s.concat(String.valueOf(first.data));
            first= first.next;
        }

        while(second!=null){

           s1= s1.concat(String.valueOf(second.data));
            second= second.next;
        }

        BigInteger a
                = new BigInteger(s);
        BigInteger b
                = new BigInteger(s1);

        // Using add() method
       String sum = String.valueOf(a.add(b));


       // String sum = String.valueOf(Long.parseLong(s)+Long.parseLong(s1));

        String[] s2 = sum.split("");

        LinkedList.Node  n1  = new LinkedList.Node (0);
        LinkedList.Node  q = n1;
        for(int i =0; i<s2.length; i++){

            int s3 = Integer.parseInt(s2[i]);
            LinkedList.Node a1 = new LinkedList.Node(s3);
            q.next = a1;
            q.next.next=null;
            q = q.next;
        }

        return n1.next;
    }
}