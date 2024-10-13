package LinkedListDataStructure;


class Node8 {
    String data;
    Node8 next;

    Node8(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node8 next) {
        this.next = next;
    }

    public void printList(Node8 head) {

        Node8 temp = head;

        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("NULL");

    }
}
public class CircularLinkedList{
    public static void main(String[] args) {

        Node8 n1=new Node8("shreyash");
        Node8 n2=new Node8("yash");
        Node8 n3=new Node8("shree");
        Node8 n4=new Node8("shreya");
        Node8 n5=new Node8("Rohan");
        Node8 n6=new Node8("Nitish");
        Node8 n7=new Node8("Pratik");

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        n7.setNext(n1);

        n1.printList(n1);

    }
}




