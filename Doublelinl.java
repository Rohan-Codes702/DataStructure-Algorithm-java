package LinkedListDataStructure;

class Node7 {
    int data;
    Node7 next;
    Node7 prev;

    Node7(int data) {
        this.next = null;
        this.data = data;
        this.prev = null;
    }

    public void setNext(Node7 nextNode)
    {
        this.next = nextNode;
    }

    public void setPrev(Node7 prevNode)
    {
        this.prev = prevNode;
    }

    public void printlistbyhead(Node7 head) {
        while (head != null) {
            System.out.print(head.data + "=>");
            head = head.next;
        }
        System.out.println("NULL");

    }

    public void printlistbytail(Node7 tail) {
        while (tail != null) {
            System.out.print(tail.data + "=>");
            tail = tail.next;
        }
        System.out.println("NULL");
    }

    public Node7 addfirst(Node7 head, int data) {
        Node7 newNode = new Node7(data);
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        return head;
    }

    public Node7 addindex(Node7 head, int data, int index) {
        Node7 newNode = new Node7(data);
        int i = 1;
        Node7 temp1 = head;
        Node7 temp2 = head.next;

        while (i < index - 1) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            i++;
        }
        temp1.next = newNode;
        newNode.prev = temp1;

        newNode.next = temp2;
        temp2.prev = newNode;

        return head;
    }

    public Node7 addlast(Node7 tail, int data) {
        Node7 newNode = new Node7(data);
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
        return tail;

    }

    /*public Node7 delfirst(Node7 head)
    {
        Node7 temp=head.next;
        temp.setPrev(head.prev);
        head=temp;
        return head;
    }*/

    public Node7 delindex(Node7 head,int index)
    {
        Node7 temp1=head;
        Node7 temp2=head.next;
        int i=1;

        while (i<index)
        {
            temp1=temp1.next;
            temp2=temp2.next;
            i++;
        }
        temp1.setNext(temp2.next);
        temp2.setPrev(temp1);
        return head;
    }
}
public class Doublelinl {
    public static void main(String[] args) {

        Node7 n1 = new Node7(2);
        Node7 n2 = new Node7(3);
        Node7 n3 = new Node7(4);
        Node7 n4 = new Node7(5);

        n1.setNext(n2);
        n2.setPrev(n1);

        n2.setNext(n3);
        n3.setPrev(n2);

        n3.setNext(n4);
        n4.setPrev(n3);

        n1.printlistbyhead(n1);

        n1 = n1.addfirst(n1, 1);
        n1.printlistbyhead(n1);

        n1 = n1.addindex(n1, 22, 2);
        n1.printlistbyhead(n1);

        n1=n1.addlast(n1,6);
        n1.printlistbyhead(n1);

        n4=n4.addlast(n4,6);
        n4.printlistbytail(n4);

        n1=n1.delindex(n1,2);
        n1.printlistbyhead(n1);


    }
}
