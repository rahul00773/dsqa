
package linkedlist;

/**
 * @author rahul.kumar
 * @version $Id: AddTwoNumbersLeetCode.java, v 0.1 2020-03-02 23:38 rahul.kumar Exp $$
 */
public class AddTwoNumbersLeetCode {

    public static void main(String[] args){


        LinkedList linkedList = new LinkedList();
        LinkedList.Node l1 = new LinkedList.Node(2);
        LinkedList.Node l11 = new LinkedList.Node(4);
        LinkedList.Node l111 = new LinkedList.Node(3);
        linkedList.head = l1;
        l1.next= l11;
        l11.next = l111;

        LinkedList linkedList1 = new LinkedList();
        LinkedList.Node l2 = new LinkedList.Node(2);
        LinkedList.Node l21 = new LinkedList.Node(4);
        LinkedList.Node l221 = new LinkedList.Node(3);
        linkedList1.head = l2;
        l2.next = l21;
        l2.next = l221;

        LinkedList.Node l3 = addTwoNumbers(l1,l2);
        linkedList.printLinkedList(l3);
    }


    public static LinkedList.Node addTwoNumbers(LinkedList.Node l1, LinkedList.Node l2){

        LinkedList.Node dummy = new LinkedList.Node(0);


        LinkedList.Node l3 = dummy;
        LinkedList.Node l1c = l1;
        LinkedList.Node l2c = l2;

        int carry =0;
        while(l1!=null || l2!=null){

            int l1_data;
            int l2_data;
            if(l1 != null){
                l1_data=l1.data;
            }
            else{
                l1_data=0;
            }

            if(l2!= null){
                l2_data=l2.data;
            }
            else{
                l2_data=0;
            }


            int currentSum = l1_data+l2_data +carry;

            carry = currentSum/10;
            int rem = currentSum%10;

            LinkedList.Node listN = new LinkedList.Node(rem);

            l3.next = listN;

            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;

            l3 = l3.next;
        }

        if(carry>0){

            LinkedList.Node newL = new LinkedList.Node(carry);
            l3.next = newL;
            l3 = l3.next;
        }

        return dummy.next;
    }
}