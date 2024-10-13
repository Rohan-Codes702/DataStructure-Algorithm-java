package LinkedListDataStructure;

class Node9
{
    int data;
    Node9 next;

Node9(int data)
{
    this.data=data;
    this.next=null;
}

public void setNext(Node9 nextNode)
{
    this.next=nextNode;
}

public void printlist(Node9 head)
{
    Node9 temp=head;
    do
    {
        System.out.print(temp.data+"=>");
        temp=temp.next;
    }
    while (temp.next!=head);
    System.out.println("NULL");
}

public Node9 addfirst(Node9 head,int data)
{
    Node9 newnode=new Node9(data);
    Node9 temp=head;

    do
    {
        temp=temp.next;
    }

    while (temp.next!=head);
    temp.next=newnode;
    newnode.next=head;
    head=newnode;
    return head;
}

public Node9 addatindex(Node9 head,int data,int index)
{
    int i=1;
    Node9 newNode=new Node9(data);
    Node9 temp1=head;
    Node9 temp2=head.next;

    while (i<index-1)
    {
        temp1=temp1.next;
        temp2=temp2.next;
        i++;
    }
    temp1.next=newNode;
    newNode.next=temp2;
    return  head;

}

public Node9 addlast(Node9 head,int data)
{
    Node9 newNode =new Node9(data);
    Node9 temp=head;

    do
    {
     temp=temp.next;
    }

    while (temp.next!=head);
    temp.next=newNode;
    newNode.next=head;
    return head;

}

public Node9 delfirst(Node9 head)
{
    Node9 temp=head;
    do
    {
        temp=temp.next;
    }
    while (temp.next!=head);
    temp.next=head.next;
    head=head.next;
    return head;

}

public Node9 deltindex(Node9 head,int index)
{
    Node9 temp1=head;
    Node9 temp2=head.next;
    int i=1;

    while (i<index)
    {
        temp1=temp1.next;
        temp2=temp2.next;
        i++;
    }
    temp1.next=temp2.next;
    return head;
}

public Node9 dellast(Node9 head)
{
    Node9 temp1=head;
    Node9 temp2=head.next;

    while (temp2.next!=head)
    {
        temp1=temp1.next;
        temp2=temp2.next;
    }

    temp1.next=temp2.next;
    return head;
}

}
public class Circularlloperation {
    public static void main(String[] args) {
        Node9 n1=new Node9(2);
        Node9 n2=new Node9(3);
        Node9 n3=new Node9(4);
        Node9 n4=new Node9(5);
        Node9 n5=new Node9(6);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n1);

        n1.printlist(n1);

        n1=n1.addfirst(n1,1);
        n1.printlist(n1);

        n1=n1.addatindex(n1,22,2);
        n1.printlist(n1);

        n1=n1.addlast(n1,6);
        n1.printlist(n1);

        n1=n1.delfirst(n1);
        n1.printlist(n1);

        n1=n1.deltindex(n1,1);
        n1.printlist(n1);

        n1=n1.dellast(n1);
        n1.printlist(n1);
    }
}
