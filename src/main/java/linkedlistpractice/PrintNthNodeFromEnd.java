
package linkedlistpractice;

/**
 * @author rahul.kumar
 * @version $Id: PrintNthNodeFromEnd.java, v 0.1 2020-03-28 17:10 rahul.kumar Exp $$
 */
public class PrintNthNodeFromEnd {

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

        System.out.println("last element from linkedList" + "  "+getNthNode(linkedList.head,10));


    }

    public static int getNthNode(LinkedList.Node head, int x){


        LinkedList.Node slow = head;
        LinkedList.Node fast = head;

int count=1;
        for(int i =0; fast!=null && i<x; i++){

            fast= fast.next;
            count ++;
        }

        if(x>count)
            return -1;

        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow.data;
    }


}