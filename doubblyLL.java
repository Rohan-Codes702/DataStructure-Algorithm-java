package LinkedListDataStructure;

class Node
{
    int data;
    Node next;
    Node pre;

    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.pre=null;
    }

    public void setNext(Node nextNode)
    {
        this.next = nextNode;
    }

    public void setPre(Node preNode)
    {
        this.pre = preNode;
    }

    public void print(Node head)
    {
        while (head!=null)
        {
            System.out.print(head.data+"=>");
            head=head.next;
        }
        System.out.println("NULL");
    }
    public Node addfirst(Node head,int data)
    {
        Node Newnode=new Node(data);
        Newnode.setNext(head);
        head.setPre(Newnode);
        head=Newnode;
        return head;
    }

    public Node addindex(Node head,int data,int index)
    {
        Node NewNode=new Node(data);
        Node temp1=head;
        Node temp2=head.next;
        int i=1;

        while (i<index-1)
        {
            temp1=temp1.next;
            temp2=temp2.next;
            i++;
        }
          temp1.next=NewNode;
          NewNode.pre=temp1;

          NewNode.next=temp2;
          temp2.pre=NewNode;


          return head;
    }
    public Node addlast(Node tail,int data)
    {
        Node NewNode=new Node(data);

        tail.setNext(NewNode);
        NewNode.setPre(tail);

        tail=NewNode;

        return tail;
    }

    public Node delfirst(Node head)
    {
        Node temp=head.next;
        temp.setPre(head.pre);
        head=temp;
        return head;
    }

    public Node delindex(Node head,int index)
    {
        Node temp1=head;
        Node temp2=head.next;
        int i=1;

        while (i<index)
        {
            temp1=temp1.next;
            temp2=temp2.next;
            i++;
        }
        temp1.setNext(temp2.next);
        temp2.setPre(temp1);
        return head;
    }

    public Node dellast(Node tail)
    {
        Node temp=tail.pre;
        temp.next=tail.next;
        tail=temp;
        return tail;
    }
}

public class doubblyLL {
    public static void main(String[] args)
    {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);

        n1.setNext(n2);
        n2.setPre(n1);

        n2.setNext(n3);
        n3.setPre(n2);

        n3.setNext(n4);
        n4.setPre(n3);

        n1.print(n1);

        n1=n1.addfirst(n1,0);
        n1.print(n1);

        n1=n1.addindex(n1,5,3);
        n1.print(n1);

        n1=n1.addlast(n1,6);
        n1.print(n1);

        n1=n1.delfirst(n1);
        n1.print(n1);

        n1=n1.delindex(n1,3);
        n1.print(n1);

        n1=n1.dellast(n1);
        n1.print(n1);

    }
}
