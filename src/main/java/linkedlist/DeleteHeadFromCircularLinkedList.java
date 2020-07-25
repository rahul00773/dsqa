package linkedlist;

public class DeleteHeadFromCircularLinkedList {

    public LinkedList.Node deleteAtHead(LinkedList.Node head) {


        while(head==null){

            return head;
        }


        LinkedList.Node temp =head;

        LinkedList.Node temp1=head;
        LinkedList.Node temp2= temp1;


        if(temp1.next==head){

            return null;
        }


        while(temp1.next!=temp){

            temp1=temp1.next;
        }

        temp1.next=head.next;

        return temp2.next;



    }
}
