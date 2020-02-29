
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: CheckIfLinkedListIsPalindrome.java, v 0.1 2020-03-01 01:54 rahul.kumar Exp $$
 */
public class CheckIfLinkedListIsPalindrome {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        LinkedList.Node first = new LinkedList.Node(1);
        LinkedList.Node sec = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(2);
        LinkedList.Node fourth = new LinkedList.Node(2);
        LinkedList.Node fifth = new LinkedList.Node(1);

        linkedList.head = first;
        first.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next =fifth;

        System.out.println(isPalindrome(linkedList.head));




    }

    public static  boolean isPalindrome(LinkedList.Node head){


        boolean ans  =true;

        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        LinkedList.Node start = null;
        while(true){
            fast = fast.next.next;
            if(fast ==null){

                start = slow.next;
                break;
            }
             if(fast.next == null){
                start = slow.next.next;
                break;
            }

            slow = slow.next;


        }

        slow.next = null;

        LinkedList.Node pre = null;

        LinkedList.Node curr = start;
        LinkedList.Node next = null;
        while(curr!=null){

            next = curr.next;
            curr.next  =pre;
            pre = curr;
            curr  = next;

        }

        LinkedList.Node a = head;
        while(a!=null && start!=null){

                if(a.data!=start.data){
                ans = false;
            }

            a = a.next;
            start = start.next;
        }

        return ans;
    }
}