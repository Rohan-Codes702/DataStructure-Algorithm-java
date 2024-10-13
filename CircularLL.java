package LinkedListDataStructure;

class Node10
{
    String data;
    Node10 next;

Node10(String data)
{
    this.next=null;
    this.data=data;
}

public void setNext(Node10 nextNode)
{
    this.next=nextNode;
}

public void prinlst(Node10 head)
{
    Node10 temp=head;
    do {
        System.out.print(temp.data+"=>");
        temp=temp.next;
    }

    while (temp.next!=head);
    System.out.println("NULL");
}

public Node10 addfirst(Node10 head, String data)
{
    Node10 newNode=new Node10(data);
    Node10 temp=head;
    do
    {
        temp=temp.next;

    }

    while (temp.next!=head);
    temp.next=newNode;
    newNode.next=head;
    head=newNode;
    return head;
}

public Node10 addlast(Node10 head,String data)
{
    Node10 newNode=new Node10(data);
    Node10 temp=head;

    do
    {
        temp=temp.next;

    }

    while (temp.next!=head);
    temp.next=newNode;
    newNode.next=head;
    return head;
}
public Node10 addindex(Node10 head,String data,int index) {

    Node10 newNode = new Node10(data);
    Node10 temp1 = head;
    Node10 temp2=head.next;
    int i=1;

    while (i<index-1)

    {
        temp1=temp1.next;
        temp2=temp2.next;
        i++;
    }

    temp1.next=newNode;
    newNode.next=temp2;
    return head;
}

  public  Node10 delfirst(Node10 head)

  {
      Node10 temp=head;

      do
      {
       temp=temp.next;
      }

      while (temp.next!=head);
      head=head.next;
      temp.next=head;
      return head;
      }

      public Node10 dellast(Node10 head)

      {
          Node10 temp1=head;
          Node10 temp2=head.next;

          do
          {
           temp1=temp1.next;
           temp2=temp2.next;
          }

          while (temp2.next!=head);

              temp1.next=temp2.next;
              return head;
          }

          public Node10 delindex(Node10 head,int index)
          {
              Node10 temp1=head;
              Node10 temp2=head.next;
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
      }

  public class CircularLL {
    public static void main(String[] args) {

        Node10 n1=new Node10("a");
        Node10 n2=new Node10("b");
        Node10 n3=new Node10("c");
        Node10 n4=new Node10("d");
        Node10 n5=new Node10("e");
        Node10 n6=new Node10("f");
        Node10 n7=new Node10("g");

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        n7.setNext(n1);

        System.out.println("Circular list is:\n");
        n1.prinlst(n1);

        System.out.println("Add element at first:\n");
        n1=n1.addfirst(n1,"first");
        n1.prinlst(n1);


        System.out.println("Add element at last:\n");
        n1=n1.addlast(n1,"last");
        n1.prinlst(n1);

        System.out.println("Add element at index:\n");
        n1=n1.addindex(n1, "index",3);
        n1.prinlst(n1);

        System.out.println("Delete first elemnet:\n");
        n1=n1.delfirst(n1);
        n1.prinlst(n1);

        System.out.println("Delete last elemnet:\n");
        n1=n1.dellast(n1);
        n1.prinlst(n1);

        System.out.println("Delete index elemnet:\n");
        n1=n1.delindex(n1,2);
        n1.prinlst(n1);


    }
}