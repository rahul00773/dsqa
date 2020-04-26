
package linkedlistpractice;

import com.sun.org.apache.bcel.internal.generic.LNEG;

/**
 * @author rahul.kumar
 * @version $Id: FindLengthOfLoopInLinkedList.java, v 0.1 2020-04-26 12:01 rahul.kumar Exp $$
 */
public class FindLengthOfLoopInLinkedList {


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

        System.out.println(getLengthOfLinkedList(linkedList.head));

    }

    public static int getLengthOfLinkedList(LinkedList.Node head){


        LinkedList.Node slow =head;

        LinkedList.Node fast = head;

        int length =-1;

        while (slow!=null || fast.next!=null || fast!=null)
        {

            slow =slow.next;
            fast=fast.next.next;

            if(slow==fast){

                return count(slow);



            }
        }

        return length;
    }


    public static int count(LinkedList.Node slow){

        int res =1;

        LinkedList.Node temp = slow;

        while (temp.next!=slow){
            res++;
            temp=temp.next;
        }

        return res;
    }
}