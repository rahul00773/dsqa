
package linkedlistpractice;

import java.util.Stack;

/**
 * @author rahul.kumar
 * @version $Id: CheckIfListIsPalindrom.java, v 0.1 2020-03-28 22:27 rahul.kumar Exp $$
 */
public class CheckIfListIsPalindrom {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        LinkedList.Node a = new LinkedList.Node(0);
        LinkedList.Node b = new LinkedList.Node(1);
        LinkedList.Node c = new LinkedList.Node(2);
        LinkedList.Node d = new LinkedList.Node(2);
        LinkedList.Node f = new LinkedList.Node(1);
        LinkedList.Node g = new LinkedList.Node(1);

        linkedList.head = a;
        a.next = b;
        b.next =c;
        c.next =d;
        d.next =f;
        f.next=g;

        System.out.println(checkForPalindrome(linkedList.head));

    }

    public static boolean checkForPalindrome(LinkedList.Node head){

        Stack<Integer> stack = new Stack<Integer>();

        LinkedList.Node temp = head;

        while (temp!=null){

            stack.push(temp.data);
            temp= temp.next;
        }

        while (head!=null){

            if(head.data!=stack.pop()){
                return false;
            }
            head = head.next;
        }

        return true;
    }


    public static boolean checkForPalindromeUsingReverse(LinkedList.Node head){

        LinkedList.Node slow = head;
        LinkedList.Node fast = head.next;
        LinkedList.Node mid = null;

        LinkedList.Node secondHalf;
        LinkedList.Node pre = head;

        if(head!=null && head.next!=null){
        while (fast!=null && fast.next!=null){

            fast = fast.next.next;
            pre=slow;
            slow = slow.next;


        }

        if(fast!=null){
            mid = slow;
            slow = slow.next;

        }

        secondHalf = slow;

        pre.next =null;

        ReverseALinkedList.reverseLinkedList(secondHalf);

        }

return false;
    }
}